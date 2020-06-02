import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SwingEvent extends JFrame implements ActionListener
{
    private static final long serialVersionUID = 1L;

    SwingEvent(String title)
    {
        super(title);
        setLayout(new FlowLayout());

        JButton redBtn = new JButton("Red");
        redBtn.setBackground(Color.red);
        redBtn.setForeground(Color.WHITE);

        JButton blueBtn = new JButton("Blue");
        blueBtn.setBackground(Color.blue);
        blueBtn.setForeground(Color.WHITE);

        add(redBtn);
        add(blueBtn);

        redBtn.addActionListener(this);
        blueBtn.addActionListener(this);
    }   

    @Override
    public void actionPerformed(ActionEvent ae)
    {
        if ((ae.getActionCommand()).equals("Red"))
        {
            getContentPane().setBackground(Color.RED);
        }
        else if((ae.getActionCommand()).equals("Blue"))
            getContentPane().setBackground(Color.BLUE);
   }

   public static void main(String[] args) {
       SwingUtilities.invokeLater(new Runnable() {
           @Override
           public void run()
           {
               SwingEvent win = new SwingEvent("Swing Events");
               win.setSize(400, 400);
               win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
               win.setVisible(true);
           }
       });
   }
}