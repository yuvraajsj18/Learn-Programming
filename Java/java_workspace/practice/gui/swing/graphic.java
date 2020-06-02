import javax.swing.*;
import java.awt.*;

class MyFrame extends JFrame
{
    MyFrame(String title)
    {
        super(title);



    }

    public void paint(Graphics g)
    {
        super.paint(g);

        getContentPane().setBackground(Color.YELLOW);
        getContentPane().setForeground(Color.BLUE);
                g.drawString("this is a string", 100, 100);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run()
            {
                MyFrame win = new MyFrame("Frm");
                win.setSize(400, 400);
                win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                win.setVisible(true);
            }
        }); 
    }
}