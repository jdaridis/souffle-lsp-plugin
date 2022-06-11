package parsing;

import org.antlr.v4.runtime.DefaultErrorStrategy;
import org.antlr.v4.runtime.NoViableAltException;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.Token;
import org.eclipse.lsp4j.Position;
import org.eclipse.lsp4j.Range;

public class SouffleCurrentTokenError extends DefaultErrorStrategy {
    Range currentPos;
    private String currentToken;

    public String getCurrentToken() {
        return currentToken;
    }

    public void setCurrentToken(String currentToken) {
        this.currentToken = currentToken;
    }

    public SouffleCurrentTokenError(Range currentPos) {
        this.currentPos = currentPos;
    }

    public SouffleCurrentTokenError() {
    }

    @Override
    protected void reportNoViableAlternative(Parser recognizer, NoViableAltException e) {
        int offTokenIndex = e.getOffendingToken().getTokenIndex();
        while (true){
            Token tempToken = recognizer.getTokenStream().get(offTokenIndex);
            Position position = new Position(tempToken.getLine() - 1, tempToken.getCharPositionInLine());
            if (tempToken.getText().equals("(") || position.getLine() < currentPos.getStart().getLine()) break;
            offTokenIndex--;
        }
        currentToken = recognizer.getTokenStream().get(offTokenIndex - 1).getText();

        System.err.println(currentToken);
    }
}
