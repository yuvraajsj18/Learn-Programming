import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;

public class JToggleButtonDemo extends JFrame
{
    private static final long serialVersionUID = 1L;
    
    JToggleButtonDemo(String title)
    {
        super(title);

        setLayout(new BorderLayout());

        JToggleButton jtb = new JToggleButton("Show The Image");

        add(jtb, BorderLayout.NORTH);

        ImageIcon img = new ImageIcon("hallows.jpeg");
        JLabel imgLbl = new JLabel(img);
        imgLbl.setVisible(false);
        add(imgLbl);

        jtb.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent ie)
            {
                Object item = ie.getItem();
                if (!(item instanceof JToggleButton))
                    return;
                JToggleButton btn = (JToggleButton) item;
                if (btn.isSelected())
                {
                    imgLbl.setVisible(true);
                    jtb.setText("Hide the image");
                }
                else
                {
                    imgLbl.setVisible(false);
                    jtb.setText("Show the image");
                }
                changeBgColor();
            }
        });
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
                JToggleButtonDemo win = new JToggleButtonDemo("JButtonDemo Demo");
                win.setSize(600, 500);
                win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                win.setVisible(true);
            }
        });
    }   
}