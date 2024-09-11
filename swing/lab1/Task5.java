import javax.swing.*;
import java.awt.Color;
import java.awt.Graphics;
import java.security.SecureRandom;

public class Task5 extends JPanel {

    SecureRandom random = new SecureRandom();

    private int radius = 100;
        
    int x = random.nextInt(200) + radius, y = random.nextInt(200) + radius;

    int dx = 1, dy = 1;

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        radius = 100;

        g.setColor(Color.YELLOW);
        g.fillOval(x - radius, y - radius, 2 * radius, 2 * radius); // Face

        g.setColor(Color.BLACK);
        g.fillOval(x - radius/2, y - radius/2, 30, 30); // Eyes
        g.fillOval(x + radius/2 - 30, y - radius/2, 30, 30); // Eyes
        g.fillOval(x - radius/2, y + radius/2 - 37, radius, 40); //lips

        g.setColor(Color.YELLOW);
        g.fillRect(x - radius/2, y + radius/2 - 25 , radius, 25/2); // hides half lips
        g.fillOval(x - radius/2 , y + radius/2 - 37 , radius, 34); //lips
    }

    public void move() {
        if (x  + radius + dx > getWidth() || x - radius + dx < 0) dx = -dx;
        if (y  + radius + dy > getHeight() || y - radius + dy < 0) dy = -dy;

        x += dx;
        y += dy;

        repaint();
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Task4");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        Task5 task = new Task5();
        frame.add(task);
        frame.setVisible(true);

        while (true) {
            try {
                task.move();
                Thread.sleep(10);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
