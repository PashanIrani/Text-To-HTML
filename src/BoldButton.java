import javax.swing.JTextPane;

public class BoldButton extends FormatButtons{

    public BoldButton(String string) {
        super(string);
    }

    void performAction(JTextPane pane) {
        System.out.println("SENT TO CLASS - BOLD");
        setTextChar('*', pane);
    }
    
}
