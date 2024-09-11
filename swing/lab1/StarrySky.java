import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.security.SecureRandom;
import javax.swing.*;

public class StarrySky extends JPanel{
    public SecureRandom rand = new SecureRandom();
    public final int STAR_SIZE = 6;

    public StarrySky() { setBackground(Color.BLACK); }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        for (int i = 0; i < rand.nextInt(50) + 50; i++)
            drawStar(g);
    }
    
    public void drawStar(Graphics g) {
        Graphics2D g2D = (Graphics2D) g;
        g2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON); // Turn On Anti-Aliasing to make the Circles smoother.

        int x = rand.nextInt(getWidth());
        int y = rand.nextInt(getHeight());
        int size = rand.nextInt(STAR_SIZE) + 1;
        g2D.setColor(new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256)));
        g2D.fillOval(x, y, size, size);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new StarrySky());
        frame.setVisible(true);
    }
}




