package parsing;

import org.antlr.v4.runtime.BufferedTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.eclipse.lsp4j.Position;
import org.eclipse.lsp4j.Range;
import parsing.souffle.SouffleLexer;
import parsing.souffle.SouffleParser;

import java.util.List;

public class Utils {
    private Utils(){}
    public static Range toRange(ParserRuleContext ctx) {
        Position start = new Position(ctx.getStart().getLine() - 1, ctx.getStart().getCharPositionInLine());
        Position end = new Position(ctx.getStop().getLine() - 1, ctx.getStop().getCharPositionInLine() + ctx.getStop().getText().length());
        return new Range(start, end);
    }

    public static Range toRange(TerminalNode ctx) {
        Position start = new Position(ctx.getSymbol().getLine() - 1, ctx.getSymbol().getCharPositionInLine());
        Position end = new Position(ctx.getSymbol().getLine() - 1, ctx.getSymbol().getCharPositionInLine() + ctx.getSymbol().getText().length());
        return new Range(start, end);
    }

    public static Range positionToRange(Position position){
        return new Range(position, position);
    }

    public static String getDocumentation(Token ctx, SouffleParser souffleParser) {
        String documentation = null;
        int i = ctx.getTokenIndex();
        BufferedTokenStream tokens = (BufferedTokenStream) souffleParser.getTokenStream();
        List<Token> cmtChannel =
                tokens.getHiddenTokensToLeft(i, SouffleLexer.HIDDEN);
        if ( cmtChannel!=null ) {
            Token cmt = cmtChannel.get(cmtChannel.size() - 1);
            if ( cmt!=null ) {
                documentation = cmt.getText().replaceAll("\\*", "").replaceAll("/", "").trim();
            }
        }
        return documentation;
    }
}