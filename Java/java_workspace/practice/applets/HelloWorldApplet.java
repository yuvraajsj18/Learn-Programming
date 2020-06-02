import java.applet.Applet;
import java.awt.Graphics;

public class HelloWorldApplet extends Applet
{
    @Override
    public void paint(Graphics g)
    {
        g.drawString("Hello, World!", 100, 100);
    }
} 

/* 
<applet code="HelloWorldApplet.class" width="400" height="400"> </applet> 
*/  