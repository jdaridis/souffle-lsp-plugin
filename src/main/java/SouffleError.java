import org.antlr.v4.runtime.DefaultErrorStrategy;
import org.antlr.v4.runtime.NoViableAltException;
import org.antlr.v4.runtime.Parser;

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

        msg += recognizer.getCurrentToken().getText();
        recognizer.notifyErrorListeners(e.getOffendingToken(), msg, e);

    }


}
