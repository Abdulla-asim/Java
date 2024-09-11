import javax.swing.*;
import java.awt.Graphics;

public class Task2 extends JPanel{
    
    private static final int N = 15;

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int width = getWidth();
        int height = getHeight();

        int delta_x = width/N;
        int delta_y = height/N;

        for (int i = 0; i < N; i++) {
            g.drawLine(0, delta_y * i, delta_x*i, height);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Task2");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(512, 512);
        frame.add(new Task2());
        frame.setVisible(true);
    }
}
