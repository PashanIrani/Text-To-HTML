import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

public class Gui extends JFrame{
    
    static JTextPane editorPane = new JTextPane();
    JPanel formatButtons = new JPanel();
    JPanel textInputPanel = new JPanel();
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
        
        
        add(formatButtons, BorderLayout.NORTH);
        add(textInputPanel, BorderLayout.CENTER);
        
        formatButtons.add(bold);
        

        textInputPanel.add(editorPane);
        
        
        editorPane.setPreferredSize(new Dimension(200, 100));
        
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
        StyledDocument doc = editorPane.getStyledDocument();
        String s = editorPane.getSelectedText();
        int selectionStart = editorPane.getSelectionStart();
        int selectionEnd = editorPane.getSelectionEnd();
        
       
        Style style = editorPane.addStyle(s, null);
        StyleConstants.setBold(style, true);
        doc.setCharacterAttributes(selectionStart, selectionEnd - selectionStart, style, false);
        
        System.out.println(s);
    }
}
