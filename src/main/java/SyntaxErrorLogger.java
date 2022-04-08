import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.eclipse.lsp4j.*;
import org.eclipse.lsp4j.services.LanguageClient;

import java.util.ArrayList;
import java.util.List;

public class SyntaxErrorLogger extends BaseErrorListener {
    private final String uri;
    private LanguageClient languageClient;
    public SyntaxErrorLogger(LanguageClient languageClient, String uri) {
        this.languageClient = languageClient;
        this.uri = uri;
    }

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
        Range range = new Range(new Position(line - 1, charPositionInLine), new Position(line - 1, charPositionInLine));

        Diagnostic diagnostic = new Diagnostic(range, msg);
        diagnostic.setSeverity(DiagnosticSeverity.Error);
        List<Diagnostic> diagnostics = new ArrayList<Diagnostic>();
        diagnostics.add(diagnostic);
        languageClient.publishDiagnostics(new PublishDiagnosticsParams(uri, diagnostics));
    }
}
