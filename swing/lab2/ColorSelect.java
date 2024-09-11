import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.UIManager;

class ColorSelect extends JFrame {
    // Create an array of options
    String[] colors = { "Red", "Blue", "Green" };
    Color[] colorCodes = { Color.RED, Color.BLUE, Color.GREEN };

    public boolean fg = false, bg = false;

    JComboBox<String> colorList;

    public ColorSelect() {
        super("Color Select");

        // Create a JComboBox with the options
        colorList = new JComboBox<>(colors);
        colorList.setPreferredSize(new Dimension(256, 20));
        colorList.setFocusable(false);
        JLabel l = new JLabel("Koi funny sa joke");
        l.setFont(new Font("Arial", Font.BOLD, 12));


        JCheckBox r1 = new JCheckBox("ForeGround");
        JCheckBox r2 = new JCheckBox("Background");
        r1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                fg =  r1.isSelected()? true : false;
            }
        });

        r2.addActionListener(new ActionListener() { // e -> { bg = true;}
        public void actionPerformed(ActionEvent e) {
            bg =  r2.isSelected()? true : false;
        }
    });
    
        add(colorList, BorderLayout.NORTH);
        add(r1);
        add(r2);
        add(l);
        
        add(new JButton("OK") {
            {
                addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        if (fg && bg) {
                            for (Component c : getContentPane().getComponents())
                                c.setForeground(colorCodes[colorList.getSelectedIndex()]);
                            getContentPane().setBackground(colorCodes[colorList.getSelectedIndex()]);
                        } else if (fg) {
                            for (Component c : getContentPane().getComponents())
                                c.setForeground(colorCodes[colorList.getSelectedIndex()]);
                        } else if (bg) {
                            getContentPane().setBackground(colorCodes[colorList.getSelectedIndex()]);
                        }
                    }
                });
            }    
        });

        add(new JButton("Cancel") {
            {
                addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        System.exit(0);
                    }
                });
            }
        });


        setLayout(new FlowLayout());

        // Set the default close operation and the size of the frame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 150);
    }

    public static void main(String[] args) {
        try
        {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }
        catch(Exception e)
        {
            System.out.println("Error setting native LAF: " + e);
        }
        ColorSelect cs  = new ColorSelect();
        cs.setVisible(true);

    }
}