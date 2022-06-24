import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.eclipse.lsp4j.*;
import parsing.SouffleCurrentTokenError;
import parsing.Utils;
import parsing.souffle.SouffleLexer;
import parsing.souffle.SouffleParser;
import parsing.symbols.*;

import java.util.*;

public class SignatureHelpProvider {
    public SignatureHelpProvider() {
    }

    public SignatureHelp getSignatureHelp(SignatureHelpParams params) {
        Range cursor = Utils.positionToRange(params.getPosition());
        SouffleContext context = SouffleProjectContext.getInstance().getContext(params.getTextDocument().getUri(), cursor);

        int activeParam = 0;
        if (params.getContext().isRetrigger()) {
            activeParam = params.getContext().getActiveSignatureHelp().getActiveParameter();
            if (params.getContext().getTriggerKind() == SignatureHelpTriggerKind.TriggerCharacter) {
                activeParam++;
            }
        }

        SignatureHelp signatureHelp = new SignatureHelp();
        List<SignatureInformation> signatureInformationList = new ArrayList<>();
        Set<String> items = new HashSet<>();
        String currentToken = getSouffleCurrentTokenError(cursor).getCurrentToken();
        for (Map.Entry<String, SouffleContext> documentContext : SouffleProjectContext.getInstance().getDocuments().entrySet()) {
            findInScope(documentContext.getValue().getScope(), signatureInformationList, signatureHelp, currentToken, items);
        }
        if(context != null){
            if(context.getParent() != null && context.getParent().getKind() == SouffleContextType.COMPONENT){
                context = context.getParent();
            }
            if(context.getKind() == SouffleContextType.COMPONENT){
                findInScope(((SouffleComponent)context.getContextSymbols().get(0)).getScope(), signatureInformationList, signatureHelp, currentToken, items);
            }
        }

        if (params.getContext().isRetrigger()) {
            signatureHelp.setActiveParameter(activeParam);
        }
        return signatureHelp;

    }

    private void findInScope(Map<String, List<SouffleSymbol>> scope, List<SignatureInformation> signatureInformationList, SignatureHelp signatureHelp, String currentToken, Set<String> items) {
        List<SouffleSymbol> contextSymbols = scope.get(currentToken);
        Optional<List<SouffleSymbol>> symbolList = Optional.ofNullable(contextSymbols);
        if(symbolList.isPresent()){
            List<SouffleSymbol> symbols = symbolList.get();
            for(SouffleSymbol symbol: symbols){
                if(!items.contains(symbol.toString())){
                    if(symbol.getKind() == SouffleSymbolType.RELATION_DECL){
                        items.add(symbol.toString());
                        SignatureInformation signatureInformation = new SignatureInformation();
                        SouffleRelation relation = (SouffleRelation) symbol;
                        List<ParameterInformation> parameterInformations = new ArrayList<>();
                        for (SouffleVariable variable : relation.getArgs()) {
                            ParameterInformation parameterInformation = new ParameterInformation();
                            parameterInformation.setLabel(variable.toString());
                            parameterInformations.add(parameterInformation);
                        }
                        signatureInformation.setParameters(parameterInformations);
                        signatureInformation.setLabel(symbol.toString());
                        if(relation.getDocumentation() != null){
                            MarkupContent content = new MarkupContent();
                            content.setKind(MarkupKind.MARKDOWN);
                            content.setValue(relation.getDocumentation());
                            signatureInformation.setDocumentation(content);
                        }
                        signatureInformationList.add(signatureInformation);
                    }
                }
            }
            signatureHelp.setSignatures(signatureInformationList);
        }
    }

    private SouffleCurrentTokenError getSouffleCurrentTokenError(Range cursor) {
        CharStream input = CharStreams.fromString(SouffleProjectContext.getInstance().getChangedText());
        SouffleLexer souffleLexer = new SouffleLexer(input, SouffleProjectContext.getInstance().defines);
        CommonTokenStream tokens = new CommonTokenStream(souffleLexer);
        SouffleParser souffleParser = new SouffleParser(tokens);
        SouffleCurrentTokenError errorHandler = new SouffleCurrentTokenError(cursor);
        souffleParser.setErrorHandler(errorHandler);
        souffleParser.program();
        return errorHandler;
    }
}