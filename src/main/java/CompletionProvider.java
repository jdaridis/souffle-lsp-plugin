import org.eclipse.lsp4j.*;
import org.eclipse.lsp4j.jsonrpc.messages.Either;
import parsing.Utils;
import parsing.symbols.*;

import java.util.*;
enum CompletionState{
    IDLE,
    IN_ARGS
}
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

    static CompletionState state = CompletionState.IDLE;
    private final CompletionParams params;
    private final String documentUri;
    private final Position position;

    public CompletionProvider(CompletionParams params) {
        this.params = params;
        this.documentUri = params.getTextDocument().getUri();
        this.position = params.getPosition();
    }

    public Either<List<CompletionItem>, CompletionList> getCompletions() {
        Range range = Utils.positionToRange(position);
        List<CompletionItem> completionItems = new ArrayList<CompletionItem>();
        if( params.getContext().getTriggerCharacter() != null && params.getContext().getTriggerCharacter().equals("(")){
            state = CompletionState.IN_ARGS;
            return Either.forLeft(completionItems);
        }
        switch (state){
            case IDLE:
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
            case IN_ARGS:
                if( params.getContext().getTriggerCharacter() != null &&
                        (params.getContext().getTriggerCharacter().equals(")") || params.getContext().getTriggerCharacter().equals("."))){
                    state = CompletionState.IDLE;
                }
                return Either.forLeft(completionItems);
        }
        return null;
    }

    private void findInScope(Map<String, List<SouffleSymbol>> scope, List<CompletionItem> completionItems, Set<String> items) {
        for (List<SouffleSymbol> symbols : scope.values()) {
            for (SouffleSymbol symbol : symbols) {
                if(!items.contains(symbol.toString())){
                    items.add(symbol.toString());
                    CompletionItem completionItem = new CompletionItem();
                    completionItem.setLabel(symbol.toString());
                    completionItem.setInsertText(symbol.getName());
                    switch (symbol.getKind()) {
                        case TYPE_DECL:
                            completionItem.setKind(CompletionItemKind.Interface);
                            completionItems.add(completionItem);
                            break;
                        case RELATION_DECL:
                            addCompletionItem(completionItem, symbol, CompletionItemKind.Method, completionItems);
                            break;
                        case COMPONENT_INIT:
                            addCompletionItem(completionItem, symbol, CompletionItemKind.Variable, completionItems);
                            break;
                        case COMPONENT_DECL:
                            addCompletionItem(completionItem, symbol, CompletionItemKind.Class, completionItems);
                            break;
                    }
                }
            }
        }
    }

    private void addCompletionItem(CompletionItem completionItem, SouffleSymbol symbol, CompletionItemKind itemKind, List<CompletionItem> completionItems) {
        String triggerCharacter = params.getContext().getTriggerCharacter();
        if (triggerCharacter == null || !triggerCharacter.equals(":")) {
            completionItem.setKind(itemKind);
            completionItems.add(completionItem);
            if(symbol.getDocumentation() != null){
                completionItem.setDocumentation(symbol.getDocumentation());
            }
        }
    }
}