import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;
import javax.swing.border.LineBorder;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class jaikaal {
    public static void main(String[] args) {

        Color LightGray = new Color(212, 212, 210);
        Color DarkGray = new Color(80, 80, 80);
        Color Black = new Color(28, 28, 28);
        Color Orange = new Color(255, 159, 0);
        
        JFrame frame = new JFrame("jaikaal");

        // Here we're working inside jframe but outside our Calculator
        // Basically Declaring Stuff Before It Goes Inside our jframe Calculator
        JLabel dl = new JLabel();
        JPanel dp = new JPanel();
        JPanel but = new JPanel();
        
        // Below Is Basically The Background
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setSize(420,550);
        frame.setTitle("JFrame Calculator");
        frame.setResizable(true);
        frame.getContentPane().setBackground(new Color (0, 0, 0));
        frame.setLayout(new BorderLayout());  


        // Basically we're making a small window here on top of a window kinda like a element
        dl.setBackground(Black);
        dl.setForeground(Color.white);
        dl.setFont(new Font("Arial", Font.PLAIN, 80));
        dl.setHorizontalAlignment(JLabel.RIGHT);
        dl.setText("0");
        dl.setOpaque(true);

        // Now We are adding the Label which was element On TOP of the display panel
        dp.setLayout(new BorderLayout());
        dp.add(dl);
        frame.add(dp, BorderLayout.NORTH); //Basically sending the panel to the topmost
    }  
}