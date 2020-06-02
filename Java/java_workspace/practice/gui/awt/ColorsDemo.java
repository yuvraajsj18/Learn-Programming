import java.awt.event.*;
import java.awt.*;

public class ColorsDemo extends Frame
{
    private static final long serialVersionUID = 1L;

    int x = getInsets().left;
    int y = getInsets().top;
    int dim = 600;
    int minSize = 8;
    ColorsDemo(String title)
    {
        super(title);

        setBackground(new Color(255, 255, 0));
        setForeground(Color.blue);
        
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent we)
            {
                setVisible(false);
                System.exit(0);
            }
        });

        addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent ce)
            {
                dim = (int)getSize().getWidth();
                repaint();
            }
        });
    }

    @Override
    public void paint(Graphics g)
    {
        drawGasket(x, y, dim);
    }

    void drawGasket(int x, int y, int dim)
    {
        if (dim <= minSize) 
        {
            getGraphics().fillRect(x, y, dim, dim);
        }
        else 
        {
            int newDim = dim / 2;
            drawGasket(x, y, newDim);
            drawGasket(x + newDim, y, newDim);
            drawGasket(x + newDim, y + newDim, newDim);
        }
    }

    public static void main(String[] args) {
        ColorsDemo f =  new ColorsDemo("Colors Demo");
        f.setSize(f.dim, f.dim);
        f.setVisible(true);

        System.out.println(f.getInsets().top + " " + f.getInsets().left);
        System.out.println(f.getInsets().bottom + " " + f.getInsets().right);
    }
}