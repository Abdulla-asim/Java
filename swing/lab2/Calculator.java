import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.*;
import javax.swing.*;

public class Calculator extends JFrame{

    private JTextField screen, screen2;
    private JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, bDot, bPlus, bMinus, bMultiply, bDivide, bEqual, bClear;
    ButtonListener buttonListener;

    private JPanel panel;

    public Calculator(){
        super("Calculator");

        // Setting the Ui as the OS Ui

        buttonListener = new ButtonListener();

        // Creating Components to add
        screen = new JTextField();
        panel = new JPanel(new GridBagLayout());

        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.BOTH;
        
        // Initializing the buttons and formatting them, adding components to the frame
        initButtons();
        addComponents(panel, c);

        add(panel, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());    
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                Calculator c = new Calculator();
                c.setSize(400, 400);
                c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                c.setVisible(true);
            }
        });
    }

    private void initButtons() {
        b0 = new JButton("0");
        b0.setBackground(new Color(227,236,242));
        b0.addActionListener(buttonListener);

        b1 = new JButton("1");
        b1.setBackground(new Color(227,236,242));
        b1.addActionListener(buttonListener);

        b2 = new JButton("2");
        b2.setBackground(new Color(227,236,242));
        b2.addActionListener(buttonListener);

        b3 = new JButton("3");
        b3.setBackground(new Color(227,236,242));
        b3.addActionListener(buttonListener);

        b4 = new JButton("4");
        b4.setBackground(new Color(227,236,242));
        b4.addActionListener(buttonListener);

        b5 = new JButton("5");
        b5.setBackground(new Color(227,236,242));
        b5.addActionListener(buttonListener);

        b6 = new JButton("6");
        b6.setBackground(new Color(227,236,242));
        b6.addActionListener(buttonListener);

        b7 = new JButton("7");
        b7.setBackground(new Color(227,236,242));
        b7.addActionListener(buttonListener);

        b8 = new JButton("8");
        b8.setBackground(new Color(227,236,242));
        b8.addActionListener(buttonListener);

        b9 = new JButton("9");
        b9.setBackground(new Color(227,236,242));
        b9.addActionListener(buttonListener);

        bDot = new JButton(".");
        bDot.setBackground(Color.WHITE);
        bDot.setForeground(Color.BLACK);

        bPlus = new JButton("+");
        bPlus.addActionListener(buttonListener);
        bPlus.setBackground(Color.BLACK);
        bPlus.setForeground(Color.BLACK);
        
        bMinus = new JButton("-");
        bMinus.addActionListener(buttonListener);
        bMinus.setBackground(Color.BLACK);
        bMinus.setForeground(Color.BLACK);

        bMultiply = new JButton("*");
        bMultiply.addActionListener(buttonListener);
        bMultiply.setBackground(Color.BLACK);
        bMultiply.setForeground(Color.BLACK);

        bDivide = new JButton("/");
        bDivide.addActionListener(buttonListener);
        bDivide.setBackground(Color.BLACK);
        bDivide.setForeground(Color.BLACK);

        // Equal button
        bEqual = new JButton("=");
        bEqual.addActionListener(buttonListener);
        bEqual.setBackground(new Color(50, 0, 50));
        bEqual.setForeground(Color.BLACK);

        bClear = new JButton("Clear");
        bClear.addActionListener(buttonListener);
        bClear.setBackground(new Color(50, 0, 50));
        bClear.setForeground(Color.BLACK);
    }


    private void addComponents(JPanel panel, GridBagConstraints c) {
        c.weightx = 1;
        c.weighty = 1;
        
        c.gridy = 0;
        c.gridwidth = GridBagConstraints.REMAINDER;
        panel.add(screen, c);

        c.gridwidth = 1;
        c.gridy = 1;
        panel.add(b7, c);
        panel.add(b8, c);
        panel.add(b9, c);
        panel.add(bDivide, c);
        
        c.gridy = 2;
        panel.add(b4, c);
        panel.add(b5, c);
        panel.add(b6, c);
        panel.add(bMultiply, c);
    
        c.gridy = 3;
        panel.add(b1, c);
        panel.add(b2, c);
        panel.add(b3, c);
        panel.add(bMinus, c);
    
        c.gridy = 4;
        panel.add(b0, c);
        panel.add(bDot, c);
        panel.add(bEqual, c);
        panel.add(bPlus, c);
    
        c.gridy = 6;
        c.gridwidth = GridBagConstraints.REMAINDER;
        panel.add(bClear, c);
    }

    class ButtonListener implements ActionListener {
        private double a, b;
        String a2;
        private String currentOperator, prevOperator, buttonText;

        public void actionPerformed(ActionEvent e) {
            JButton button = (JButton) e.getSource();
            buttonText = button.getText();

            if (e.getSource() == bEqual) {
                calculate(a, a2);
                a2 = null;
            }
            else if (e.getSource() == bClear) {
                clear();
            }
            else
            {
                screen.setText(screen.getText() + buttonText);

                if (currentOperator == null && !(isOperator(buttonText))) {

                    a = Double.parseDouble(screen.getText());
                }
                else {
                    prevOperator = currentOperator; // points to null in the first turn
                    currentOperator = buttonText; // gets the current operator and passes it to prevOP next time

                    if (!isOperator(currentOperator)) // In case a digit gets stored in currentOperator
                    // a2 is the second part of the expression after an operator
                        a2 = (a2 == null)? buttonText : a2 + buttonText; // if null then store the number, otherwise, concatenate the next number.
                    else if (prevOperator != null){
                    // if current op is storing an operator, and prev op is storing something, then calculate
                        screen.setText(screen2.getText());
                        calculate(a, a2);
                        a = Double.parseDouble(a2);
                        a2 = null;
                    }
                }
            }
        }

        private double calculate(double a, String a2) {
            // a2 is the second part of the expression after an operator
            // b is the second part converted to double
            b = Double.parseDouble(a2);

            switch (prevOperator) {
                case "+":
                    a += b;
                    prevOperator = null;
                    currentOperator = null;
                    screen.setText("" + a);
                    return a;

                case "-":
                    a -= b;
                    prevOperator = null;
                    currentOperator = null;
                    screen.setText("" + a);
                    return a;

                case "*":
                    a *= b;
                    prevOperator = null;
                    currentOperator = null;
                    screen.setText("" + a);
                    return a;

                case "/":
                    a /= b;
                    prevOperator = null;
                    currentOperator = null;
                    screen.setText("" + a);
                    return a;
            
                default:
                    return a;
            }
        }

        public boolean isOperator(String s) {
            return s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/");
        }

        public void clear() {
            screen.setText("");
            screen2.setText("");
            prevOperator = null;
            currentOperator = null;
            a = 0;
            b = 0;
            a2 = null;
        }
    }

    
}
