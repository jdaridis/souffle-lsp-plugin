import org.eclipse.lsp4j.*;
import org.eclipse.lsp4j.services.LanguageClient;
import souffleLint.SouffleLint;
import souffleLint.SouffleLintContext;

import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Use this class to send log messages to the client.
 */
public class LSClientLogger {

    private static LSClientLogger INSTANCE;
    private LanguageClient client;
    private boolean isInitialized;
    public Map<String, List<Diagnostic>> diagnostics;

    private LSClientLogger() {
    }

    public void initialize(LanguageClient languageClient) {
        if (!Boolean.TRUE.equals(isInitialized)) {
            this.client = languageClient;
        }
        diagnostics = new HashMap<>();
        isInitialized = true;
    }

    public static LSClientLogger getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new LSClientLogger();
        }
        return INSTANCE;
    }

    public void logMessage(String message) {
        if (!isInitialized) {
            return;
        }
        client.logMessage(new MessageParams(MessageType.Info, message));
    }

    public void clearDiagnostics(String uri){
        diagnostics.put(uri, new ArrayList<>());
        client.publishDiagnostics(new PublishDiagnosticsParams(uri, diagnostics.get(uri)));
    }

    public void reportError(Range range, String uri, String message){
        if (!isInitialized) {
            return;
        }
        Diagnostic diagnostic = new Diagnostic(range, message);
        diagnostic.setSeverity(DiagnosticSeverity.Error);
        diagnostic.setSource("Syntax error");
        if(diagnostics.containsKey(uri))
            diagnostics.get(uri).add(diagnostic);
        else
            diagnostics.put(uri, List.of(new Diagnostic[]{diagnostic}));
        client.publishDiagnostics(new PublishDiagnosticsParams(uri, diagnostics.get(uri)));
    }
    public void reportWarning(Range range, String uri, String message){
        if (!isInitialized) {
            return;
        }
        Diagnostic diagnostic = new Diagnostic(range, message);
        diagnostic.setSeverity(DiagnosticSeverity.Warning);
        diagnostics.get(uri).add(diagnostic);
        client.publishDiagnostics(new PublishDiagnosticsParams(uri, diagnostics.get(uri)));
    }

    public void reportHint(Range range, String uri, String message){
        if (!isInitialized) {
            return;
        }
        Diagnostic diagnostic = new Diagnostic(range, message);
        diagnostic.setSeverity(DiagnosticSeverity.Hint);
        diagnostics.get(uri).add(diagnostic);
        client.publishDiagnostics(new PublishDiagnosticsParams(uri, diagnostics.get(uri)));
    }

    public void showErrorMessage(String message){
        MessageParams params = new MessageParams();
        params.setType(MessageType.Error);
        params.setMessage(message);
        client.showMessage(params);
    }

    public void reportLints(List<SouffleLint> lints, String uri){
        for (SouffleLint lint: lints){
            if(lint != null){
                for(SouffleLintContext fragment: lint.fragments){
                    Diagnostic diagnostic = new Diagnostic();
                    diagnostic.setSeverity(DiagnosticSeverity.Warning);
                    diagnostic.setSource("souffle-lint");
                    diagnostic.setCode(lint.rule.name);
                    String message = lint.rule.shortDescription + "\n\n";
                    message+= "Examples: \n" + lint.rule.getExamples();
                    diagnostic.setMessage(message);
                    Position start = new Position(fragment.start.row, fragment.start.column);
                    Position end = new Position(fragment.end.row, fragment.end.column);
                    Range range = new Range(start, end);
                    diagnostic.setRange(range);
                    diagnostics.get(uri).add(diagnostic);
                }
            }
        }
        if(lints.isEmpty()){
            MessageParams messageParams = new MessageParams();
            messageParams.setMessage("No problems found with souffle-lint");
            client.showMessage(messageParams);
        }
        client.publishDiagnostics(new PublishDiagnosticsParams(uri, diagnostics.get(uri)));
    }

    public void reportAllLints(List<SouffleLint> lints){
        for (SouffleLint lint: lints){
            if(lint != null){
                for(SouffleLintContext fragment: lint.fragments){
                    Diagnostic diagnostic = new Diagnostic();
                    diagnostic.setSeverity(DiagnosticSeverity.Warning);
                    String message = lint.rule.name + ": " + lint.rule.shortDescription + "\n\n";
                    message+= "Examples: \n" + lint.rule.getExamples();
                    diagnostic.setMessage(message);
                    Position start = new Position(fragment.start.row, fragment.start.column);
                    Position end = new Position(fragment.end.row, fragment.end.column);
                    Range range = new Range(start, end);
                    diagnostic.setRange(range);
                    diagnostics.get(URI.create(lint.source_file).toString()).add(diagnostic);
                    System.err.println(URI.create(lint.source_file).toString());
                }
            }
        }
        for(Map.Entry<String, List<Diagnostic>> entry: diagnostics.entrySet()){
            if(!entry.getValue().isEmpty()){
                client.publishDiagnostics(new PublishDiagnosticsParams(entry.getKey(), entry.getValue()));
            }
        }
    }
}
