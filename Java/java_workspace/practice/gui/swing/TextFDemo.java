import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TextFDemo extends JFrame 
{
    private static final long serialVersionUID = 1L;
    
    TextFDemo(String title)
    {
        super(title);

        JTextField jtf = new JTextField();

        add(jtf, BorderLayout.NORTH);

        JButton del = new JButton("Backspace");

        add(del, BorderLayout.SOUTH);

        JLabel jL = new JLabel("You Typed: ", JLabel.CENTER);

        add(jL);

        jtf.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae)
            {
                jL.setText("You Typed: " + jtf.getText());
            }
        });

        del.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae)
            {
                String oldText = jtf.getText();
                String newText = oldText.substring(0, oldText.length() - 1);
                jtf.setText(newText);
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run()
            {
                TextFDemo win = new TextFDemo("JTextField Demo");
                win.setSize(400, 400);
                win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                win.setVisible(true);
            }
        });
    }
}