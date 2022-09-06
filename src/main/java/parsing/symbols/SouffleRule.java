package parsing.symbols;

import org.eclipse.lsp4j.Range;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class SouffleRule extends SouffleSymbol{
    private final List<SouffleAttribute> args;
    private final List<SouffleSymbol> body;

    public SouffleRule(String name, Range range) {
        super(name, SouffleSymbolType.RULE, range);
        this.args = new ArrayList<>();
        this.body = new ArrayList<>();
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

    public List<SouffleSymbol> getBody() {
        return body;
    }

    public void addToBody(SouffleSymbol symbol){
        body.add(symbol);
    }

    public void addToBody(Collection<SouffleSymbol> symbols){
        body.addAll(symbols);
    }

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
