import javax.swing.*;
import java.awt.Graphics;

public class Task3 extends JPanel {

    private int radius;
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int x = getWidth()/2;
        int y = getHeight()/2;

        radius = 10;

        for (int i = 0; i < 10; i++) {
            g.drawOval(x - radius, y - radius, 2 * radius, 2 * radius);
            radius += 10;
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Task3");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(512, 512);
        frame.add(new Task3());
        frame.setVisible(true);
    }
    
}
