import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class jframe {
    public static void run() {

        JFrame frame = new JFrame();

        ImageIcon logo = new ImageIcon("NTAwLmpwZw.png");

        JLabel Header = new JLabel();
        Header.setText("BURESU");
        Header.setIcon(logo);

        
        frame.add(Header);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,550);
        frame.setTitle("Calculator");
        frame.setResizable(true);
        frame.getContentPane().setBackground(new Color (0, 0, 0));
        frame.setIconImage(logo.getImage());
        
    }  
}