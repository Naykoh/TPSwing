import javax.swing.*;
import java.awt.event.ActionEvent;

public class BoutonAction extends AbstractAction {


    private String texte;
    private JFrame frame;

    public BoutonAction(String texte, JFrame frame)
    {
        super(texte);
        this.texte=texte;
        this.frame=frame;
    }
    public void actionPerformed(ActionEvent e) {
    frame.setTitle(texte);
    }
}
