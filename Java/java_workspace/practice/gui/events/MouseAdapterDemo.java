import java.applet.Applet;
import java.awt.Graphics;
import java.awt.event.*;

public class MouseAdapterDemo extends Applet {
    String msg = "";
    int mouseX, mouseY;
    int i = 0;
    public void init()
    {
        addMouseMotionListener(new MyMouseAdapter(this));
    }
    public void paint(Graphics g)
    {
        g.drawString(msg, mouseX, mouseY);
    }
}

class MyMouseAdapter extends MouseAdapter
{
    MouseAdapterDemo src;
    MyMouseAdapter(MouseAdapterDemo src)
    {
        this.src = src;
    }
    @Override
    public void mouseDragged(MouseEvent me)
    {
        src.showStatus("Mouse Dragged");
        src.mouseX = src.mouseY = 50;
        src.msg = "Hello, World!" + src.i++;
        src.repaint();
    }
}

/*
<applet code = "MouseAdapterDemo" width = 400 height = 400></applet>
*/