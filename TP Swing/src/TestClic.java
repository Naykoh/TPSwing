import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestClic extends JFrame implements ActionListener
{
    private JButton button1;
    private JButton button2;
    private JButton button3;

    public TestClic()
    {
        super();
        build();
    }


    private void build()
    {
        setTitle("Test Clic");
        setSize(400,200);
        setMinimumSize(new Dimension(100,100));
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(buildContentPane());
    }

    private JPanel buildContentPane()
    {
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        JLabel label = new JLabel("Lorem ipsum");
        label.setHorizontalAlignment(JLabel.CENTER);
        panel.add(label);

        button1 = new JButton("button1");
        button2 = new JButton("button2");
        button3 = new JButton("button3");


        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);

        panel.add(button1);
        panel.add(button2);
        panel.add(button3);

        return panel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();

        if (source == button1)
        {
            setTitle("*Un*");
        }
        else if (source == button2)
        {
            setTitle("*Deux*");
        }
        else if (source == button3)
        {
            setTitle("*Trois*");
        }
    }
}
