package calculator;

import javax.swing.SwingUtilities;

public class Main
{
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run()
            {
                new CalculatorWindow("This is a Calculator");
            }
        });
    }
}