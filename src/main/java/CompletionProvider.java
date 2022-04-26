import org.eclipse.lsp4j.*;
import org.eclipse.lsp4j.jsonrpc.messages.Either;

import java.util.ArrayList;
import java.util.List;

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
    private final CompletionParams params;
    private String documentUri;
    private Position position;

    public CompletionProvider(CompletionParams params) {
        this.params = params;
        this.documentUri = params.getTextDocument().getUri();
        this.position = params.getPosition();
    }

    public Either<List<CompletionItem>, CompletionList> getCompletions() {
        Range range = new Range(position, position);
        List<CompletionItem> completionItems = new ArrayList<CompletionItem>();
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
            for (List<SouffleSymbol> symbols : documentContext.getScope().values()) {
                for (SouffleSymbol name : symbols) {
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

//            Command command = new Command();
//            command.setCommand("editor.action.triggerParameterHints");
//            completionItem.setCommand(command);

//            CompletionList

        LSClientLogger.getInstance().logMessage("Operation '" + "text/completion");

        return Either.forLeft(completionItems);
    }
}