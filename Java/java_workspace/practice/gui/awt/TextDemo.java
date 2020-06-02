import java.awt.event.*;
import java.awt.*;

public class TextDemo extends Frame
{
    TextField tf;
    TextArea ta;

    TextDemo(String title)
    {
        setLayout(new FlowLayout());
        tf = new TextField(20);

        add(tf);

       ta = new TextArea(20, 70);
       add(ta);

       ta.addTextListener(new TextListener() {
            @Override
            public void textValueChanged(TextEvent te)
            {
                repaint();
            }
       });

       ta.addMouseMotionListener(new MouseMotionAdapter() {
        @Override
        public void mouseDragged(MouseEvent me)
        {
            repaint();
        }
    });

    tf.addTextListener(new TextListener() {
        @Override
        public void textValueChanged(TextEvent te)
        {
            repaint();
        }
   });

        // tf.addKeyListener(new KeyAdapter() {
        //     @Override
        //     public void keyReleased(KeyEvent ke)
        //     {
        //         repaint();
        //     }
        // });

        tf.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent me)
            {
                repaint();
            }
        });

        // tf.addMouseListener(new MouseAdapter() {
        //    @Override
        //    public void mouseReleased(MouseEvent me)
        //    {
        //        repaint();
        //    } 
        // });
 
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent we)
            {
                System.out.println(ta.getText());
                System.exit(0);
            }
        });
    }

    @Override
    public void paint(Graphics g)
    {
        g.drawString(ta.getText(), 30, 400);
        g.drawString(ta.getSelectedText(), 30, 450);
        g.drawString(tf.getText(), 30, 500);
        g.drawString(tf.getSelectedText(), 30, 550);
    }

    public static void main(String[] args) {
        TextDemo win = new TextDemo("Text Demo");
        win.setSize(600, 600);
        win.setVisible(true);
    }
}