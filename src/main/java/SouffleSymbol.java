import org.eclipse.lsp4j.Range;

public class SouffleSymbol {
    protected String name;
    protected SouffleSymbolType kind;
    protected Range range;

    public SouffleSymbol(String name, SouffleSymbolType kind, Range range) {
        this.name = name;
        this.kind = kind;
        this.range = range;
    }

    public String getName() {
        return name;
    }

    public SouffleSymbolType getKind() {
        return kind;
    }

    public Range getRange() {
        return range;
    }
}
