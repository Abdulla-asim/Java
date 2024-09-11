import java.awt.Graphics;
import javax.swing.*;

public class Task1 extends JPanel{

    private static final int N = 10;
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int width = getWidth();
        int height = getHeight();

        int delta_x = width/N;
        int delta_y = height/N;

        // Draw the lines
        for (int i = 0; i < N; i++) {
            g.drawLine(0, 0, delta_x*i, height - delta_y*i);
            g.drawLine(width, 0, delta_x*i, delta_y*i);
            g.drawLine(0, height, delta_x*i, delta_y*i);
            g.drawLine(width, height, delta_x*i,height - delta_y*i);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Task1");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(512, 512);
        frame.add(new Task1());
        frame.setVisible(true);
    }
}
