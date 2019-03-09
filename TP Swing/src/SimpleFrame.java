import javax.swing.*;
import java.awt.*;

public class SimpleFrame extends JFrame
{
    public SimpleFrame()
    {
        super();
        build();
    }


    private void build()
    {
        setTitle("Simple Frame");
        setSize(400,200);
        setMinimumSize(new Dimension(100,100));
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(buildContentPane());
    }

    private JPanel buildContentPane()
    {
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        JLabel label = new JLabel("Lorem ipsum");
        label.setHorizontalAlignment(JLabel.CENTER);
        panel.add(label, BorderLayout.CENTER);

        panel.add(new Button("OK"),BorderLayout.SOUTH);

        return panel;
    }
}
