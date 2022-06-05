import org.eclipse.lsp4j.Location;
import org.eclipse.lsp4j.LocationLink;
import org.eclipse.lsp4j.Range;
import org.eclipse.lsp4j.TypeDefinitionParams;
import org.eclipse.lsp4j.jsonrpc.messages.Either;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class TypeDefinitionProvider {
    public TypeDefinitionProvider() {
    }

    public Either<List<? extends Location>, List<? extends LocationLink>> getTypeDefinition(TypeDefinitionParams params) {
        List<Location> declLocations = new ArrayList<Location>();
        Range cursor = new Range(params.getPosition(), params.getPosition());
        Optional<SouffleContext> context = Optional.ofNullable(SouffleProjectContext.getInstance().getContext(params.getTextDocument().getUri(), cursor));
        if (context.isPresent()) {
            Optional<SouffleSymbol> currentSymbol = Optional.ofNullable(context.get().getSymbol(cursor));
            if (currentSymbol.isPresent()) {
                if (currentSymbol.get().getKind() == SouffleSymbolType.VARIABLE) {
                    Optional<SouffleSymbol> declaration = Optional.ofNullable(((SouffleVariable) (currentSymbol.get())).getType());
                    if(declaration.isPresent()){
                        declaration = Optional.ofNullable(declaration.get().getDeclaration());
                        declaration.ifPresent(symbol -> declLocations.add(new Location(symbol.getURI(), symbol.getRange())));
                    }
                } else if(currentSymbol.get().getKind() == SouffleSymbolType.TYPE_USE){
                    Optional<SouffleSymbol> declaration = currentSymbol;
                    declaration = Optional.ofNullable(declaration.get().getDeclaration());
                    declaration.ifPresent(symbol -> declLocations.add(new Location(symbol.getURI(), symbol.getRange())));
                }
            }
        }
        return Either.forLeft(declLocations);
    }
}