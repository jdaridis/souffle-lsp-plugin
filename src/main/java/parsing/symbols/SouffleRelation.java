package parsing.symbols;

import org.eclipse.lsp4j.Range;

import java.util.ArrayList;
import java.util.List;

public class SouffleRelation extends SouffleSymbol {
    private final List<SouffleAttribute> args;

    private String directive;

    private SouffleRelation(String name, Range range, SouffleSymbolType kind) {
        super(name, kind, range);
        this.args = new ArrayList<>();
    }

    public SouffleRelation(String name, Range range, boolean isDecl) {
        this(name, range, SouffleSymbolType.RELATION_USE);
        if(isDecl){
            kind = SouffleSymbolType.RELATION_DECL;
            declarations.add(this);
        }
    }

    public SouffleRelation(String name, Range range) {
        this(name, range, false);
    }

    public void addArg(SouffleAttribute variable){
        args.add(variable);
    }

    public void addArgs(List<SouffleAttribute> variables){
        args.addAll(variables);
    }

    public List<SouffleAttribute> getArgs() {
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
                SouffleAttribute arg = args.get(i);
                relationName.append(arg.toString()).append(", ");
            }
            relationName.append(args.get(i).toString());
        }

        relationName.append(")");
        return relationName.toString();
    }
}
