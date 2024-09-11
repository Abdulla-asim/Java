import java.awt.Graphics;
import javax.swing.*;

public class Spiral extends JPanel {

    int x, y, radius = 10, start_angle = 0, end_angle = 180;
    final int N = 30;
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        boolean bool = false;

        x = getWidth() / 2;
        y = getHeight() / 2;

        g.setColor(java.awt.Color.BLACK);

        for (int i = 0; i < N; i++){
            g.drawArc(x - radius, y - radius, 2*radius, 2*radius, start_angle, end_angle);   
            radius += 10;
            start_angle += 180;
            x = (bool)? x + 10 : x - 10;
            bool = !bool;  
        }
    }

    public static void main (String[] args) {
        JFrame frame = new JFrame("Spiral");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.add(new Spiral());
    }
}
