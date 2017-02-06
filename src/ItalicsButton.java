import javax.swing.JTextPane;

public class ItalicsButton extends FormatButtons{
    
    public ItalicsButton(String string) {
        super(string);
    }
    
    void performAction(JTextPane pane) {
        System.out.println("SENT TO CLASS - Italics");
        setTextChar('_', pane);
    }
    
}
