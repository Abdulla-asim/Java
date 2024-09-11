import java.awt.Color;
import java.awt.Graphics;
import javax.swing.*;

public class CheckerBoard extends JPanel{

    public final int BOX_SIZE = 16;

    @Override
    protected void paintComponent(Graphics g) {

        super.paintComponent(g);

        for (int y = 0; y < getHeight(); y += BOX_SIZE) 
            for (int x = 0; x < getWidth(); x += BOX_SIZE) {
                g.setColor((g.getColor() == Color.BLACK ? Color.WHITE : Color.BLACK));
                g.fillRect(x, y, BOX_SIZE, BOX_SIZE);
            }

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("CheckerBoard");
        frame.setSize(512, 512);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.add(new CheckerBoard());
    }
}
