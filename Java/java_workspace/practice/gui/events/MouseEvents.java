import java.awt.Graphics;
import java.applet.Applet;
import java.awt.event.*;


public class MouseEvents extends Applet implements MouseListener, MouseMotionListener
{
    private int mouseX = 0;
    private int mouseY = 0;
    private String msg = "";

    @Override
    public void init()
    {   
        addMouseListener(this);
        addMouseMotionListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent me)
    {
        mouseX = 30;
        mouseY = 30;
        msg = "Mouse is clicked";
        repaint();
    }

    @Override
    public void mouseEntered(MouseEvent me)
    {
        mouseX = 200;
        mouseY = 200;
        msg = "Mouse Entered";
        repaint();
    }

    @Override
    public void mouseExited(MouseEvent me)
    {
        mouseX = 200;
        mouseY = 200;
        msg = "Mouse is Exited";
        repaint();
    }

    @Override
    public void mousePressed(MouseEvent me)
    {
        mouseX = me.getX();
        mouseY = me.getY();
        msg = "Down";
        repaint();
    }

    @Override
    public void mouseReleased(MouseEvent me)
    {
        mouseX = me.getX();
        mouseY = me.getY();
        msg = "Up";
        repaint();
    }

    @Override
    public void mouseDragged(MouseEvent me)
    {
        mouseX = me.getX();
        mouseY = me.getY();
        msg = "*";
        showStatus("Dragging mouse at " + me.getX() + ", " + me.getY());
        repaint();
    }

    @Override
    public void mouseMoved(MouseEvent me)
    {
        showStatus("Moving mouse at " + me.getX() + ", " + me.getY());
    }

    public void paint(Graphics g)
    {
        g.drawString(msg, mouseX, mouseY);
    }
}



/*
    <applet code = "MouseEvents" width = 400 height = 400> </applet>
*/
