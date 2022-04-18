import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.Tree;
import org.eclipse.lsp4j.*;
import org.eclipse.lsp4j.jsonrpc.messages.Either;
import org.eclipse.lsp4j.services.TextDocumentService;
import org.eclipse.lsp4j.util.Positions;
import org.w3c.dom.Text;
import visitors.SouffleLexer;
import visitors.SouffleParser;

import javax.annotation.processing.Completion;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.util.*;
import java.util.concurrent.CompletableFuture;

/**
 * TextDocumentService implementation for Ballerina.
 */
public class SouffleTextDocumentService implements TextDocumentService {

    private SouffleLanguageServer languageServer;
    private LSClientLogger  clientLogger;
    private SouffleLexer souffleLexer;
    private SouffleParser souffleParser;

    public SouffleTextDocumentService(SouffleLanguageServer languageServer) {
        this.languageServer = languageServer;
        this.clientLogger = LSClientLogger.getInstance();
    }

    private void consumeInput(String documentURI) throws IOException, URISyntaxException {
        URI uri = new URI(documentURI);
        CharStream input = CharStreams.fromPath(Path.of(uri));
        souffleLexer = new SouffleLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(souffleLexer);
        souffleParser = new SouffleParser(tokens);
        souffleParser.removeErrorListeners();
        souffleParser.setErrorHandler(new SouffleError());
        souffleParser.addErrorListener(new SyntaxErrorListener(uri.toString()));
    }

    @Override
    public void didOpen(DidOpenTextDocumentParams didOpenTextDocumentParams) {
        try {
            URI uri = new URI(didOpenTextDocumentParams.getTextDocument().getUri());
            consumeInput(didOpenTextDocumentParams.getTextDocument().getUri());
            this.clientLogger.clearDiagnostics(uri.toString());
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
                "' {fileUri: '" + didChangeTextDocumentParams.getContentChanges() + "'} Changed");
    }

    @Override
    public void didClose(DidCloseTextDocumentParams didCloseTextDocumentParams) {
        this.clientLogger.logMessage("Operation '" + "text/didClose" +
                "' {fileUri: '" + didCloseTextDocumentParams.getTextDocument().getUri() + "'} Closed");
    }

    @Override
    public void didSave(DidSaveTextDocumentParams didSaveTextDocumentParams) {
        this.clientLogger.clearDiagnostics(didSaveTextDocumentParams.getTextDocument().getUri());
        try {
            consumeInput(didSaveTextDocumentParams.getTextDocument().getUri());
            ParseTree tree = souffleParser.program(); // begin parsing at init rule

            this.clientLogger.logMessage("Operation '" + "text/didSave" +
                    "' {fileUri: '" + didSaveTextDocumentParams.getTextDocument().getUri() + "'} Saved");
        } catch (IOException | URISyntaxException e) {
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
            String[] directives = {
                    ".decl",
                    ".output",
                    ".input",
                    ".type",
                    ".comp",
                    ".init",
                    ".printsize",
                    ".functor",
                    ".limitsize",
                    ".override",
                    ".pragma",
                    ".plan",
                    ".symboltype",
                    ".numbertype",
            };

            List<CompletionItem> directiveComplete = new ArrayList<>();

            for(String directive: directives){
                CompletionItem completionItem = new CompletionItem();
                completionItem.setLabel(directive);
                completionItem.setInsertText(directive);
                completionItem.setKind(CompletionItemKind.Keyword);
                directiveComplete.add(completionItem);
                if(directive.equals(".symboltype") || directive.equals(".numbertype")){
                    completionItem.setTags(List.of(CompletionItemTag.Deprecated));
                }
            }

            CompletionItem completionItem = new CompletionItem();
            completionItem.setLabel("Test(): void");
            completionItem.setInsertText("Test()");
            completionItem.setKind(CompletionItemKind.Snippet);
            directiveComplete.add(completionItem);
//            Command command = new Command();
//            command.setCommand("editor.action.triggerParameterHints");
//            completionItem.setCommand(command);

//            CompletionList

            this.clientLogger.logMessage("Operation '" + "text/completion");

            return Either.forLeft(directiveComplete);
        });
    }

    @Override
    public CompletableFuture<SignatureHelp> signatureHelp(SignatureHelpParams params) {
        return CompletableFuture.supplyAsync(() -> {
            this.clientLogger.logMessage("Signature params " + params.toString());
            SignatureHelp signatureHelp = new SignatureHelp();
            SignatureInformation signatureInformation = new SignatureInformation();
            signatureInformation.setLabel("Test signature");
            signatureHelp.setSignatures(List.of(signatureInformation));
            return signatureHelp;
        });
    }

    @Override
    public CompletableFuture<List<Either<SymbolInformation, DocumentSymbol>>> documentSymbol(DocumentSymbolParams params) {
        return CompletableFuture.supplyAsync(() -> {
           DocumentSymbol symbol = new DocumentSymbol();
           symbol.setDetail("Test symbol");
           symbol.setKind(SymbolKind.Operator);
           symbol.setName("Test Symbol");
           symbol.setRange(new Range(new Position(17, 2), new Position(17,17)));
           symbol.setSelectionRange(new Range(new Position(17, 2), new Position(17,17)));

            DocumentSymbol symbol2 = new DocumentSymbol();
            symbol2.setDetail("Test symbol");
            symbol2.setKind(SymbolKind.Operator);
            symbol2.setName("Test Symbol");
            symbol2.setRange(new Range(new Position(19, 2), new Position(19,17)));
            symbol2.setSelectionRange(new Range(new Position(19, 2), new Position(19,17)));

            symbol2.setChildren(List.of(symbol));

           return List.of(Either.forRight(symbol2));
        });
    }
}
