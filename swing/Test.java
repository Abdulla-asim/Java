import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Test extends JPanel{

    int r = 10;
    int h = 2*r, w = h;

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int x = 0, y = 0;

        g.drawArc(x, y, h, w, 0, -360);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Test");

        frame.add(new Test());
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        
    }
}
