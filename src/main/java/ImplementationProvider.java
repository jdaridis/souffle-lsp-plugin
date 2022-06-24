import org.eclipse.lsp4j.ImplementationParams;
import org.eclipse.lsp4j.Location;
import org.eclipse.lsp4j.LocationLink;
import org.eclipse.lsp4j.Range;
import org.eclipse.lsp4j.jsonrpc.messages.Either;
import parsing.Utils;
import parsing.symbols.SouffleContext;
import parsing.symbols.SouffleProjectContext;
import parsing.symbols.SouffleSymbol;
import parsing.symbols.SouffleSymbolType;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class ImplementationProvider {
    public ImplementationProvider() {
    }

    public Either<List<? extends Location>, List<? extends LocationLink>> getImplementations(ImplementationParams params) {
        Range cursor = Utils.positionToRange(params.getPosition());
        SouffleContext context = SouffleProjectContext.getInstance().getContext(params.getTextDocument().getUri(), cursor);
        List<Location> references = new ArrayList<Location>();
        if (context != null) {
            SouffleSymbol currentSymbol = context.getSymbol(cursor);
            for (Map.Entry<String, SouffleContext> documentContext : SouffleProjectContext.getInstance().getDocuments().entrySet()) {
                Optional.ofNullable(documentContext.getValue()
                                .getSymbols(currentSymbol.getName()))
                        .ifPresent(souffleSymbols -> souffleSymbols
                                .stream()
                                .filter(symbol -> {
                                    switch (symbol.getKind()) {
                                        case RELATION_USE:
                                        case RULE:
                                            return true;
                                        default:
                                            return false;
                                    }
                                })
                                .forEach(symbol -> references.add(new Location(documentContext.getKey(), symbol.getRange()))));
                if (documentContext.getValue().getSubContext() != null) {
                    for (SouffleContext ruleContext : documentContext.getValue().getSubContext().values()) {
                        Optional.ofNullable(ruleContext
                                        .getSymbols(currentSymbol.getName()))
                                .ifPresent(souffleSymbols ->
                                        souffleSymbols
                                                .stream()
                                                .filter(symbol -> symbol.getKind() == SouffleSymbolType.RULE)
                                                .forEach(symbol ->
                                                        references.add(new Location(documentContext.getKey(), symbol.getRange()))));
                    }
                }
            }
        }
        return Either.forLeft(references);
    }
}