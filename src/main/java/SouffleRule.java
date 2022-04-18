import org.eclipse.lsp4j.Range;

import java.util.ArrayList;
import java.util.List;

public class SouffleRule extends SouffleSymbol{
    private final List<SouffleVariable> args;
    private final List<SouffleSymbol> body;

    public SouffleRule(String name, Range range) {
        super(name, SouffleSymbolType.RULE, range);
        this.args = new ArrayList<>();
        this.body = new ArrayList<>();
    }

    public void addArg(SouffleVariable variable){
        args.add(variable);
    }

    public List<SouffleVariable> getArgs() {
        return args;
    }

    public List<SouffleSymbol> getBody() {
        return body;
    }

    public void addToBody(SouffleSymbol symbol){
        body.add(symbol);
    }


}
