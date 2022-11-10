import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.eclipse.lsp4j.*;
import org.eclipse.lsp4j.jsonrpc.messages.Either;
import org.eclipse.lsp4j.services.TextDocumentService;
import parsing.*;
import parsing.preprocessor.PreprocessorLexer;
import parsing.preprocessor.PreprocessorParser;
import parsing.souffle.SouffleLexer;
import parsing.souffle.SouffleParser;
import parsing.symbols.SouffleContext;
import parsing.symbols.SouffleProjectContext;
import parsing.symbols.SouffleSymbol;
import parsing.symbols.SouffleSymbolType;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

/**
 * TextDocumentService implementation for Souffle Datalog.
 */
public class SouffleTextDocumentService implements TextDocumentService {

    private SouffleLanguageServer languageServer;
    private LSClientLogger  clientLogger;
    private SouffleProjectContext projectContext;

    public SouffleTextDocumentService(SouffleLanguageServer languageServer) {
        this.languageServer = languageServer;
        this.clientLogger = LSClientLogger.getInstance();
        this.projectContext = SouffleProjectContext.getInstance();
    }

/*    private void consumeInput(String documentURI) throws IOException, URISyntaxException {
        URI uri = new URI(documentURI);
        CharStream input = CharStreams.fromPath(Path.of(uri));
        souffleLexer = new SouffleLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(souffleLexer);
        souffleParser = new SouffleParser(tokens);
        souffleParser.removeErrorListeners();
        souffleParser.setErrorHandler(new parsing.SouffleError());
        souffleParser.addErrorListener(new SyntaxErrorListener(uri.toString()));
    }*/

    private void parseInput(String documentURI) throws IOException, URISyntaxException {
        URI uri = new URI(documentURI);
        Path path = Path.of(uri);
        CharStream input = CharStreams.fromPath(path);
        preprocessInput(input);

        input = CharStreams.fromPath(path);
        SouffleLexer souffleLexer = new SouffleLexer(input, projectContext.defines);
        CommonTokenStream tokens = new CommonTokenStream(souffleLexer);
        SouffleParser souffleParser = new SouffleParser(tokens);
        souffleParser.removeErrorListeners();
        souffleParser.setErrorHandler(new SouffleError());
        souffleParser.addErrorListener(new SouffleSyntaxErrorListener(uri.toString()));
        SouffleProjectContext projectContext = SouffleProjectContext.getInstance();
        SouffleDeclarationVisitor visitor = new SouffleDeclarationVisitor(souffleParser, uri.toString(), projectContext);
        visitor.visit(souffleParser.program());

        projectContext.addDocument(uri.toString(), visitor.getDocumentContext());
        souffleParser.removeErrorListeners();
        souffleParser.reset();
        SouffleUsesVisitor visitor2 = new SouffleUsesVisitor(souffleParser, uri.toString());
        visitor2.visit(souffleParser.program());
    }

    private void preprocessInput(CharStream input) {
        PreprocessorLexer preprocessorLexer = new PreprocessorLexer(input);
        CommonTokenStream preprocessorTokens = new CommonTokenStream(preprocessorLexer);
        PreprocessorParser preprocessorParser = new PreprocessorParser(preprocessorTokens);
        PreprocessorVisitor preprocessorVisitor = new PreprocessorVisitor(projectContext.defines);
        preprocessorVisitor.visit(preprocessorParser.program());
    }

