import org.eclipse.lsp4j.*;
import org.eclipse.lsp4j.jsonrpc.messages.Either;

import java.util.*;

public class CompletionProvider {

    private static final String[] directives = new String[]{
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
        SouffleContext context = SouffleProjectContext.getInstance().getContext(this.documentUri, range);
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

        for (SouffleContext documentContext : SouffleProjectContext.getInstance().getDocuments().values()) {
            findInScope(documentContext.getScope(), completionItems, items);
        }
        if(context != null){
            if(context.getParent() != null && context.getParent().getKind() == SouffleContextType.COMPONENT){
                context = context.getParent();
            }
            if(context.getKind() == SouffleContextType.COMPONENT){
                findInScope(((SouffleComponent)context.getContextSymbols().get(0)).getScope(), completionItems, items);
            }
        }

        LSClientLogger.getInstance().logMessage("Operation '" + "text/completion");

        return Either.forLeft(completionItems);
    }

    private void findInScope(Map<String, List<SouffleSymbol>> scope, List<CompletionItem> completionItems, Set<String> items) {
        for (List<SouffleSymbol> symbols : scope.values()) {
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
                            break;
                    }
                }


            }
        }
    }
}