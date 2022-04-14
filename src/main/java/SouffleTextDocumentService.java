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

        TreeMap<Range, String> treeMap = new TreeMap<>(new Comparator<Range>() {
            @Override
            public int compare(Range range, Range t1) {
                Position currentPos = range.getStart();
//                System.err.println("Range " + range + " t1 "+ t1);
                if(Positions.isBefore(currentPos, t1.getStart())){
//                    System.err.println("Going left");
                    return -1;
                } else if(!Positions.isBefore(currentPos, t1.getEnd())){
//                    System.err.println("Going right");
                    return 1;
                }
                if(range.getStart().equals(range.getEnd()))
                    return 0;
                else
                    return 1;
            }
        });

        Range range1 = new Range(new Position(1, 0), new Position(3, 1));
        Range range2 = new Range(new Position(2, 0), new Position(2,3));

        treeMap.put(range2, "Range2");
        treeMap.put(range1, "Range1");
//        treeMap.
        Range range = new Range(new Position(2,2), new Position(2,2));
//        TreeMap<Range, String> treeMap1 = (TreeMap<Range, String>) treeMap.clone();
//        treeMap.remove(range);
        System.err.println("Getting treemap " + treeMap);
//        System.err.println("Getting treemap " + treeMap1);

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
//            CompletionList

            this.clientLogger.logMessage("Operation '" + "text/completion");

            return Either.forLeft(directiveComplete);
        });
    }
}
