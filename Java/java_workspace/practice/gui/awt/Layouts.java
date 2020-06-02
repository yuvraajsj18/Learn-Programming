import java.awt.event.*;
import java.awt.*;

public class Layouts
{   
    public static void main(String[] args) {
        Frame f;
        switch(args[0])
        {
            case "Flow":
                f = new Flow("Flow Layout Demo");
            break;
            case "Border":
                f = new Border("Border Layout Demo");
            break;
            case "Grid":
                f = new Grid("Grid Layout Demo");
            break;
            case "Card":
                f = new Card("Card Layout Demo");
            break;
            default:
                f = new Frame("Wrong Layout Given");
                f.addWindowListener(new MyWinLisn());
        }
        f.setSize(405, 425);
        f.setVisible(true);
    }
}

class Card extends Frame
{
    Labels labels = new Labels();
    Card(String title)
    {
        super(title);

        setLayout(new BorderLayout());
        setBackground(Color.BLACK);
        setForeground(Color.WHITE);
        setFont(new Font("Sanserif", Font.BOLD, 12));

        Panel top = new Panel();
        top.setLayout(new FlowLayout());
        Button left = new Button("Odd");
        Button right = new Button("Even");
        top.add(left);
        top.add(right);
        top.setBackground(Color.YELLOW);
        top.setForeground(Color.BLACK);
        add(top, BorderLayout.NORTH);

        Panel deck = new Panel();
        CardLayout cards = new CardLayout();
        deck.setLayout(cards);
        deck.setBackground(Color.DARK_GRAY);

        Panel oddPan = new Panel();
        oddPan.setBackground(Color.RED);
        Panel evenPan = new Panel();
        evenPan.setBackground(Color.BLUE);

        for (int i = 0; i < 6; i++)
            if (((i  + 1) & 1) == 0)
                evenPan.add(labels.l[i]);
            else
                oddPan.add(labels.l[i]);
        
        deck.add(oddPan, "odd");
        deck.add(evenPan, "even");

        add(deck, BorderLayout.CENTER);

        left.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae)
            {
                cards.show(deck, "odd");
            }
        });
        
        right.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae)
            {
                cards.show(deck, "even");
            }
        });

        oddPan.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent me)
            {
                cards.next(deck);
            }
        });

        evenPan.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent me)
            {
                cards.next(deck);
            }
        });

        addWindowListener(new MyWinLisn());
    }
}

class Grid extends Frame
{
    Labels labels = new Labels();
    Grid(String title)
    {
        super(title);

        setLayout(new GridLayout(4, 4));
        setFont(new Font("Sanserif", Font.BOLD, 14));

        for (int i = 0; i < 16; i++)
            if (i < 6)
                add(labels.l[i]);
            else
                add(new Label("Label " + (i + 1)));

        addWindowListener(new MyWinLisn());
    }

    @Override
    public Insets getInsets()
    {
        return new Insets(40, 20, 10, 20);
    }
}

class Border extends Frame
{
    Labels labels = new Labels();
    Border(String title)
    {
        super(title);

        setLayout(new BorderLayout());

        add(labels.l[0], BorderLayout.NORTH);
        add(labels.l[1], BorderLayout.SOUTH);
        add(labels.l[2], BorderLayout.EAST);
        add(labels.l[3], BorderLayout.WEST);        
        add(labels.l[4], BorderLayout.CENTER);
        add(labels.l[5], BorderLayout.CENTER);

        addWindowListener(new MyWinLisn());
    }

    @Override
    public Insets getInsets()
    {
        return new Insets(40, 20, 10, 20);
    }
}

class Flow extends Frame
{
    Labels labels = new Labels();
    Flow(String title)
    {
        super(title);

        setLayout(new FlowLayout(FlowLayout.CENTER, 100, 20));

        for (int i = 0; i < 6; i++)
            add(labels.l[i]);

        addWindowListener(new MyWinLisn());
    }
}

class Labels
{
    Label l[] = new Label[6];

    Labels()
    {
        for (int i = 0; i < 6; i++)
        {
            l[i] = new Label("Label " + (i + 1));
            l[i].setAlignment(Label.CENTER);
        }
    }
}

class MyWinLisn extends WindowAdapter
{
    @Override
    public void windowClosing(WindowEvent we)
    {
        System.out.println("Bye, Bye!!!");
        System.exit(0);
    }
}