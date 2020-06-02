import javax.swing.*;

class HelloSwing
{
    HelloSwing()
    {
        JFrame jFrm = new JFrame("Hello Swing");

        jFrm.setSize(400, 400);

        JLabel jLbl = new JLabel("This is Swing Frame");
        jLbl.setHorizontalAlignment(JLabel.CENTER);

        jFrm.add(jLbl);
        // jFrm.getContentPane().add(jLbl);     // old style

        jFrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // jFrm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        // jFrm.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        // jFrm.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

        jFrm.setVisible(true);

        // jFrm.addWindowListener(new WindowAdapter() {     // not required
        //     public void windowClosing(WindowEvent we)
        //     {
        //         System.exit(0);
        //     }
        // });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run()
            {
                new HelloSwing();
            }
        });
    }
}

class HelloSwingInhe extends JFrame
{
    private static final long serialVersionUID = 1L;

    HelloSwingInhe(String title)
    {
        super(title);
        JLabel jLbl = new JLabel("This is Swing Frame");

        add(jLbl);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run()
            {
                HelloSwingInhe win = new HelloSwingInhe("Hello Swing Inhe");
                win.setSize(400, 400);
                win.setVisible(true);
            }
        });
    }
}