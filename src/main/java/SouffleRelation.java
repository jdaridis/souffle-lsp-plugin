import org.eclipse.lsp4j.Range;

import java.util.ArrayList;
import java.util.List;

public class SouffleRelation extends SouffleSymbol {
    private final List<SouffleVariable> args;
    private SouffleRelation(String name, Range range, SouffleSymbolType kind) {
        super(name, kind, range);
        this.args = new ArrayList<>();
    }

    public SouffleRelation(String name, Range range, boolean isDecl) {
        this(name, range, SouffleSymbolType.RELATION_USE);
        if(isDecl){
            kind = SouffleSymbolType.RELATION_DECL;
        }
    }

    public SouffleRelation(String name, Range range) {
        this(name, range, false);
    }

    public void addArg(SouffleVariable variable){
        args.add(variable);
    }

    public List<SouffleVariable> getArgs() {
        return args;
    }
}
