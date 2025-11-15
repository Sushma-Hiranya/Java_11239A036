import javax.swing.*;
import java.awt.*;

public class HumanFace extends JPanel {

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Face outline
        g.setColor(Color.ORANGE);
        g.fillOval(100, 50, 200, 250);

        // Eyes
        g.setColor(Color.WHITE);
        g.fillOval(150, 120, 40, 30);
        g.fillOval(210, 120, 40, 30);

        // Pupils
        g.setColor(Color.BLACK);
        g.fillOval(165, 130, 10, 10);
        g.fillOval(225, 130, 10, 10);

        // Nose
        g.drawLine(200, 150, 190, 200);
        g.drawLine(190, 200, 210, 200);

        // Mouth
        g.setColor(Color.RED);
        g.drawArc(150, 220, 100, 50, 0, -180);

        // Label
        g.setColor(Color.BLACK);
        g.drawString("Smiling Face", 170, 330);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Human Face");
        HumanFace hf = new HumanFace();

        frame.add(hf);
        frame.setSize(400, 450);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
