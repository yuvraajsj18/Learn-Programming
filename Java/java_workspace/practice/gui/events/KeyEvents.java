import java.applet.Applet;
import java.awt.Graphics;
import java.awt.event.*;

public class KeyEvents extends Applet implements KeyListener
{
    int mouseX = 10;
    int mouseY = 10;
    String msg = "";

    @Override
    public void init()
    {
        addKeyListener(this);
    }

    @Override
    public void keyPressed(KeyEvent ke)
    {
        showStatus("Key Down");
        if (ke.getKeyCode() == KeyEvent.VK_BACK_SPACE)
            msg = msg.substring(0, msg.length() - 1);
    }

    @Override
    public void keyReleased(KeyEvent ke)
    {
        showStatus("Key Up");
    }

    @Override
    public void keyTyped(KeyEvent ke)
    {
        msg += ke.getKeyChar();
        repaint();
    }

    @Override
    public void paint(Graphics g)
    {
        g.drawString(msg, mouseX, mouseY);
    }
}


/*
    <applet code = "KeyEvents" width = 400 height = 400> </applet>
*/