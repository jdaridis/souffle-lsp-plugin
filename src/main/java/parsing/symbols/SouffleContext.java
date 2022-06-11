package parsing.symbols;

import org.eclipse.lsp4j.Position;
import org.eclipse.lsp4j.Range;
import org.eclipse.lsp4j.util.Positions;

import java.util.*;

public class SouffleContext {
    private SouffleContextType kind;
    private Range range;

    private Map<Range, SouffleContext> subContext;
    private final Map<String, List<SouffleSymbol>> scope;
    private List<SouffleSymbol> symbols;

    private Map<Range, SouffleSymbol> symbolRange;

    private SouffleContext parent;

    public SouffleContext(SouffleContextType kind, Range range, SouffleSymbol symbol) {
        this.kind = kind;
        this.range = range;
        this.symbols = new ArrayList<>();
        if(symbol != null)
            symbols.add(symbol);
        this.scope = new HashMap<>();
        this.symbolRange = new TreeMap<>((range1, t1) -> {
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
        context.parent = this;
        subContext.put(context.range, context);
    }


    public Map<Range, SouffleContext> getSubContext() {
        return subContext;
    }

    public SouffleContext getParent() {
        return parent;
    }

    public SouffleContext getFromSubContext(Range range){
        if(subContext != null){
            return subContext.get(range);
        } else {
            return null;
        }
    }

    public List<SouffleSymbol> getContextSymbols() {
        return symbols;
    }

    public void addContextSymbol(SouffleSymbol symbol) {
        this.symbols.add(symbol);
        this.symbolRange.put(symbol.range, symbol);
    }

    public SouffleSymbol getSymbol(Range range){
        if(this.symbolRange.containsKey(range)){
            return this.symbolRange.get(range);
        } else {
            SouffleContext subContext = getFromSubContext(range);
            if(subContext != null){
                return subContext.symbolRange.get(range);
            }
        }

        return null;
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
            scope.put(symbol.getName(), new ArrayList<>(List.of(symbol)));
        }
    }
    public void addToContextScope(Map<String, List<SouffleSymbol>> symbols){
        for(Map.Entry<String, List<SouffleSymbol>> entry: symbols.entrySet()){
            if(scope.containsKey(entry.getKey())){
                for(SouffleSymbol symbol: entry.getValue()){
                    if(!scope.get(entry.getKey()).contains(symbol)){
                        scope.get(entry.getKey()).add(symbol);
                    }
                }
            } else {
                scope.put(entry.getKey(), entry.getValue());
            }
        }
    }
    public List<SouffleSymbol> getSymbols(String name){
        return scope.get(name);
    }

    public Map<String, List<SouffleSymbol>> getScope() {
        return scope;
    }

    @Override
    public String toString() {
        return kind.toString() + " "
                + range.toString() + " "
                + symbols.toString() + " "
                + scope.toString();
    }
}
