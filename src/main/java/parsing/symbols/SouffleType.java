package parsing.symbols;

import org.eclipse.lsp4j.Range;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class SouffleType extends SouffleSymbol {
    private SouffleType type;

    private List<SouffleType> union;
    private SouffleType(String name, Range range, SouffleSymbolType kind) {
        super(name, kind, range);
        union = new ArrayList<>();
    }

    public SouffleType(String name, Range range, boolean isDecl) {
        this(name, range, SouffleSymbolType.TYPE_USE);
        if(isDecl){
            kind = SouffleSymbolType.TYPE_DECL;
            declarations.add(this);
        }
    }

    public SouffleType(String name, Range range) {
        this(name, range, false);
    }

    public void addType(SouffleType type) {
        union.add(type);
    }

    public void addType(Collection<SouffleType> type) {
        union.addAll(type);
    }

    public List<SouffleType> getUnion() {
        return union;
    }
}
