import org.eclipse.lsp4j.*;

import java.util.ArrayList;
import java.util.List;

public class SignatureHelpProvider {
    public SignatureHelpProvider() {
    }

    public SignatureHelp getSignatureHelp(SignatureHelpParams params) {
        int activeParam = 0;
        if (params.getContext().isRetrigger()) {
            activeParam = params.getContext().getActiveSignatureHelp().getActiveParameter();
            if (params.getContext().getTriggerKind() == SignatureHelpTriggerKind.TriggerCharacter) {
                activeParam++;
            }
        }
        SouffleSymbol currentSymbol = ProjectContext.getInstance().getCurrentSymbol();
        SignatureHelp signatureHelp = new SignatureHelp();
        SignatureInformation signatureInformation = new SignatureInformation();
        if (currentSymbol != null && currentSymbol.getKind() == SouffleSymbolType.RELATION_DECL) {
            SouffleRelation relation = (SouffleRelation) currentSymbol;
            List<ParameterInformation> parameterInformations = new ArrayList<ParameterInformation>();
            for (SouffleVariable variable : relation.getArgs()) {
                ParameterInformation parameterInformation = new ParameterInformation();
                parameterInformation.setLabel(variable.toString());
                parameterInformations.add(parameterInformation);
            }
            signatureInformation.setParameters(parameterInformations);
            signatureInformation.setLabel(currentSymbol.toString());
            signatureHelp.setSignatures(List.of(signatureInformation));
            if (params.getContext().isRetrigger()) {
                signatureHelp.setActiveParameter(activeParam);
            }
            return signatureHelp;
        }
        return null;
    }
}