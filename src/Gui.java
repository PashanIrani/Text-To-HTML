import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;

public class Gui extends JFrame{
    
    static JTextPane editorPane = new JTextPane();
    JPanel formatButtons = new JPanel();
    JLabel label = new JLabel();
    JButton bold = new JButton("BOLD");
    BoldButton boldb = new BoldButton();
    
    public Gui(String s){
        super(s);
        setSize(400, 400);// fix window size
        setVisible(true);// make window visible
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());
        add(formatButtons);
        formatButtons.add(editorPane);
        formatButtons.add(bold);
        editorPane.setEditable(true);
        editorPane.setContentType("text/html");
        editorPane.setText("plain text");
        System.out.println(editorPane.getEditorKit());
        bold.addActionListener(new buttonClicked());
    }
    
    
    class buttonClicked implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == bold) {
                boldb.performAction();
            }
        }
    }
    
    public static void setTextBold(){
        String s = "";
        System.out.println(editorPane.getText());
        System.out.println("----------------------");
        s = "<b>" + editorPane.getSelectedText() + "</b>";
        editorPane.replaceSelection(s);
    }
}
