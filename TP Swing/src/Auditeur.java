import javax.swing.*;
import java.awt.*;


public class Auditeur extends JFrame {
    private JButton button1;
    private JButton buttonReset;
    private JPanel panel;


    public Auditeur() {
        super();
        build();
    }


    private void build() {
        setTitle("Auditeur");
        setSize(400, 200);
        setMinimumSize(new Dimension(100, 100));
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(buildContentPane());
    }

    private JPanel buildContentPane() {
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        button1 = new JButton(new AddAction("Add", this, panel));

        panel.add(button1);

        return panel;
    }
}
