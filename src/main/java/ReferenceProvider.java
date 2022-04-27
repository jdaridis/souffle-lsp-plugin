import org.eclipse.lsp4j.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class ReferenceProvider {

    public ReferenceProvider() {
    }

    public List<Location> getReferences(TextDocumentPositionAndWorkDoneProgressParams params) {
        Range cursor = new Range(params.getPosition(), params.getPosition());
        SouffleContext context = ProjectContext.getInstance().getContext(params.getTextDocument().getUri(), cursor);
        List<Location> references = new ArrayList<Location>();
        if (context != null) {
            SouffleSymbol currentSymbol = context.getSymbol(cursor);
            for (Map.Entry<String, SouffleContext> documentContext : ProjectContext.getInstance().getDocuments().entrySet()) {
                Optional.ofNullable(documentContext.getValue()
                                .getSymbols(currentSymbol.getName()))
                        .ifPresent(souffleSymbols -> souffleSymbols.forEach(symbol -> references.add(new Location(documentContext.getKey(), symbol.getRange()))));
                if(documentContext.getValue().getSubContext() != null){
                    for (SouffleContext ruleContext : documentContext.getValue().getSubContext().values()) {
                        if (ruleContext.getKind() != SouffleContextType.COMPONENT) {
                            Optional.ofNullable(ruleContext
                                            .getSymbols(currentSymbol.getName()))
                                    .ifPresent(souffleSymbols ->
                                            souffleSymbols.forEach(symbol ->
                                                    references.add(new Location(documentContext.getKey(), symbol.getRange()))));
                        }
                    }
                }
            }
        }
        return references;
    }
}