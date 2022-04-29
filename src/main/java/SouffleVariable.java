import org.eclipse.lsp4j.Range;

public class SouffleVariable extends SouffleSymbol {

    private SouffleType type;

    public void setValue(Object value) {
        this.value = value;
    }

    private Object value;

    public SouffleVariable(String name, SouffleType type, Object value, Range range, boolean isComponent) {
        super(name, SouffleSymbolType.VARIABLE, range);
        this.type = type;
        this.value = value;
        if(isComponent){
            kind = SouffleSymbolType.COMPONENT_INIT;
        }
    }

    public SouffleVariable(String name, SouffleType type, Range range) {
        this(name, type, null, range, false);
    }

    public SouffleVariable(String name, Range range) {
        this(name, null, null, range, false);
    }

    public SouffleType getType() {
        return type;
    }
    public void setType(SouffleType type) {
        this.type = type;
    }

    public Object getValue() {
        return value;
    }

    @Override
    public String toString() {
        String s = name;
        if(type != null){
            s += ": " + type;
        }
        return s;
    }
}
