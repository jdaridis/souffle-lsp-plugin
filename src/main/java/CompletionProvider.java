import org.eclipse.lsp4j.*;
import org.eclipse.lsp4j.jsonrpc.messages.Either;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CompletionProvider {

    private final String[] directives = new String[]{
            ".decl",
            ".output",
            ".input",
            ".type",
            ".comp",
            ".init",
            ".printsize",
            ".functor",
            ".limitsize",
            ".override",
            ".pragma",
            ".plan",
            ".symboltype",
            ".numbertype",
    };

    static boolean inArgs = false;
    private final CompletionParams params;
    private final String documentUri;
    private final Position position;

    public CompletionProvider(CompletionParams params) {
        this.params = params;
        this.documentUri = params.getTextDocument().getUri();
        this.position = params.getPosition();
    }

    public Either<List<CompletionItem>, CompletionList> getCompletions() {
        Range range = new Range(position, position);
        List<CompletionItem> completionItems = new ArrayList<CompletionItem>();
//        if( params.getContext().getTriggerCharacter() != null && params.getContext().getTriggerCharacter().equals("(")){
//            inArgs = true;
//            return Either.forLeft(completionItems);
//        }
//
        Set<String> items = new HashSet<>();
        SouffleContext context = ProjectContext.getInstance().getContext(this.documentUri, range);
        System.err.println("Trigger " + params.getContext());
        boolean directiveTrigger = params.getContext().getTriggerCharacter() != null && params.getContext().getTriggerCharacter().equals(".");
        if(directiveTrigger){
            for (String directive : directives) {
                CompletionItem completionItem = new CompletionItem();
                completionItem.setLabel(directive);
                completionItem.setInsertText(directive.substring(1));
                completionItem.setKind(CompletionItemKind.Keyword);
                completionItems.add(completionItem);
                if (directive.equals(".symboltype") || directive.equals(".numbertype")) {
                    completionItem.setTags(List.of(CompletionItemTag.Deprecated));
                }
            }
        }

        for (SouffleContext documentContext : ProjectContext.getInstance().getDocuments().values()) {
            findInContext(completionItems, items, documentContext);
        }
        if(context != null){
            findInContext(completionItems, items, context);
        }

        LSClientLogger.getInstance().logMessage("Operation '" + "text/completion");

        return Either.forLeft(completionItems);
    }

    private void findInContext(List<CompletionItem> completionItems, Set<String> items, SouffleContext documentContext) {
        for (List<SouffleSymbol> symbols : documentContext.getScope().values()) {
            for (SouffleSymbol name : symbols) {
                if(!items.contains(name.toString())){
                    items.add(name.toString());
                    CompletionItem completionItem = new CompletionItem();
                    completionItem.setLabel(name.toString());
                    completionItem.setInsertText(name.getName());
                    switch (name.getKind()) {
                        case TYPE_DECL:
                            completionItem.setKind(CompletionItemKind.Interface);
                            completionItems.add(completionItem);
                            break;
                        case RELATION_DECL:
                            if(params.getContext().getTriggerCharacter() != null &&
                                    params.getContext().getTriggerCharacter().equals(":")){
                                break;
                            } else {
                                completionItem.setKind(CompletionItemKind.Method);
                                completionItems.add(completionItem);
                                if(name.getDocumentation() != null){
                                    completionItem.setDocumentation(name.getDocumentation());
                                }
                            }
//                            completionItem.setLabel();
                            break;
                    }
                }


            }
        }
    }
}