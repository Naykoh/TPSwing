import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class AddAction extends AbstractAction {

    private JFrame frame;
    private JPanel panel;
    private static int btn = 0;
    private JButton newButton;


    public AddAction(String title, JFrame frame, JPanel panel) {
        super(title);
        this.frame = frame;
        this.panel = panel;
    }


        @Override
        public void actionPerformed(ActionEvent e)
        {   Object source = e.getSource();

            newButton = new JButton(new DeleteAction("" + btn + "",frame,panel));
            btn++;
            panel.add(newButton);
            frame.setContentPane(panel);


        }
    }

