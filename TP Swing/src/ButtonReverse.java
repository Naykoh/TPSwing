import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JTextField;



public class ButtonReverse extends AbstractAction {

    private CalculAge calculAge;

    public ButtonReverse(CalculAge calculAge, String texte){
        super(texte);
        this.calculAge = calculAge;
    }

    public void actionPerformed(ActionEvent e) {

        JTextField lastName = calculAge.getLastName();
        StringBuilder s1 = new StringBuilder(lastName.getText());
        lastName.setText(s1.reverse().toString());

        JTextField firstName = calculAge.getFirstName();
        StringBuilder s2 = new StringBuilder(firstName.getText());
        firstName.setText(s2.reverse().toString());

        JTextField birthDate = calculAge.getBirthDate();
        StringBuilder s3 = new StringBuilder(birthDate.getText());
        birthDate.setText(s3.reverse().toString());

        calculAge.calcul();
    }
}