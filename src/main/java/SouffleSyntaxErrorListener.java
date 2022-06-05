import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.eclipse.lsp4j.*;

public class SouffleSyntaxErrorListener extends BaseErrorListener {
    private final String uri;

    public SouffleSyntaxErrorListener(String uri) {
        this.uri = uri;
    }

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
        Position position = new Position(line - 1, charPositionInLine);
        Range range = new Range(position, position);
        LSClientLogger.getInstance().reportError(range, uri, msg);
    }
}
