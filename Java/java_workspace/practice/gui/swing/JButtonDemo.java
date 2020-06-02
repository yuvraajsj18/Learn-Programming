import java.awt.*;
import java.awt.event.*;
import java.util.Random;

import javax.swing.*;

public class JButtonDemo extends JFrame implements ActionListener
{
    private static final long serialVersionUID = 1L;
    
    JButtonDemo(String title)
    {
        super(title);

        setLayout(new FlowLayout());

        JButton b1 = new JButton("B1");

        add(b1);

        JButton b2 = new JButton(new ImageIcon("hallows.jpeg"));

        add(b2);

        JButton b3 = new JButton("Hallows", new ImageIcon("hallows.jpeg"));

        add(b3);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent me)
    {
        changeBgColor();
    }

    void changeBgColor()
    {
        Color colors[] = {Color.BLACK, Color.BLUE, Color.CYAN, Color.GREEN, Color.DARK_GRAY, Color.RED};
        int random_color;
        do
            random_color = new Random().nextInt(6);
        while (colors[random_color] == getContentPane().getBackground());
        getContentPane().setBackground(colors[random_color]);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run()
            {
                JButtonDemo win = new JButtonDemo("JButtonDemo Demo");
                win.setSize(600, 500);
                win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                win.setVisible(true);
            }
        });
    }
}