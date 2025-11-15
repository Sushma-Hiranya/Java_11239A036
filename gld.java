import javax.swing.*;
import java.awt.*;

public class gld extends JFrame {

    public gld() {

        setTitle("Grid Layout Demo");
        setLayout(new GridLayout(5, 2, 10, 10));  // 5 rows, 2 columns
        
        // Create 10 buttons
        JButton b1 = new JButton("A");
        JButton b2 = new JButton("B");
        JButton b3 = new JButton("C");
        JButton b4 = new JButton("D");
        JButton b5 = new JButton("E");
        JButton b6 = new JButton("F");
        JButton b7 = new JButton("G");
        JButton b8 = new JButton("H");
        JButton b9 = new JButton("I");
        JButton b10 = new JButton("J");

        // Add buttons to frame
        add(b1); add(b2); add(b3); add(b4); add(b5);
        add(b6); add(b7); add(b8); add(b9); add(b10);

        // Frame settings
        setSize(300, 300);
        setLocationRelativeTo(null); // center screen
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new gld();
    }
}
