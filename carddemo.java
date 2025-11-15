import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class carddemo extends JFrame implements ActionListener {

    CardLayout cardLayout;
    JPanel panel;
    JButton b1, b2, b3;

    public carddemo() {

        cardLayout = new CardLayout();
        panel = new JPanel(cardLayout);

        b1 = new JButton("First Button");
        b2 = new JButton("Second Button");
        b3 = new JButton("Third Button");

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);

        panel.add(b1, "1");
        panel.add(b2, "2");
        panel.add(b3, "3");

        add(panel);

        setSize(300, 200);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        cardLayout.next(panel);
    }

    public static void main(String[] args) {
        new carddemo();
    }
}
