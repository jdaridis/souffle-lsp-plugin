import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.eclipse.lsp4j.*;
import org.eclipse.lsp4j.services.LanguageClient;
import org.eclipse.lsp4j.services.LanguageClientAware;
import org.eclipse.lsp4j.services.LanguageServer;
import org.eclipse.lsp4j.services.TextDocumentService;
import org.eclipse.lsp4j.services.WorkspaceService;
import visitors.SouffleLexer;
import visitors.SouffleParser;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Language Server implementation for Souffle Datalog.
 */
public class SouffleLanguageServer implements LanguageServer, LanguageClientAware {

    private TextDocumentService textDocumentService;
    private WorkspaceService workspaceService;
    private ClientCapabilities clientCapabilities;
    LanguageClient languageClient;
    private int shutdown = 1;

    public SouffleLanguageServer() {
        this.textDocumentService = new SouffleTextDocumentService(this);
        this.workspaceService = new SouffleWorkSpaceService(this);
    }

    @Override
    public CompletableFuture<InitializeResult> initialize(InitializeParams initializeParams) {
        final InitializeResult response = new InitializeResult(new ServerCapabilities());
        //Set the document synchronization capabilities to full.
        response.getCapabilities().setTextDocumentSync(TextDocumentSyncKind.Full);
//        response.getCapabilities().setHoverProvider(true);
        this.clientCapabilities = initializeParams.getCapabilities();
        
        /* Check if dynamic registration of completion capability is allowed by the client. If so we don't register the capability.
           Else, we register the completion capability.  
         */
        if (!isDynamicCompletionRegistration()) {
            response.getCapabilities().setCompletionProvider(new CompletionOptions());
        }
        return CompletableFuture.supplyAsync(() -> response);
    }

    @Override
    public void initialized(InitializedParams params) {
        //Check if dynamic completion support is allowed, if so register.
        if (isDynamicCompletionRegistration()) {
            CompletionRegistrationOptions completionRegistrationOptions = new CompletionRegistrationOptions();
            Registration completionRegistration = new Registration(UUID.randomUUID().toString(),
                    "textDocument/completion", completionRegistrationOptions);
            languageClient.registerCapability(new RegistrationParams(List.of(completionRegistration)));
        }

//        languageClient.workspaceFolders().thenApply(workspaceFolders -> {
//            filterByPattern(URI.create(workspaceFolders.get(0).getUri()).getPath());
//            return true;
//        });

    }

    private void filterByPattern(String directory) {

        // Reading the folder and getting Stream.
        try (Stream<Path> walk = Files.walk(Paths.get(directory))) {

            // Filtering the paths by a folder and adding into a list.

            List<String> fileNamesList = walk.map(Path::toString).filter(f -> f.endsWith(".dl"))
                    .collect(Collectors.toList());

            // printing the folder names
            for (String s : fileNamesList) {
                consumeInput(s);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void consumeInput(String documentURI) throws IOException {
        Path path = Path.of(documentURI);
        CharStream input = CharStreams.fromPath(path);
        SouffleLexer souffleLexer = new SouffleLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(souffleLexer);
        SouffleParser souffleParser = new SouffleParser(tokens);
        souffleParser.removeErrorListeners();
        souffleParser.setErrorHandler(new SouffleError());
        souffleParser.addErrorListener(new SyntaxErrorListener(path.toUri().toString()));
        souffleParser.program();
    }

    @Override
    public CompletableFuture<Object> shutdown() {
        shutdown = 0;
        return CompletableFuture.supplyAsync(Object::new);
    }

    @Override
    public void exit() {
        System.exit(shutdown);
    }

    @Override
    public TextDocumentService getTextDocumentService() {
        return this.textDocumentService;
    }

    @Override
    public WorkspaceService getWorkspaceService() {
        return this.workspaceService;
    }

    @Override
    public void connect(LanguageClient languageClient) {
        this.languageClient = languageClient;
        LSClientLogger.getInstance().initialize(this.languageClient);

    }

    private boolean isDynamicCompletionRegistration() {
        TextDocumentClientCapabilities textDocumentCapabilities =
                clientCapabilities.getTextDocument();
        return textDocumentCapabilities != null && textDocumentCapabilities.getCompletion() != null
                && Boolean.FALSE.equals(textDocumentCapabilities.getCompletion().getDynamicRegistration());
    }
}
