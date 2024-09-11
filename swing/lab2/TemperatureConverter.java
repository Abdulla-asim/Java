import javax.swing.*;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.*;

public class TemperatureConverter extends JFrame{
    JLabel l1, l2;
    JTextField t1;

    public TemperatureConverter (){
        super("Temperature Converter");
        l1 = new JLabel("Enter temperature in Fahrenheit: ");
        t1 = new JTextField(5);
        l2 = new JLabel("Temperature in Clesius: ___");

        setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.VERTICAL;

        add(l1, c);
        add(t1, c);
        c.gridy = 1;
        add(l2, c); 
        
        t1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                double fahrenheit = Double.parseDouble(t1.getText());
                double celsius = (fahrenheit - 32) * 5/9;
                l2.setText("Temperature in Celsius: " + celsius);
            }
        });
    }

    public static void main(String[] args) {
        TemperatureConverter tc = new TemperatureConverter();
        tc.setSize(400, 400);
        tc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tc.setVisible(true);
    }
}
