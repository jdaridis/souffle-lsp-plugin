import org.eclipse.lsp4j.*;

public class HoverProvider {

    public HoverProvider() {
    }

    public Hover getHover(HoverParams params) {
        Range cursor = new Range(params.getPosition(), params.getPosition());
        SouffleContext context = ProjectContext.getInstance().getContext(params.getTextDocument().getUri(), cursor);
        System.err.println("Context " + context);
        Hover hover = null;
        if (context != null) {
            SouffleSymbol currentSymbol = context.getSymbol(cursor);
            if (currentSymbol != null) {
                hover = new Hover();
                MarkupContent content = new MarkupContent();
                content.setKind(MarkupKind.PLAINTEXT);
                hover.setContents(content);
                System.err.println(currentSymbol);
                if (currentSymbol.getDocumentation() != null) {
                    content.setValue(currentSymbol.getDocumentation());
                } else if (currentSymbol.getDeclaration() != null) {
                    String doc = "##### " + currentSymbol.getDeclaration().toString() + "\n";
                    if (currentSymbol.getDeclaration().getDocumentation() != null) {
                        doc += currentSymbol.getDeclaration().getDocumentation();
                    }
                    content.setKind(MarkupKind.MARKDOWN);
                    content.setValue(doc);
                } else {
                    content.setValue(currentSymbol.toString());
                }
            }
        }

        return hover;
    }
}