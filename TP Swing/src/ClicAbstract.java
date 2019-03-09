import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClicAbstract extends JFrame
{
    private JButton button1;
    private JButton button2;
    private JButton button3;

    public ClicAbstract()
    {
        super();
        build();
    }


    private void build()
    {
        setTitle("Clic Abstract");
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

        button1 = new JButton(new BoutonAction("*Un*",this));
        button2 = new JButton(new BoutonAction("*Deux*",this));
        button3 = new JButton(new BoutonAction("*Trois*",this));



        panel.add(button1);
        panel.add(button2);
        panel.add(button3);

        return panel;
    }
}
