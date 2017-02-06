import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;

public class Gui extends JFrame{

    static JTextPane editorPane = new JTextPane();
    static JTextPane htmlPane = new JTextPane();
    JPanel formatButtons = new JPanel();
    JPanel textInputPanel = new JPanel();
    JLabel label = new JLabel();

    BoldButton bold = new BoldButton("B");

    ItalicsButton italics = new ItalicsButton("I");



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
        formatButtons.add(italics);

        textInputPanel.add(editorPane);


        editorPane.setPreferredSize(new Dimension(200, 100));

        bold.addActionListener(new buttonClicked());
        italics.addActionListener(new buttonClicked());
    }


    class buttonClicked implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == bold) {
                bold.performAction(editorPane);
            } else if(e.getSource() == italics) {
                italics.performAction(editorPane);
            }
        }
    }

    


}
