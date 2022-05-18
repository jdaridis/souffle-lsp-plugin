import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.eclipse.lsp4j.Position;
import org.eclipse.lsp4j.Range;
import org.eclipse.lsp4j.util.Positions;
import preprocessor.PreprocessorLexer;
import preprocessor.PreprocessorParser;
import visitors.SouffleLexer;
import visitors.SouffleParser;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.TreeMap;

public class VisitorLauncher {

    public static void main(String[] args) {
        File file = new File("analysis.dl");
        System.out.println(file.toURI()); // print LISP-style tree
        // create a CharStream that reads from standard input
        CharStream input = null;
        try {
            input = CharStreams.fromFileName("test_souffle.dl");
            // create a lexer that feeds off of input CharStream
            PreprocessorLexer lexer = new PreprocessorLexer(input);
// create a buffer of tokens pulled from the lexer
            CommonTokenStream tokens = new CommonTokenStream(lexer);
// create a parser that feeds off the tokens buffer
            PreprocessorParser parser = new PreprocessorParser(tokens);

            PreprocessorVisitor visitor = new PreprocessorVisitor();

            visitor.visit(parser.program());

            System.err.println(visitor.defines);
//            SouffleGeneratorVisitor visitor = new SouffleGeneratorVisitor(parser);
//            visitor.visit(parser.program());
//            ParseTree tree = ; // begin parsing at init rule
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
