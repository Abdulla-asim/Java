package Class;
import javax.swing.*;
import java.awt.event.*;

public class textBox implements ActionListener {

    JTextField tf;
    JLabel l;

    textBox() {
        JFrame frame = new JFrame("SQUARE OF A NUMBER");

        tf = new JTextField(5);
        l = new JLabel("SQUARE");

        tf.addActionListener(this);
        

        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.add(tf);
        panel.add(l);

        frame.add(panel);
        frame.setVisible(true);   
    }

    public static void main(String[] args) {
        new textBox();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try
        {
            String s = tf.getText();
        
            if (s != null)
            {
                int x = Integer.parseInt(tf.getText());
                l.setText("" + x * x);
            }
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
        
    }

    
}