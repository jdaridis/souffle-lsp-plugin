import org.antlr.v4.runtime.*;
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
    private ProjectContext projectContext;


    public SouffleTextDocumentService(SouffleLanguageServer languageServer) {
        this.languageServer = languageServer;
        this.clientLogger = LSClientLogger.getInstance();
        this.projectContext = new ProjectContext();
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

            // begin parsing at init rule
            SouffleGeneratorVisitor visitor = new SouffleGeneratorVisitor(souffleParser);
            visitor.visit(souffleParser.program());

            projectContext.addDocument(uri.toString(), visitor.getDocumentContext());
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
            SouffleGeneratorVisitor visitor = new SouffleGeneratorVisitor(souffleParser);
            visitor.visit(souffleParser.program());

            projectContext.addDocument(didSaveTextDocumentParams.getTextDocument().getUri(), visitor.getDocumentContext());
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
            Range cursor = new Range(params.getPosition(), params.getPosition());
            SouffleContext context = projectContext.getContext(params.getTextDocument().getUri(), cursor);
            System.err.println("Context " + context);
            Hover hover = new Hover();
            MarkupContent content = new MarkupContent();
            content.setValue("Test hover");
            content.setKind(MarkupKind.PLAINTEXT);
            hover.setContents(content);
            if(context != null){
                SouffleSymbol currentSymbol = context.getSymbol(cursor);
                if(currentSymbol != null){
                    System.err.println(currentSymbol);
                    content.setValue(currentSymbol.getName());
                }
            }

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
            List<Either<SymbolInformation, DocumentSymbol>> documentSymbols = new ArrayList<>();
            SouffleContext context = projectContext.getDocumentContext(params.getTextDocument().getUri());

            for(List<SouffleSymbol> symbolList: context.getScope().values()){
                DocumentSymbol top = null;
                SouffleSymbol topSymbol = null;
                List<DocumentSymbol> children = new ArrayList<>();
                for(SouffleSymbol symbol: symbolList){
                    switch (symbol.getKind()){
                        case RELATION_DECL:
                            topSymbol = symbol;
                            top = new DocumentSymbol();
                            top.setDetail("Test symbol");
                            top.setKind(SymbolKind.Class);
                            top.setName(symbol.toString());
                            top.setRange(symbol.getRange());
                            top.setSelectionRange(symbol.getRange());
                            break;
                        case RELATION_USE:
                            DocumentSymbol use = new DocumentSymbol();
                            if(topSymbol == null || topSymbol.getKind() == SouffleSymbolType.RELATION_USE){
                                topSymbol = symbol;
                                top = use;
                            }
                            use.setDetail("Test symbol");
                            use.setKind(SymbolKind.Field);
                            use.setName(symbol.toString());
                            use.setRange(symbol.getRange());
                            use.setSelectionRange(symbol.getRange());
                            children.add(use);
                            break;
                        case RULE:
                            List<DocumentSymbol> ruleChildren = new ArrayList<>();
                            DocumentSymbol rule = new DocumentSymbol();
                            if(topSymbol == null || topSymbol.getKind() == SouffleSymbolType.RULE){
                                topSymbol = symbol;
                                top = rule;
                            }
                            rule.setDetail("Test symbol");
                            rule.setKind(SymbolKind.Method);
                            rule.setName(symbol.toString());
                            rule.setRange(symbol.getRange());
                            rule.setSelectionRange(symbol.getRange());
                            children.add(rule);

                            SouffleRule souffleRule = (SouffleRule) symbol;
                            for(SouffleSymbol ruleBody: souffleRule.getBody()){
                                DocumentSymbol body = new DocumentSymbol();
                                body.setDetail("Test symbol");
                                body.setKind(SymbolKind.Property);
                                body.setName(ruleBody.toString());
                                body.setRange(ruleBody.getRange());
                                body.setSelectionRange(ruleBody.getRange());
                                ruleChildren.add(body);
                            }
                            rule.setChildren(ruleChildren);

                            break;
                    }
                }
                if (top != null) {
                    if(topSymbol.getKind() == SouffleSymbolType.RELATION_DECL || topSymbol.getKind() == SouffleSymbolType.COMPONENT_DECL){
                        top.setChildren(children);
                    }
                    documentSymbols.add(Either.forRight(top));
                }
            }

           return documentSymbols;
        });
    }
}
