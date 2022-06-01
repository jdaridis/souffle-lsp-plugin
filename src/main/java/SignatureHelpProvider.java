import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.eclipse.lsp4j.*;
import visitors.SouffleLexer;
import visitors.SouffleParser;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class SignatureHelpProvider {
    public SignatureHelpProvider() {
    }

    public SignatureHelp getSignatureHelp(SignatureHelpParams params) {
        Range cursor = new Range(params.getPosition(), params.getPosition());
        SouffleContext context = ProjectContext.getInstance().getContext(params.getTextDocument().getUri(), cursor);

        int activeParam = 0;
        if (params.getContext().isRetrigger()) {
            activeParam = params.getContext().getActiveSignatureHelp().getActiveParameter();
            if (params.getContext().getTriggerKind() == SignatureHelpTriggerKind.TriggerCharacter) {
                activeParam++;
            }
        }

        SignatureHelp signatureHelp = new SignatureHelp();
        List<SignatureInformation> signatureInformationList = new ArrayList<>();
        String currentToken = getSouffleCurrentTokenError(cursor).getCurrentToken();
        for (Map.Entry<String, SouffleContext> documentContext : ProjectContext.getInstance().getDocuments().entrySet()) {
            findInContext(documentContext.getValue(), signatureInformationList, signatureHelp, currentToken);
        }
        if(context != null){
            findInContext(context, signatureInformationList, signatureHelp, currentToken);
        }

        if (params.getContext().isRetrigger()) {
            signatureHelp.setActiveParameter(activeParam);
        }
        return signatureHelp;

    }

    private void findInContext(SouffleContext documentContext, List<SignatureInformation> signatureInformationList, SignatureHelp signatureHelp, String currentToken) {
        Optional<List<SouffleSymbol>> symbolList = Optional.ofNullable(documentContext.getSymbols(currentToken));
        if(symbolList.isPresent()){
            List<SouffleSymbol> symbols = symbolList.get();
            for(SouffleSymbol symbol: symbols){
                if(symbol.getKind() == SouffleSymbolType.RELATION_DECL){
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
            signatureHelp.setSignatures(signatureInformationList);
        }
    }

    private SouffleCurrentTokenError getSouffleCurrentTokenError(Range cursor) {
        CharStream input = CharStreams.fromString(ProjectContext.getInstance().getChangedText());
//        preprocessInput(input);
        SouffleLexer souffleLexer = new SouffleLexer(input, ProjectContext.getInstance().defines);
        CommonTokenStream tokens = new CommonTokenStream(souffleLexer);
        SouffleParser souffleParser = new SouffleParser(tokens);
        SouffleCurrentTokenError errorHandler = new SouffleCurrentTokenError(cursor);
        souffleParser.setErrorHandler(errorHandler);
        souffleParser.program();
        return errorHandler;
    }
}