import java.awt.event.*;
import java.awt.*;


public class WindowApp extends Frame
{
    private static final long serialVersionUID = 1L;
    String msg = "This is my Window App Test";
    int mouseX = 50;
    int mouseY = 50;

    WindowApp(String title)
    {
        super(title);

        setBackground(Color.black);
        setForeground(Color.green);
        setFont(new Font("Sanserif", Font.BOLD, 24));

        addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent me)
            {
                mouseX = me.getX();
                mouseY = me.getY();
                repaint();
            }
        });

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
        g.drawString(msg, 10, 50);
        g.drawString("*", mouseX, mouseY);
    }

    public static void main(String[] args) {
        Frame f = new WindowApp("My Window");
        f.setSize(500, 500);
        f.setVisible(true);

        Graphics g = f.getGraphics();
        g.drawString("Drawn from main", 100, 100);
    }
}