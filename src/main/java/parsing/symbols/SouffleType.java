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

    public SouffleType getType() {
        return type;
    }

    public void setType(SouffleType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(".type " + name);
        if(!union.isEmpty()){
            sb.append(" = ");
            int i = 0;
            for (; i < union.size() - 1; i++) {
                SouffleType type1 = union.get(i);
                sb.append(type1.getName());
                sb.append(" | ");
            }
            sb.append(union.get(i).getName());
        } else if(type != null){
            sb.append(" <: ");
            sb.append(type.getName());
        }
        return sb.toString();
    }

}
