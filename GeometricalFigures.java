import javax.swing.*;
import java.awt.*;

public class GeometricalFigures extends JPanel {

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Rectangle
        g.drawRect(50, 50, 100, 60);

        // Circle
        g.drawOval(200, 50, 60, 60);

        // Line
        g.drawLine(50, 150, 150, 200);

        // Filled Rectangle
        g.setColor(Color.blue);
        g.fillRect(250, 150, 80, 50);

        // Filled Oval
        g.setColor(Color.red);
        g.fillOval(100, 220, 60, 60);

        g.setColor(Color.black);
        g.drawString("Simple Geometrical Figures", 100, 20);
    }

    public static void main(String[] args) {
        JFrame f = new JFrame("Geometrical Figures");
        GeometricalFigures panel = new GeometricalFigures();

        f.add(panel);
        f.setSize(400, 350);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
