import java.awt.event.*;
import java.awt.*;

public class GraphicsDemo extends Frame 
{
    GraphicsDemo(String title)
    {
        super(title);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent we)
            {
                setVisible(false);
                System.exit(0);
            }
        });
    }

    @Override
    public void paint(Graphics g)
    {
        g.drawLine(30, 30, 210, 210);

        g.drawRect(40, 50, 50, 70);
        g.fillRect(40, 200, 50, 50);
        g.drawRoundRect(130, 50, 50, 70, 5, 5);
        g.fillRoundRect(130, 200, 50, 50, 3, 3);
        do something time consuming as the result of an event, it must use a separate thread.
        g.setColor(Color.red);

        g.drawOval(200, 50, 50, 70);
        g.fillOval(250, 50, 50, 50);    // circle

        g.setColor(Color.black);

        g.drawArc(300, 50, 50, 80, 90, 180);
        g.fillArc(350, 50, 50, 80, 90, -180);
        g.fillArc(400, 50, 80, 50, 180, -180);

        g.setColor(new Color(0x552070));
        int x[] = {20, 200, 20, 200, 20};
        int y[] =  {450, 450, 650, 650, 450};
        g.fillPolygon(x, y, 5);
    }

    public static void main(String[] args) {
        Frame f = new GraphicsDemo("Graphics Examples"); 
        f.setSize(500, 700);
        f.setVisible(true);
    }
}