// A keyboard that i made for use in typing app but i made an inner class of it instead.. .-.

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;


public class Keyboard extends JPanel{
    public String[] keyName = {"`", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0", "-", "=", "Backspace",
                                "Tab", "q", "w", "e", "r", "t", "y", "u", "i", "o", "p", "[", "]",  "\\",
                                "Caps Lock", "a", "s", "d", "f", "g", "h", "j", "k", "l", ";", "'", "Enter",
                                "Shift", "z", "x", "c", "v", "b", "n", "m", ",", ".", "/", "Shift",
                                "Space Bar" };

    public String[] keyNameShift = {"~", "!", "@", "#", "$", "%", "^", "&", "*", "(", ")", "_", "+", "Backspace",
                                     "Tab", "Q", "W", "E", "R", "T", "Y", "U", "I", "O", "P", "{", "}", "|",
                                     "Caps Lock", "A", "S", "D", "F", "G", "H", "J", "K", "L", ":", "\"", "Enter",
                                     "Shift", "Z", "X", "C", "V", "B", "N", "M", "<", ">", "?", "Shift",
                                     "Space Bar" };

    private KeyboardKeys[] keys;
    private final int numOfKeys = 54;

    public Keyboard(){
        // Call the parent constructor of JPanel
        super();

        setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();

        c.fill = GridBagConstraints.HORIZONTAL;
        c.insets.set(2, 2, 2, 2);

        // Initialize the keys array
        keys = new KeyboardKeys[numOfKeys];
        for(int i = 0; i < numOfKeys; i++){
            c.gridx = i % 14;
            c.gridy = i / 14;    
            
            // Move the shift key to the next line
            if (i == 41){ 
                c.gridx = 0;
                c.gridy++;
            }

            // Move the Space Bar to the next line
            if (keyName[i].equals("Space Bar")){
                c.gridx = 0;
                c.gridy++;
                c.gridwidth = GridBagConstraints.REMAINDER;
            }
            
            keys[i] = new KeyboardKeys(keyName[i]);
            add(keys[i], c);
        }
    }

    

    // JUST FOR TESTING
    public static void main(String[] args) {
        
        try {   
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();  
        }

        JFrame f = new JFrame("Keyboard");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(new Keyboard());
        f.pack();
        f.setVisible(true);
    }


    class KeyboardKeys extends JButton {

        public KeyboardKeys(String name){
            super(name);
            setFocusPainted(false);
            // setPreferredSize(new Dimension(60,30));
            setMinimumSize(new Dimension(70, 30));

            // Adding action listener
            
        }
    }


}
