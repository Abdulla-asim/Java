import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

public class TypingApp extends JFrame{
    
    // Main class
    public static void main(String[] args) {

        TypingApp f = new TypingApp();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.pack();
        f.setVisible(true);
    }

    JTextArea textArea;
    Keyboard keyboard;
    JLabel text;

    public String[] keyName = {"`", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0", "-", "=", "Backspace",
                                    "Tab", "q", "w", "e", "r", "t", "y", "u", "i", "o", "p", "[", "]",  "\\",
                                    "Caps Lock", "a", "s", "d", "f", "g", "h", "j", "k", "l", ";", "'", "Enter",
                                    "Shift", "z", "x", "c", "v", "b", "n", "m", ",", ".", "/", "Shift",
                                    "Space" };

    private final int numOfKeys = 54;
    private KeyboardKeys[] vKeys;


    // Main class constructor
    public TypingApp(){
        super("Learn Typing");
        textArea = new JTextArea(6, 20);
        keyboard = new Keyboard();
        text = new JLabel("Write the panagram:                  \n\"Sphinx of black quartz, judge my vow\"");

        text.setFont(new Font("Helvetica", Font.BOLD, 30));
        textArea.setBackground(new Color(182,198,190));
        textArea.setFont(new Font("Helvetica", Font.BOLD, 40));
        textArea.setForeground(new Color(88,138,135));
        keyboard.requestFocus();
        textArea.addKeyListener(new MyKeyListener());

        add(text, BorderLayout.NORTH);
        add(textArea, BorderLayout.CENTER);
        add(keyboard, BorderLayout.SOUTH);
        pack();
        setVisible(true);
    }

    // Keybpard inner class
    class Keyboard extends JPanel{

        public Keyboard(){
            // Call the parent constructor of JPanel
            super();
            setBackground(new Color(20,30,35));
            setLayout(new GridBagLayout());
            GridBagConstraints c = new GridBagConstraints();

            c.fill = GridBagConstraints.HORIZONTAL;
            c.insets.set(5,5,5,5);

            // Initialize the keys array
            vKeys = new KeyboardKeys[numOfKeys];

            for(int i = 0; i < numOfKeys; i++){
                c.gridwidth= 1;
                c.gridx = i % 14;
                c.gridy = i / 14;    
                
                // Move the shift key to the next line
                if (i == 41){ 
                    c.gridx = 0;
                    c.gridy++;
                }


                // Move the Space Bar to the next line
                if (keyName[i].equals("Space")){
                    c.gridx = 0;
                    c.gridy++;
                    c.gridwidth = GridBagConstraints.REMAINDER;
                }

                
                vKeys[i] = new KeyboardKeys(keyName[i]);
                add(vKeys[i], c);
            }
        }
    }

    // My own custom keys for the keyboard (Class)
    class KeyboardKeys extends JButton {

        public KeyboardKeys(String name){
            super(name);
            setFocusPainted(false);
            setBackground(new Color(88,138,135));
            setForeground(Color.WHITE);
            setPreferredSize(new Dimension(100,35));
        }
    }

    // KeyListener inner class
    class MyKeyListener extends KeyAdapter {

        Color prevColor;
        String keyPressed, keyReleased;
        KeyboardKeys key;

        @Override
        public void keyPressed(KeyEvent e) {
            keyPressed = (String) KeyEvent.getKeyText(e.getKeyCode());

            for (int i = 0; i < numOfKeys; i++) {
                if (keyPressed.equalsIgnoreCase(keyName[i]) || keyPressed == keyName[i]) {
                    key = vKeys[i];
                }
            }

            prevColor = key.getBackground();
            key.setBackground(new Color(106, 33, 83));
            key.setForeground(Color.WHITE);            
        }

        @Override
        public void keyReleased(KeyEvent e) {
            keyReleased = (String) KeyEvent.getKeyText(e.getKeyCode());

            for (int i = 0; i < numOfKeys; i++) {
                if (keyName[i].equalsIgnoreCase(keyReleased)){
                    key = vKeys[i];
                }
            }

            key.setBackground(new Color(88,138,135));
        }
    } 
}
