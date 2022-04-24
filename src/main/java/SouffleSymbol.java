import org.eclipse.lsp4j.Range;

public class SouffleSymbol {
    protected String name;
    protected SouffleSymbolType kind;
    protected Range range;

    public String getURI() {
        return URI;
    }

    public void setURI(String URI) {
        this.URI = URI;
    }

    protected String URI;
    protected SouffleSymbol declaration;
    protected String documentation;

    public SouffleSymbol(String name, SouffleSymbolType kind, Range range) {
        this.name = name;
        this.kind = kind;
        this.range = range;
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
        return declaration;
    }

    public void setDeclaration(SouffleSymbol declaration) {
        this.declaration = declaration;
    }

    @Override
    public String toString() {
        return name;
    }
}
