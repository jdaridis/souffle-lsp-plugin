package parsing;

import logging.LSClientLogger;
import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.eclipse.lsp4j.*;
import parsing.Utils;

public class SouffleSyntaxErrorListener extends BaseErrorListener {
    private final String uri;

    public SouffleSyntaxErrorListener(String uri) {
        this.uri = uri;
    }

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
        Position position = new Position(line - 1, charPositionInLine);
        Range range = Utils.positionToRange(position);
        LSClientLogger.getInstance().reportError(range, uri, msg);
    }
}
