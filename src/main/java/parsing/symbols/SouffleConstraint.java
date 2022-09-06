package parsing.symbols;

import org.eclipse.lsp4j.Range;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class SouffleConstraint extends SouffleSymbol{
    private final List<SouffleAttribute> args;

    private SouffleConstraint(String name, Range range, SouffleSymbolType kind) {
        super(name, kind, range);
        this.args = new ArrayList<>();
    }

    public SouffleConstraint(String name, Range range) {
        this(name, range, SouffleSymbolType.CONSTRAINT);
    }

    public void addArg(SouffleAttribute variable){
        args.add(variable);
    }

    public void addArgs(Collection<SouffleAttribute> variables){
        args.addAll(variables);
    }

    public List<SouffleAttribute> getArgs() {
        return args;
    }

}