    @Override
    public void didOpen(DidOpenTextDocumentParams didOpenTextDocumentParams) {
        try {
            URI uri = new URI(didOpenTextDocumentParams.getTextDocument().getUri());
            this.clientLogger.clearDiagnostics(uri.toString());
            parseInput(didOpenTextDocumentParams.getTextDocument().getUri());
//            SouffleContext context = SouffleProjectContext.getInstance().getDocumentContext(didOpenTextDocumentParams.getTextDocument().getUri());
//            LSClientLogger.getInstance().reportHint(context.getRange(), uri.toString(), "Lint");
            this.clientLogger.logMessage("Operation '" + "text/didOpen" +
                    "' {fileUri: '" + uri + "'} opened");
        } catch (URISyntaxException | IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void didChange(DidChangeTextDocumentParams didChangeTextDocumentParams) {
        SouffleProjectContext.getInstance().setChangedText(didChangeTextDocumentParams.getContentChanges().get(0).getText());
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
            parseInput(didSaveTextDocumentParams.getTextDocument().getUri());
            CompletionProvider.state = CompletionState.IDLE;
            this.clientLogger.logMessage("Operation '" + "text/didSave" +
                    "' {fileUri: '" + didSaveTextDocumentParams.getTextDocument().getUri() + "'} Saved");
        } catch (IOException | URISyntaxException e) {
            e.printStackTrace();
        }


    }

    @Override
    public CompletableFuture<Either<List<? extends Location>, List<? extends LocationLink>>> definition(DefinitionParams params) {
        return CompletableFuture.supplyAsync(() -> new DefinitionProvider().getDefinition(params));
    }

    @Override
    public CompletableFuture<List<Either<Command, CodeAction>>> codeAction(CodeActionParams params) {
        return CompletableFuture.supplyAsync(() -> {
            List<Either<Command, CodeAction>> actions = new ArrayList<>();

//            CodeAction codeAction = new CodeAction("Lint with Souffle Lint");
//            Command command = new Command();
//            command.setCommand("lint");
//            Path path = Path.of(URI.create(params.getTextDocument().getUri()));
//            command.setArguments(List.of(path.toString()));
//            codeAction.setCommand(command);
//            codeAction.setKind(CodeActionKind.Source+".lint");
////            codeAction.setDiagnostics(LSClientLogger.getInstance().diagnostics.get(params.getTextDocument().getUri()));
//            actions.add(Either.forRight(codeAction));

            Range cursor = params.getRange();
            SouffleContext context = SouffleProjectContext.getInstance().getContext(params.getTextDocument().getUri(), cursor);
            if (context != null) {
                SouffleSymbol currentSymbol = context.getSymbol(cursor);
                if (currentSymbol != null) {
                    if(currentSymbol.getKind() == SouffleSymbolType.RELATION_USE ||
                            currentSymbol.getKind() == SouffleSymbolType.RELATION_DECL
                    ){
                        CodeAction inputAction = new CodeAction("Generate .input for relation " + currentSymbol.getName());
                        inputAction.setKind(CodeActionKind.Refactor);
                        actions.add(Either.forRight(inputAction));
                        WorkspaceEdit edit = new WorkspaceEdit();
                        TextEdit textEdit = new TextEdit();
                        textEdit.setNewText(".input " + currentSymbol.getName() + "()\n");


                        Position end;
                        if(currentSymbol.getKind() == SouffleSymbolType.RELATION_DECL){
                            end = currentSymbol.getRange().getEnd();
                        } else {
                            end = context.getRange().getEnd();
                        }
                        Position position = new Position(end.getLine() + 2, 0);
                        Range newRange = new Range(position, position);
                        textEdit.setRange(newRange);
                        edit.setChanges(Map.of(params.getTextDocument().getUri(), List.of(textEdit)));
                        inputAction.setEdit(edit);

                        CodeAction outputAction = new CodeAction("Generate .output for relation " + currentSymbol.getName());
                        outputAction.setKind(CodeActionKind.Refactor);
                        actions.add(Either.forRight(outputAction));
                        WorkspaceEdit edit1 = new WorkspaceEdit();
                        TextEdit textEdit1 = new TextEdit();
                        textEdit1.setNewText(".output " + currentSymbol.getName() + "()\n");

                        textEdit1.setRange(newRange);
                        edit1.setChanges(Map.of(params.getTextDocument().getUri(), List.of(textEdit1)));
                        outputAction.setEdit(edit1);

                        if(currentSymbol.getKind() == SouffleSymbolType.RELATION_DECL && currentSymbol.getPotentialDocumentation().getKey() != null){
                            CodeAction formatComments = new CodeAction("Format documentation with /* */");
                            formatComments.setKind(CodeActionKind.Refactor);
                            WorkspaceEdit commentEdit = new WorkspaceEdit();
                            TextEdit commentTextEdit = new TextEdit();
                            commentTextEdit.setRange(currentSymbol.getPotentialDocumentation().getValue());
                            commentTextEdit.setNewText(currentSymbol.getPotentialDocumentation().getKey());
                            commentEdit.setChanges(Map.of(params.getTextDocument().getUri(), List.of(commentTextEdit)));
                            formatComments.setEdit(commentEdit);
                            actions.add(Either.forRight(formatComments));
                        }

                    }
                }
            }

            return actions;
        });
    }

    @Override
    public CompletableFuture<Hover> hover(HoverParams params) {
        return CompletableFuture.supplyAsync(() -> new HoverProvider().getHover(params));
    }

    @Override
    public CompletableFuture<List<? extends Location>> references(ReferenceParams params) {
        return CompletableFuture.supplyAsync(() -> new ReferenceProvider().getReferences(params));

    }

    @Override
    public CompletableFuture<Either<List<CompletionItem>, CompletionList>> completion(CompletionParams position) {
        return CompletableFuture.supplyAsync(() -> new CompletionProvider(position).getCompletions());
    }

    @Override
    public CompletableFuture<WorkspaceEdit> rename(RenameParams params) {
        return CompletableFuture.supplyAsync(() -> new RenameProvider().getRename(params));
    }

    @Override
    public CompletableFuture<Either<List<? extends Location>, List<? extends LocationLink>>> typeDefinition(TypeDefinitionParams params) {
        return CompletableFuture.supplyAsync(() -> new TypeDefinitionProvider().getTypeDefinition(params));
    }

    @Override
    public CompletableFuture<Either<List<? extends Location>, List<? extends LocationLink>>> implementation(ImplementationParams params) {
        return CompletableFuture.supplyAsync(() -> new ImplementationProvider().getImplementations(params));
    }

    @Override
    public CompletableFuture<SignatureHelp> signatureHelp(SignatureHelpParams params) {
        return CompletableFuture.supplyAsync(() -> new SignatureHelpProvider().getSignatureHelp(params));
    }

    @Override
    public CompletableFuture<List<Either<SymbolInformation, DocumentSymbol>>> documentSymbol(DocumentSymbolParams params) {
        return CompletableFuture.supplyAsync(() -> new DocumentSymbolProvider().getDocumentSymbols(params));
    }

}
