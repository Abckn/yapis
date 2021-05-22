package gen.my;

import org.antlr.v4.runtime.*;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.util.List;

public class Walker extends BaseErrorListener {

    private static  boolean errors = false;

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine,
                            String msg, RecognitionException e) {

        List<String> stack = ((Parser) recognizer).getRuleInvocationStack();
        Collections.reverse(stack);

        JDialog dialog = new JDialog();
        Container contentPane = dialog.getContentPane();
        String buf = "rule stack: " + stack + " " +
                "line " + line + ":" + charPositionInLine + " at " + offendingSymbol + msg;

        contentPane.add(new JLabel(buf));
        contentPane.setBackground(Color.WHITE);

        dialog.setTitle("Syntax error");
        dialog.pack();
        dialog.setLocationRelativeTo(null);
        dialog.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        dialog.setVisible(true);

        errors = true;
    }

    public static void setErrors(boolean error) {
        errors = error;
    }

    public static boolean isErrors() {
        return errors;
    }
}
