import javax.swing.*;
import java.awt.*;

public class face extends JPanel {

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Face outline
        g.setColor(Color.orange);
        g.fillOval(100, 50, 200, 250);

        // Eyes
        g.setColor(Color.white);
        g.fillOval(150, 120, 40, 30);
        g.fillOval(210, 120, 40, 30);

        // Pupils
        g.setColor(Color.black);
        g.fillOval(165, 130, 10, 10);
        g.fillOval(225, 130, 10, 10);

        // Nose
        g.drawLine(200, 150, 190, 200);
        g.drawLine(190, 200, 210, 200);

        // Mouth
        g.setColor(Color.red);
        g.drawArc(150, 220, 100, 50, 0, -180);

        // Title
        g.setColor(Color.black);
        g.drawString("Smiling Face 😊", 160, 330);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Face Drawing");
        face panel = new face();

        frame.add(panel);
        frame.setSize(450, 450);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
