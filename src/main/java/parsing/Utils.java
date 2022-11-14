package parsing;

import org.antlr.v4.runtime.BufferedTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.eclipse.lsp4j.Position;
import org.eclipse.lsp4j.Range;
import org.eclipse.xtext.xbase.lib.Pair;
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
            if (cmt!=null && cmt.getText().contains("/*")) {
                documentation = cmt.getText().replaceAll("\\*", "").replaceAll("/", "").trim();
            } else {
                StringBuilder sb = new StringBuilder();
                for(Token token: cmtChannel){
                    if(token != null && token.getText().contains("//")){
                        sb.append(token.getText().replaceAll("\\*", "").replaceAll("/", "").trim());
                    }
                }
                documentation = sb.toString();
            }
        }
        return documentation;
    }

    public static Pair<String, Range> getPotentialDocumentation(Token ctx, SouffleParser souffleParser) {
        String documentation = null;
        Range range = null;
        int i = ctx.getTokenIndex();
        BufferedTokenStream tokens = (BufferedTokenStream) souffleParser.getTokenStream();
        List<Token> cmtChannel =
                tokens.getHiddenTokensToLeft(i, SouffleLexer.HIDDEN);
        StringBuilder sb = new StringBuilder("\t/**\n");
        if ( cmtChannel!=null ) {
            for(Token token: cmtChannel){

                if(token != null && token.getText().contains("//")){
                    sb.append("\t\t");
                    sb.append(token.getText().replaceAll("\\*", "").replaceAll("/", "").trim());
                    sb.append("\n");
                } else return Pair.of(null,null);
            }
            sb.append("\t*/");
            documentation = sb.toString();
            Position p1 = new Position(cmtChannel.get(0).getLine() - 1, 0);
            Position p2 = new Position(cmtChannel.get(cmtChannel.size() - 1).getLine() - 1, cmtChannel.get(cmtChannel.size() - 1).getStopIndex());
            range = new Range(p1, p2);
        }

        return Pair.of(documentation, range);
    }
}