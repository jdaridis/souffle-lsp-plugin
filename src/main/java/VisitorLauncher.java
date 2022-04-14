import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.eclipse.lsp4j.Position;
import org.eclipse.lsp4j.Range;
import org.eclipse.lsp4j.util.Positions;
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
//        File file = new File("analysis.dl");
//        System.out.println(file.toURI()); // print LISP-style tree
//        // create a CharStream that reads from standard input
//        CharStream input = null;
//        try {
//            input = CharStreams.fromFileName("analysis.dl");
//            // create a lexer that feeds off of input CharStream
//            SouffleLexer lexer = new SouffleLexer(input);
//// create a buffer of tokens pulled from the lexer
//            CommonTokenStream tokens = new CommonTokenStream(lexer);
//// create a parser that feeds off the tokens buffer
//            SouffleParser parser = new SouffleParser(tokens);
//            ParseTree tree = parser.program(); // begin parsing at init rule
//            System.out.println(tree.toStringTree(parser)); // print LISP-style tree
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

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
        Range range3 = new Range(new Position(3, 3), new Position(3, 10));

        treeMap.put(range1, "Range1");
        treeMap.put(range3, "Range3");
        treeMap.put(range2, "Range2");
//        treeMap.
        Range range = new Range(new Position(2,2), new Position(2,2));
        TreeMap<Range, String> treeMap1 = (TreeMap<Range, String>) treeMap.clone();
        treeMap.remove(range);
        System.out.println("Getting treemap " + treeMap);
        System.err.println("Getting treemap ");


        String context;



    }
}
