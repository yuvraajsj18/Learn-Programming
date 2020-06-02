import java.awt.*;
import java.awt.event.*;
// import java.net.MalformedURLException;
// import java.net.URL;
import javax.swing.*;

public class JLabelDemo extends JFrame
{
    private static final long serialVersionUID = 1L;

    Container contentPane = getContentPane();

    JLabelDemo(String title)
    {
        super(title);

        contentPane.setBackground(Color.GRAY);

        JLabel textLbl = new JLabel("This is a label", JLabel.CENTER);
        textLbl.setOpaque(true);
        textLbl.setPreferredSize(new Dimension(400, 30));
        textLbl.setBackground(Color.RED);

        add(textLbl, BorderLayout.NORTH);

        JButton del = new JButton("Backspace");

        add(del, BorderLayout.SOUTH);

        JLabel iconLbl = null;
        iconLbl = new JLabel(new ImageIcon("hallows.jpeg"));        

        add(iconLbl);

        del.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae)
            {
                String oldText = textLbl.getText();
                String newText = oldText.substring(0, oldText.length() - 1);
                textLbl.setText(newText);
            }
        });
    }   

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run()
            {
                JLabelDemo win = new JLabelDemo("JLabels Demo");
                win.setSize(400, 400);
                win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                win.setVisible(true);
            }
        });
    }
}


/**
 * // try
        // {
        //     iconLbl = new JLabel(new ImageIcon(new URL("http://ichef.bbci.co.uk/news/976/cpsprodpb/BE66/production/_98524784_8da854f5-071b-438d-8888-28a5b23d1304.jpg")));
        // }
        // catch(MalformedURLException e)
        // {
        //     System.out.println(e);
        //     iconLbl = new JLabel("Image not found");
        // }
 */