import org.eclipse.lsp4j.*;
import parsing.symbols.SouffleContext;
import parsing.symbols.SouffleProjectContext;
import parsing.symbols.SouffleSymbol;

public class HoverProvider {

    public HoverProvider() {
    }

    public Hover getHover(HoverParams params) {
        Range cursor = new Range(params.getPosition(), params.getPosition());
        SouffleContext context = SouffleProjectContext.getInstance().getContext(params.getTextDocument().getUri(), cursor);
        System.err.println("Context " + context);
        Hover hover = null;
        if (context != null) {
            SouffleSymbol currentSymbol = context.getSymbol(cursor);
            if (currentSymbol != null) {
                hover = new Hover();
                MarkupContent content = new MarkupContent();
                content.setKind(MarkupKind.MARKDOWN);
                hover.setContents(content);
                System.err.println(currentSymbol);
                String doc;
                if (currentSymbol.getDeclaration() != null) {
                    doc = "```souffle" + "\n"
                            + currentSymbol.getDeclaration().toString() + "\n"
                            + " ```" + "\n";
                    if (currentSymbol.getDeclaration().getDocumentation() != null) {
                        doc += currentSymbol.getDeclaration().getDocumentation();
                    }
                } else {
                    doc = "```souffle" + "\n"
                            + currentSymbol + "\n"
                            + " ```" + "\n";
                }
                content.setValue(doc);
            }
        }

        return hover;
    }
}