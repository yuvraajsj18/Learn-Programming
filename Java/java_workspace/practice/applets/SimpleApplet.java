import java.awt.*;
import java.applet.*;

public class SimpleApplet extends Applet {
    private static final long serialVersionUID = 1L;

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.red);
        g.drawRect(10, 10, 70, 70);
        g.drawString("A Simple Applet", 50, 50);
        g.setColor(Color.blue);
        for (int i = 0,s = 0; i < 10; i++, s+=30)
        {
            g.drawString(Integer.toString(i), 80, 80 + s);
        }
        g.setColor(Color.green);
        g.drawString("End", 100, 100);
    }

    public static void main(String[] args) {
        
    }
}