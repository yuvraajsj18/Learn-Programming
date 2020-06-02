import java.applet.Applet;
import java.awt.event.*;
import java.awt.*;

public class FrameDemo extends Applet{
    Frame f;
    String msg = "Applet will make frame";

    @Override
    public void init()
    {
        f = new MyFrame("My Frame");
        f.setSize(new Dimension(400, 400));
        f.setVisible(true);

        addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent me)
            {
                msg = "Mouse is at " + me.getX() + ", " + me.getY();
                repaint();
            }
        });
    }

    // @Override
    // public void start()
    // {
    //     f.setVisible(true);
    // }

    // @Override
    // public void stop()
    // {
    //     f.setVisible(false);
    // }

    @Override
    public void paint(Graphics g)
    {
        g.drawString(msg, 10, 40);
    }
}

class MyFrame extends Frame
{
    String msg = "This is a message";
    int mouseX = 10;
    int mouseY = 40;
    MyFrame(String title)
    {
        super(title);
        addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent me)
            {
                msg = "Mouse is at " + me.getX() + ", " + me.getY();
                repaint();
            }
        });
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent we)
            {
                setVisible(false);
            }
        });
    }

    // @Override
    public void paint(Graphics g)
    {
        g.drawString(msg, mouseX, mouseY);
    }
}

/**
 * <applet code = "FrameDemo" width = 400 height = 400></applet>
 */