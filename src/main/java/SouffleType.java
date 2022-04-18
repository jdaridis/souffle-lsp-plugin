import org.eclipse.lsp4j.Range;

public class SouffleType extends SouffleSymbol {
    private SouffleType type;
    private SouffleType(String name, Range range, SouffleSymbolType kind) {
        super(name, kind, range);
    }

    public SouffleType(String name, Range range, boolean isDecl) {
        this(name, range, SouffleSymbolType.TYPE_USE);
        if(isDecl){
            kind = SouffleSymbolType.TYPE_DECL;
        }
    }

    public SouffleType(String name, Range range) {
        this(name, range, false);
    }
}
