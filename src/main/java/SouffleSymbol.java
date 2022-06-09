import org.eclipse.lsp4j.Range;

import java.util.ArrayList;
import java.util.List;

public class SouffleSymbol {
    protected String name;
    protected SouffleSymbolType kind;
    protected Range range;

    protected SouffleSymbol component;

    protected String URI;
    protected List<SouffleSymbol> declarations;
    protected String documentation;

    public SouffleSymbol(String name, SouffleSymbolType kind, Range range) {
        this.name = name;
        this.kind = kind;
        this.range = range;
        this.declarations = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public SouffleSymbolType getKind() {
        return kind;
    }

    public Range getRange() {
        return range;
    }

    public String getDocumentation() {
        return documentation;
    }

    public void setDocumentation(String documentation) {
        this.documentation = documentation;
    }

    public SouffleSymbol getDeclaration() {
        if(declarations.isEmpty()){
            return null;
        } else {
            return declarations.get(0);
        }
    }

    public List<SouffleSymbol> getDeclarations() {
        return declarations;
    }

    public void setDeclaration(SouffleSymbol declaration) {
        this.declarations.add(declaration);
    }

    public void setDeclaration(List<SouffleSymbol> declaration) {
        this.declarations.addAll(declaration);
    }


    public String getURI() {
        return URI;
    }

    public void setURI(String URI) {
        this.URI = URI;
    }

    public SouffleSymbol getComponent() {
        return component;
    }

    public void setComponent(SouffleSymbol component) {
        this.component = component;
    }

    @Override
    public String toString() {
        return name;
    }
}
