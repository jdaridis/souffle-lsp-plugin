import org.antlr.v4.runtime.DefaultErrorStrategy;
import org.antlr.v4.runtime.NoViableAltException;
import org.antlr.v4.runtime.Parser;
import org.eclipse.lsp4j.Range;
import visitors.SouffleParser;

public class SouffleCurrentTokenError extends DefaultErrorStrategy {
    Range currentPos;
    String currentToken;

    public SouffleCurrentTokenError(Range currentPos) {
        this.currentPos = currentPos;
    }

    public SouffleCurrentTokenError() {
    }

    @Override
    protected void reportNoViableAlternative(Parser recognizer, NoViableAltException e) {
        int offTokenIndex = e.getOffendingToken().getTokenIndex();
        while (!recognizer.getTokenStream().get(offTokenIndex).getText().equals("(")){
            offTokenIndex--;
        }
        currentToken = recognizer.getTokenStream().get(offTokenIndex - 1).getText();
        System.err.println(currentToken);
    }
}
