import org.eclipse.lsp4j.Range;

import java.util.ArrayList;
import java.util.List;

public class SouffleRelation extends SouffleSymbol {
    private final List<SouffleVariable> args;

    private String directive;

    private SouffleRelation(String name, Range range, SouffleSymbolType kind) {
        super(name, kind, range);
        this.args = new ArrayList<>();
    }

    public SouffleRelation(String name, Range range, boolean isDecl) {
        this(name, range, SouffleSymbolType.RELATION_USE);
        if(isDecl){
            kind = SouffleSymbolType.RELATION_DECL;
            declaration = this;
        }
    }

    public SouffleRelation(String name, Range range) {
        this(name, range, false);
    }

    public void addArg(SouffleVariable variable){
        args.add(variable);
    }

    public void addArgs(List<SouffleVariable> variables){
        args.addAll(variables);
    }

    public List<SouffleVariable> getArgs() {
        return args;
    }

    public String getDirective() {
        return directive;
    }

    public void setDirective(String directive) {
        this.directive = directive;
    }

    @Override
    public String toString() {
        StringBuilder relationName = new StringBuilder(name + "(");
        if(!args.isEmpty()){
            int i = 0;
            for (; i < args.size() - 1; i++) {
                SouffleVariable arg = args.get(i);
                relationName.append(arg.toString()).append(", ");
            }
            relationName.append(args.get(i).toString());
        }

        relationName.append(")");
        return relationName.toString();
    }
}
