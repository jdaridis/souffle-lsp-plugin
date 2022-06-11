package parsing.symbols;

import org.eclipse.lsp4j.Range;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class SouffleConstraint extends SouffleSymbol{
    private final List<SouffleVariable> args;

    private SouffleConstraint(String name, Range range, SouffleSymbolType kind) {
        super(name, kind, range);
        this.args = new ArrayList<>();
    }

    public SouffleConstraint(String name, Range range) {
        this(name, range, SouffleSymbolType.CONSTRAINT);
    }

    public void addArg(SouffleVariable variable){
        args.add(variable);
    }

    public void addArgs(Collection<SouffleVariable> variables){
        args.addAll(variables);
    }

    public List<SouffleVariable> getArgs() {
        return args;
    }

}
