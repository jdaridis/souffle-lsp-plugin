import org.eclipse.lsp4j.Range;

public class SouffleVariable extends SouffleSymbol {
    private SouffleType type;
    private Object value;

    public SouffleVariable(String name, SouffleType type, Object value, Range range) {
        super(name, SouffleSymbolType.VARIABLE, range);
        this.type = type;
        this.value = value;
    }

    public SouffleVariable(String name, SouffleType type, Range range) {
        this(name, type, null, range);
    }

    public SouffleType getType() {
        return type;
    }

    public Object getValue() {
        return value;
    }
}
