import javax.swing.*;
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class Task4 extends JPanel {

    private int radius = 100;
    Random random = new Random();

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int x = getWidth()/2;
        int y = getHeight()/2;

        radius = 100;

        g.setColor(Color.YELLOW);
        g.fillOval(x - radius, y - radius, 2 * radius, 2 * radius); // Face

        g.setColor(Color.BLACK);
        g.fillOval(x - radius/2, y - radius/2, 30, 30); // Eyes
        g.fillOval(x + radius/2 - 30, y - radius/2, 30, 30); // Eyes
        g.fillOval(x - radius/2, y + radius/2 - 37, 100, 40); //lips

        g.setColor(Color.YELLOW);
        g.fillRect(x - radius/2, y + radius/2 - 25 , 100, 25/2); // hides half lips
        g.fillOval(x - radius/2 , y + radius/2 - 37 , 100, 34); //lips
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Task4");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.add(new Task4());
        frame.setVisible(true);
    }
}
