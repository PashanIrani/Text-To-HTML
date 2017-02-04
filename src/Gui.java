import java.awt.BorderLayout;

import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Gui extends JFrame{
    
    JEditorPane editorPane = new JEditorPane();
    JLabel label = new JLabel();
    public Gui(String s){
        super(s);
        setSize(400, 400);// fix window size
        setVisible(true);// make window visible
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new BorderLayout());
        add(editorPane, BorderLayout.CENTER);
    }
}
