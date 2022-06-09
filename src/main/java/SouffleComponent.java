import org.eclipse.lsp4j.Range;

import java.util.*;

public class SouffleComponent extends SouffleSymbol {


    private SouffleComponent parent;

    private Map<String, List<SouffleSymbol>> scope;

    public SouffleComponent(String name, Range range, SouffleSymbolType kind) {
        super(name, kind, range);
        scope = new HashMap<>();
    }

    public SouffleComponent(String name, Range range, boolean isDecl) {
        this(name, range, SouffleSymbolType.COMPONENT_USE);
        if(isDecl){
            kind = SouffleSymbolType.COMPONENT_DECL;
            declarations.add(this);
        }
    }

    public SouffleComponent(String name, Range range) {
        this(name, range, false);
    }

    public SouffleComponent getParent() {
        return parent;
    }

    public void setParent(SouffleComponent parent) {
        this.parent = parent;
    }

    public Map<String, List<SouffleSymbol>> getScope() {
        return scope;
    }

    public void setScope(Map<String, List<SouffleSymbol>> scope) {
        this.scope = scope;
    }

    public void addToScope(SouffleSymbol symbol){
        if(scope.containsKey(symbol.getName())){
            scope.get(symbol.getName()).add(symbol);
        } else {
            scope.put(symbol.getName(), new ArrayList<>(List.of(symbol)));
        }
    }

    public void addToScope(Map<String, List<SouffleSymbol>> otherScope){
        scope.putAll(otherScope);
    }
}
