import java.awt.*;
import java.awt.event.*;

public class LabelsDemo extends Frame{
    private static final long serialVersionUID = 1L;

    LabelsDemo(String title)
    {
        super(title);

        // setLayout(new FlowLayout());
        setLayout(new BorderLayout());

        addLabels();

        addWindowListener(new WindowAdapter() {
           @Override
           public void windowClosing(WindowEvent we)
           {
               System.out.println(we.getSource().getClass());
               setVisible(false);
               System.exit(0);
           } 
        });
    }

    void addLabels()
    {
        Label l1 = new Label("First Lable");
        Label l2 = new Label();
        l2.setText("Second Label");
        Label l3 = new Label("Third Label");
        Label l4 = new Label("Fourth Label"); //, Label.CENTER);

        // l1.setAlignment(Label.RIGHT);

        add(l1, BorderLayout.PAGE_START);
        add(l2, BorderLayout.PAGE_END);
        add(l3, BorderLayout.CENTER);
        add(l4, BorderLayout.LINE_START);
    }

    public static void main(String[] args) {
        LabelsDemo myWin = new LabelsDemo("Labels Demo");
        myWin.setSize(500, 500);
        myWin.setVisible(true);
    }
}