import java.applet.Applet;
import java.awt.Graphics;
import java.awt.event.*;

public class InnerListenerDemo extends Applet
{
    int mouseX, mouseY;
    String msg = "";
    @Override
    // InnerListenerDemo()
    // {
    //     addMouseListener(new MyMouseListener());    // also works
    // }
    public void init()
    {
        addMouseListener(new MyMouseListener());
        addMouseMotionListener(new MyMouseListener());

        addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent ke)
            {
                showStatus("Key Typed");
                msg += ke.getKeyChar();
                repaint();
            }
        });
    }

    public void paint(Graphics g)
    {
        // addMouseMotionListener(new MyMouseListener());   // also works
        g.drawString(msg, mouseX, mouseY);
    }

    class MyMouseListener implements MouseListener, MouseMotionListener      // inner class
    {
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
    }      
}

/**
 * <applet code = "InnerListenerDemo" width = 400 height = 400></applet>
 */