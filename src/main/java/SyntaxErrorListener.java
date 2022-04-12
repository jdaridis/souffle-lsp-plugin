import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.eclipse.lsp4j.*;

public class SyntaxErrorListener extends BaseErrorListener {
    private final String uri;

    public SyntaxErrorListener(String uri) {
        this.uri = uri;
    }

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
        Range range = new Range(new Position(line - 1, charPositionInLine), new Position(line - 1, charPositionInLine));
        LSClientLogger.getInstance().reportError(range, uri, msg);
    }
}
