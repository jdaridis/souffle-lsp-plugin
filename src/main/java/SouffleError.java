import org.antlr.v4.runtime.DefaultErrorStrategy;
import org.antlr.v4.runtime.NoViableAltException;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.Token;

public class SouffleError extends DefaultErrorStrategy {
    @Override
    protected void reportNoViableAlternative(Parser recognizer, NoViableAltException e) {
        String msg = "Syntax error at ";
        switch (recognizer.getRuleInvocationStack().get(0)){
            case "souffle_rule":
                msg += "rule ";
                break;
            default:
                msg += "symbol ";
                break;
        }
//        int offTokenIndex = e.getOffendingToken().getTokenIndex();
//        while (!recognizer.getTokenStream().get(offTokenIndex).getText().equals("(")){
//            offTokenIndex--;
//        }
//
//        System.err.println(recognizer.getTokenStream().get(offTokenIndex - 1).getText());
        msg += recognizer.getCurrentToken().getText();
        recognizer.notifyErrorListeners(e.getOffendingToken(), msg, e);

    }


}
