import java.awt.event.*;
import java.awt.*;

public class Calculator {
    public static void main(String[] args) {
        CalcWin win = new CalcWin("Calculator");
        win.setSize(400, 600);
        win.setVisible(true);
    }
}

class CalcWin extends Frame {
    private static final long serialVersionUID = 1L;
    Panel display;
    Panel input;
    Panel result;
    Panel keypad;

    Button buttons[] = new Button[20];

    CalcWin(String title) {
        super(title);

        setLayout(new GridLayout(2, 1));
        setForeground(Color.BLACK);
        setFont(new Font("Sanserif", Font.BOLD, 22));

        display = new Panel();
        display.setLayout(new GridLayout(2, 1));

        input = new Panel();
        input.setBackground(new Color(0, 187, 255));
        display.add(input);
        result = new Panel();
        result.setBackground(new Color(190, 252, 3));

        display.add(result);

        add(display);

        keypad = new Panel();
        keypad.setLayout(new GridLayout(4, 5));
        keypad.setBackground(new Color(255, 111, 0));

        for (int i = 0; i < 20; i++)
            buttons[i] = new Button();

        for (int i = 0; i <= 9; i++)
            buttons[i].setLabel(Integer.toString(i));

        buttons[10].setLabel("+");
        buttons[11].setLabel("-");
        buttons[12].setLabel("x");
        buttons[13].setLabel("/");
        buttons[14].setLabel("");
        buttons[14].setBackground(Color.BLACK);
        buttons[15].setLabel(".");
        buttons[16].setLabel("(");
        buttons[17].setLabel(")");
        buttons[18].setLabel("");
        buttons[18].setBackground(Color.WHITE);
        buttons[19].setLabel("=");

        for (int i = 0; i < 20; i++)
            keypad.add(buttons[i]);

        add(keypad);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }
}

/**
 * 0 1 2 3 4 5 6 7 8 9 + - * / . ( ) =
 */