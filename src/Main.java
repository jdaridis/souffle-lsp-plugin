import org.antlr.v4.runtime.*;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            CharStream charStream = CharStreams.fromStream(System.in);
            Souffle souffle = new Souffle(charStream);
            System.out.println("Parsed input");
            // create a buffer of tokens pulled from the lexer
            CommonTokenStream tokens = new CommonTokenStream(souffle);
            System.out.println(tokens.getTokens());
            for(Token token: tokens.getTokens()){
                System.out.println("Token" + token.getText());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
