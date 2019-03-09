import javax.swing.*;
import java.awt.event.ActionEvent;

public class ButtonCalculAge extends AbstractAction {

    private CalculAge calculAge;

    public ButtonCalculAge(CalculAge calculAge, String texte){
        super(texte);
        this.calculAge = calculAge;
    }

    public void actionPerformed(ActionEvent e) {
        calculAge.calcul();
    }
}