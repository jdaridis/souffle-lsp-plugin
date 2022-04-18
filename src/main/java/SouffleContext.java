import org.eclipse.lsp4j.Position;
import org.eclipse.lsp4j.Range;
import org.eclipse.lsp4j.util.Positions;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class SouffleContext {
    private SouffleContextType kind;
    private Range range;
    private Map<Range, SouffleContext> subContext;
    private final Map<String, List<SouffleSymbol>> scope;
    private SouffleSymbol symbol;

    public SouffleContext(SouffleContextType kind, Range range, SouffleSymbol symbol) {
        this.kind = kind;
        this.range = range;
        this.symbol = symbol;
        this.scope = new HashMap<>();
    }

    public SouffleContext(SouffleContextType kind, Range range) {
        this(kind, range, null);
    }

    public void addToSubContext(SouffleContext context){
        if(this.subContext == null){
            this.subContext = new TreeMap<>((range1, t1) -> {
                Position currentPos = range1.getStart();
                if(Positions.isBefore(currentPos, t1.getStart())){
                    return -1;
                } else if(!Positions.isBefore(currentPos, t1.getEnd())){
                    return 1;
                }
                if(range1.getStart().equals(range1.getEnd()))
                    return 0;
                else
                    return 1;
            });
        }
        subContext.put(context.range, context);
    }

    public SouffleContext getFromSubContext(Range range){
        if(subContext != null){
            return subContext.get(range);
        } else {
            return null;
        }
    }

    public SouffleSymbol getContextSymbol() {
        return symbol;
    }

    public void setContextSymbol(SouffleSymbol symbol) {
        this.symbol = symbol;
    }

    public SouffleContextType getKind() {
        return kind;
    }

    public Range getRange() {
        return range;
    }

    public void addToContextScope(SouffleSymbol symbol){
        if(scope.containsKey(symbol.getName())){
            scope.get(symbol.getName()).add(symbol);
        } else {
            scope.put(symbol.getName(), List.of(symbol));
        }
    }

    public List<SouffleSymbol> getSymbols(String name){
        return scope.get(name);
    }
}
