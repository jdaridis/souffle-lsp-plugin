import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.PredictionMode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.eclipse.lsp4j.*;
import org.eclipse.lsp4j.jsonrpc.messages.Either;
import org.eclipse.lsp4j.services.TextDocumentService;
import visitors.SouffleLexer;
import visitors.SouffleParser;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;

/**
 * TextDocumentService implementation for Ballerina.
 */
public class SouffleTextDocumentService implements TextDocumentService {

    private SouffleLanguageServer languageServer;
    private LSClientLogger  clientLogger;
    private SouffleLexer souffleLexer;
    private SouffleParser souffleParser;
    private URI uri;

    public SouffleTextDocumentService(SouffleLanguageServer languageServer) {
        this.languageServer = languageServer;
        this.clientLogger = LSClientLogger.getInstance();
    }

    @Override
    public void didOpen(DidOpenTextDocumentParams didOpenTextDocumentParams) {
        try {
            CharStream input = null;
            uri = new URI(didOpenTextDocumentParams.getTextDocument().getUri());
            input = CharStreams.fromPath(Path.of(uri));
            souffleLexer = new SouffleLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(souffleLexer);
            souffleParser = new SouffleParser(tokens);
            souffleParser.removeErrorListeners();
            souffleParser.addErrorListener(new SyntaxErrorLogger(languageServer.languageClient, uri.toString()));
            souffleParser.getInterpreter()
                    .setPredictionMode(PredictionMode.LL_EXACT_AMBIG_DETECTION);
            this.languageServer.languageClient.publishDiagnostics(new PublishDiagnosticsParams(uri.toString(), new ArrayList<>(0)));
            ParseTree tree = souffleParser.program(); // begin parsing at init rule

            this.clientLogger.logMessage("Operation '" + "text/didOpen" +
                    "' {fileUri: '" + uri + "'} opened");
        } catch (URISyntaxException | IOException e) {
            e.printStackTrace();
        }


    }

    @Override
    public void didChange(DidChangeTextDocumentParams didChangeTextDocumentParams) {
        this.clientLogger.logMessage("Operation '" + "text/didChange" +
                "' {fileUri: '" + didChangeTextDocumentParams.getTextDocument().getUri() + "'} Changed");
    }

    @Override
    public void didClose(DidCloseTextDocumentParams didCloseTextDocumentParams) {
        this.clientLogger.logMessage("Operation '" + "text/didClose" +
                "' {fileUri: '" + didCloseTextDocumentParams.getTextDocument().getUri() + "'} Closed");
    }

    @Override
    public void didSave(DidSaveTextDocumentParams didSaveTextDocumentParams) {
        this.languageServer.languageClient.publishDiagnostics(new PublishDiagnosticsParams(uri.toString(), new ArrayList<>(0)));
        try {
            CharStream input = null;
            input = CharStreams.fromPath(Path.of(uri));
            souffleLexer = new SouffleLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(souffleLexer);
            souffleParser = new SouffleParser(tokens);
            souffleParser.removeErrorListeners();
            souffleParser.addErrorListener(new SyntaxErrorLogger(languageServer.languageClient, uri.toString()));
            souffleParser.getInterpreter()
                    .setPredictionMode(PredictionMode.LL_EXACT_AMBIG_DETECTION);
            this.languageServer.languageClient.publishDiagnostics(new PublishDiagnosticsParams(uri.toString(), new ArrayList<>(0)));
            ParseTree tree = souffleParser.program(); // begin parsing at init rule

            this.clientLogger.logMessage("Operation '" + "text/didSave" +
                    "' {fileUri: '" + didSaveTextDocumentParams.getTextDocument().getUri() + "'} Saved");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public CompletableFuture<Hover> hover(HoverParams params) {
        this.clientLogger.logMessage("Operation '" + "text/hover" +
                "' {fileUri: '" + params.toString() + "'} Hover");
        return CompletableFuture.supplyAsync(() -> {
            Hover hover = new Hover();
            MarkupContent content = new MarkupContent();
            content.setValue("Test hover");
            content.setKind(MarkupKind.PLAINTEXT);
            hover.setContents(content);
            return hover;
        });
    }



    @Override
    public CompletableFuture<Either<List<CompletionItem>, CompletionList>> completion(CompletionParams position) {
        return CompletableFuture.supplyAsync(() -> {
            this.clientLogger.logMessage("Operation '" + "text/completion");
            CompletionItem completionItem = new CompletionItem();
            completionItem.setLabel("Test completion item");
            completionItem.setInsertText("Test");
            completionItem.setDetail("Snippet");
            completionItem.setKind(CompletionItemKind.Snippet);
            return Either.forLeft(Arrays.asList(completionItem));
        });
    }
}
