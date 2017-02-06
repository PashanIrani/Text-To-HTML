import javax.swing.JButton;
import javax.swing.JTextPane;

public abstract class FormatButtons extends JButton{

    public FormatButtons(String string) {
        super(string);
    }

    abstract void performAction(JTextPane pane);

    public static void setTextChar(char c, JTextPane pane){
        int start = pane.getSelectionStart();
        int end = pane.getSelectionEnd();

        if(end - start > 0){
            String s = pane.getSelectedText();
            pane.replaceSelection(c + s + c);
        }
    }
}
