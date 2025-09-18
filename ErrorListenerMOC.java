import org.antlr.v4.runtime.*;

public class ErrorListenerMOC extends BaseErrorListener {

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer,
                            Object offendingSymbol,
                            int line,
                            int charPositionInLine,
                            String msg,
                            RecognitionException e) {

        System.err.println("Erro Sintático na linha " + line + ":" + charPositionInLine + " - " + msg);
    }
}
