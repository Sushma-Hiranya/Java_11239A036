import javax.swing.*;
import java.awt.*;

public class Face extends JPanel {

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.drawOval(40, 40, 120, 150);
        g.drawOval(57, 75, 30, 20);
        g.drawOval(110, 75, 30, 20);

        g.fillOval(68, 81, 10, 10);
        g.fillOval(121, 81, 10, 10);

        g.fillOval(85, 100, 30, 30);
        g.drawArc(60, 125, 80, 40, 180, 180);

        g.drawOval(25, 92, 15, 30);
        g.drawOval(160, 92, 15, 30);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Face Drawing");
        Face panel = new Face();

        frame.add(panel);
        frame.setSize(250, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
