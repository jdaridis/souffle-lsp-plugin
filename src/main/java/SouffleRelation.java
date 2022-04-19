import org.eclipse.lsp4j.Range;

import java.util.ArrayList;
import java.util.List;

public class SouffleRelation extends SouffleSymbol {
    private final List<SouffleVariable> args;
    private SouffleRelation declaration;

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

    public SouffleRelation getDeclaration() {
        return declaration;
    }

    public void setDeclaration(SouffleRelation declaration) {
        this.declaration = declaration;
    }

    @Override
    public String toString() {
        String relationName = name + "(";

        for(SouffleVariable arg: args){
            relationName += arg.toString() + ", ";
        }
        relationName += ")";
        return relationName;
    }
}
