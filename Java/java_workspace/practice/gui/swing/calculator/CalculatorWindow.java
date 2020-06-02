package calculator;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CalculatorWindow extends JFrame
{
    private static final long serialVersionUID = 1L;

    JPanel contentPane;

    InputPanel input;
    ResultPanel result;
    Keypad keypad;

    CalculatorWindow(String title)
    {
        super(title);

        setSize(400, 600);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        // set Content Pane
        if (getContentPane() instanceof JPanel)
            contentPane = (JPanel) getContentPane();

        //change
        setLayout(new GridLayout(2, 1));
        contentPane.setBorder(BorderFactory.createLineBorder(new Color(255, 215, 0), 3));

        JPanel display = new JPanel();
        display.setLayout(new GridLayout(2, 1));

        input = new InputPanel();
        display.add(input);

        result = new ResultPanel();
        display.add(result);

        add(display);

        keypad = new Keypad(input, result);
        add(keypad);
    }
}

class InputPanel extends JPanel
{
    private static final long serialVersionUID = 1L;

    JLabel enterPrompt;
    JLabel inputString;

    InputPanel()
    {
        setLayout(new BorderLayout());
        setBackground(Color.BLACK);
        setBorder(BorderFactory.createLineBorder(new Color(255, 215, 0), 3));

        enterPrompt = new JLabel("Enter:", JLabel.CENTER);
        enterPrompt.setFont(new Font("Sanserif", Font.BOLD, 22));
        enterPrompt.setForeground(Color.WHITE);


        add(enterPrompt, BorderLayout.NORTH);

        inputString = new JLabel("", JLabel.CENTER);
        inputString.setFont(new Font("Sanserif", Font.BOLD, 22));
        inputString.setForeground(Color.WHITE);

        add(inputString, BorderLayout.CENTER);
    }
}

class ResultPanel extends JPanel
{
    private static final long serialVersionUID = 1L;

    JLabel result;

    ResultPanel()
    {
        setLayout(new BorderLayout());
        setBackground(Color.BLACK);

        setBorder(BorderFactory.createLineBorder(new Color(255, 215, 0), 3));

        result = new JLabel("Result = ...", JLabel.CENTER);
        result.setFont(new Font("Sanserif", Font.BOLD, 22));
        result.setForeground(Color.WHITE);

        add(result, BorderLayout.CENTER);
    }
}

class Keypad extends JPanel implements ActionListener
{
    private static final long serialVersionUID = 1L;

    final int num_of_keys = 20;

    JButton keys[] = new JButton[num_of_keys];
    String keysText[] = {"1", "2", "3", "+", "x", 
                         "4", "5", "6", "-", "/", 
                         "7", "8", "9", "(", ")", 
                         ".", "0", "D", "C", "="
                        };

    InputPanel input;
    ResultPanel result;

    Keypad(InputPanel input, ResultPanel result)
    {
        this.input = input;
        this.result = result;

        setLayout(new GridLayout(4, 5));

        setBorder(BorderFactory.createLineBorder(new Color(255, 215, 0), 2));

        // initialise and set button text to specify them
        for (int i = 0; i < num_of_keys; i++)
        {
            keys[i] = new JButton(keysText[i]);
            keys[i].setFont(new Font("Sanserif", Font.BOLD, 18));
            keys[i].setBackground(Color.BLACK);
            keys[i].setForeground(Color.WHITE);
            keys[i].setBorder(BorderFactory.createLineBorder(new Color(255, 215, 0), 1));
        }

        for (int i = 0; i < num_of_keys; i++)
        {
            add(keys[i]);
        }

        for (int i = 0; i < 17; i++)
            keys[i].addActionListener(this);

        // D key
        keys[17].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae)
            {
                result.result.setText("Result = ...");
                input.inputString.setText("");
                requestFocus();
            }
        });

        // C key
        keys[18].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae)
            {
                String currentText = input.inputString.getText();

                if (currentText.length() == 0)
                    return;

                String newText = currentText.substring(0, currentText.length() - 1);
                result.result.setText("Result = ...");
                input.inputString.setText(newText);
                requestFocus();
            }
        });

        // = key
        keys[19].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae)
            {
                String inputString = input.inputString.getText();

                if (inputString.length() == 0)
                    return;

                if (isOperator(inputString.charAt(inputString.length() - 1)))
                {
                    return;
                }

                double resultValue = 0.0;
                String resultString = null;
                try
                {
                    resultValue = Calculator.calculate(inputString);
                    resultString = String.format("Result = %.6f", resultValue);
                }
                catch (Exception e)
                {
                    resultString = "Bad Expression";
                }

                result.result.setText(resultString);
                requestFocus();
            }
        });

        setFocusable(true);
        addKeyListener(new KeyHandler());
    }

    @Override
    public void actionPerformed(ActionEvent ae)
    {
        String currentText = input.inputString.getText();

        switch(ae.getActionCommand())
        {
            case "x":
            case "/":
            case ")":
            case "D":
            case "C":
            case "=":
                if (currentText.length() == 0)
                    return;
                if (isOperator(currentText.charAt(currentText.length() - 1)))
                    return;
            break;
            case "-":
            case "+":
                if (currentText.length() == 0 || currentText.charAt(currentText.length() - 1) == '(')    
                {
                    String newText = currentText.concat("0" + ae.getActionCommand());
                    input.inputString.setText(newText);
                    result.result.setText("Result = ...");
                    return;
                }
                if (isOperator(currentText.charAt(currentText.length() - 1)))
                    return;
            break;  
            case "(":
                if(currentText.length() > 0 && (!(isOperator(currentText.charAt(currentText.length() - 1)))))
                {
                    input.inputString.setText(currentText + "x" + ae.getActionCommand());
                    result.result.setText("Result = ...");
                    return;
                }
            break;
            default:    
                if (currentText.length() > 0 && currentText.charAt(currentText.length() - 1) == ')')
                {
                    input.inputString.setText(currentText + "x" + ae.getActionCommand());
                    result.result.setText("Result = ...");
                    return;
                }
        }

        result.result.setText("Result = ...");
        input.inputString.setText(currentText + ae.getActionCommand());

        requestFocus();
    }

    boolean isOperator(char ch)
    {
        switch(ch)
        {
            case '+':
            case '-':
            case '/':
            case 'x':
            // case '(':
                return true;
        }
        return false;
    }

    private class KeyHandler extends KeyAdapter
    {
        int keyCodes[] = {'1', '2', '3', '+', 'x',
                          '4', '5', '6', '-', '/',
                          '7', '8', '9', '(', ')',
                          '.', '0', 'D', 'C', '='
                        };

        @Override
        public void keyPressed(KeyEvent ke)
        {
            int key = findKey(ke.getKeyChar());
            String cmd = ke.getKeyChar() + "";
            // System.out.println(key + " " + ke.getKeyChar());
            if (key != -1)
                keys[key].getActionListeners()[0].actionPerformed(new ActionEvent(keys[key], key, cmd));
        }

        int findKey(char ch)
        {
            for (int i = 0; i < num_of_keys; i++)
            {
                if (keyCodes[i] == Character.toUpperCase(ch) || keyCodes[i] == Character.toLowerCase(ch))
                    return i;
            }
            return -1;
        }
    }
}