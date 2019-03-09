import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Decouverte extends JFrame
{
    private JTextField textField;
    private JLabel label;
    private JPanel panel;

    public Decouverte()
    {
        super();
        build();
    }


    private void build()
    {
        setTitle("Decouverte");
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

        JTextField textField = new JTextField("Lorem ipsum");
        textField.setColumns(10);
        textField.setEditable(false);
    textField.setBorder(BorderFactory.createLineBorder(Color.BLUE,5));
        panel.add(textField,BorderLayout.NORTH);


        JButton button = new JButton("Ok");
        button.setToolTipText("Cliquez ici pour rendre le bouton inopérant et changer les couleurs");
        panel.add(button ,BorderLayout.SOUTH);

        return panel;
    }



    }

