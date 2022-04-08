import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import visitors.SouffleLexer;
import visitors.SouffleParser;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class VisitorLauncher {

    public static void main(String[] args) {
        File file = new File("analysis.dl");
        System.out.println(file.toURI()); // print LISP-style tree
        // create a CharStream that reads from standard input
        CharStream input = null;
        try {
            input = CharStreams.fromFileName("analysis.dl");
            // create a lexer that feeds off of input CharStream
            SouffleLexer lexer = new SouffleLexer(input);
// create a buffer of tokens pulled from the lexer
            CommonTokenStream tokens = new CommonTokenStream(lexer);
// create a parser that feeds off the tokens buffer
            SouffleParser parser = new SouffleParser(tokens);
            ParseTree tree = parser.program(); // begin parsing at init rule
            System.out.println(tree.toStringTree(parser)); // print LISP-style tree
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
