import javax.swing.*;
import java.awt.*;

public class Factorielle extends JFrame{
private JTextField textField;
private JLabel label;

    public Factorielle() {
        super();
        build();
    }
    private void build() {
        setTitle("Factorielle");
        setSize(400, 200);
        setMinimumSize(new Dimension(100, 100));
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(buildContentPane());
    }

    private JPanel buildContentPane() {
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        textField = new JTextField();
        textField.setColumns(10);
        panel.add(textField);

        label = new JLabel();

        JButton button = new JButton(new Calculate("calcul" , this, panel,label));
        panel.add(button);


        panel.add(label);

        return panel;
    }


    public JTextField getTextField()
    {
        return textField;
    }
    public JLabel getLabel()
    {
        return label;
    }
}
