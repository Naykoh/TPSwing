import javax.swing.*;
import java.awt.event.ActionEvent;

public class DeleteAction extends AbstractAction {

    private JFrame frame;
    private JPanel panel;




public DeleteAction(String title,JFrame frame,JPanel panel)
{
    super(title);
    this.frame = frame;
    this.panel = panel;





}

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();

        JButton button = (JButton) source;

        button.setEnabled(false);
        button.setVisible(false);
        panel.remove(button);
        frame.setContentPane(panel);

    }
}

