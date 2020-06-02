import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class ButtonsDemo extends JFrame
{
    private static final long serialVersionUID = 1L;

    Label l = new Label("Your Decision");

    ButtonsDemo(String title)
    {
        super(title);

        setLayout(new FlowLayout());

        setBackground(Color.BLACK);
        setForeground(Color.WHITE);

        Button b1 = new Button("Yes");
        Button b2 = new Button("No");
        Button b3 = new Button("Maybe");

        b1.setBackground(Color.YELLOW);
        b1.setForeground(Color.BLACK);
        b2.setBackground(Color.YELLOW);
        b2.setForeground(Color.BLACK);
        b3.setBackground(Color.YELLOW);
        b3.setForeground(Color.BLACK);

        add(b1);
        add(b2);
        add(b3);

        l.setBackground(Color.GREEN);
        l.setForeground(Color.BLACK);
        l.setPreferredSize(new Dimension(150, 20));
        add(l);

        Scrollbar sb = new Scrollbar();

        add(sb);

        // registers listeners
        b1.addActionListener(new MyActionListener(this));
        b2.addActionListener(new MyActionListener(this));
        b3.addActionListener(new MyActionListener(this));

        b1.addMouseListener(new MouseAdapter() {
           @Override
           public void mouseClicked(MouseEvent me)
           {
               System.out.println("Mouse Clicked");
           } 
        });

        b1.addMouseListener(new MouseAdapter() {
            @Override
           public void mouseClicked(MouseEvent me)
           {
               System.out.println("Mouse Clicked Again");
           } 
        });

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent we)
            {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        ButtonsDemo win = new ButtonsDemo("Buttons Demo");
        win.setSize(400, 400);
        win.setVisible(true);
    }
}

class MyActionListener implements ActionListener
{
    ButtonsDemo srcFrame;
    MyActionListener(ButtonsDemo srcFrame)
    {
        this.srcFrame = srcFrame;
    }

    @Override
    public void actionPerformed(ActionEvent ae)
    {
        srcFrame.l.setText("You choosed " + ae.getActionCommand());
    }
}