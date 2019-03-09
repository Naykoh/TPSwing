import javax.swing.*;
import java.awt.event.ActionEvent;

public class Calculate extends AbstractAction {
    private Factorielle frame;
    private JPanel panel;
    private JLabel label;


    public Calculate(String name, Factorielle frame,JPanel panel,JLabel label) {
        super(name);
        this.frame=frame;
        this.panel=panel;
        this.label=label;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    String texteUtilisateur = frame.getTextField().getText();
    int nombreUtilisateur= Integer.parseInt(texteUtilisateur);

    JButton button = (JButton)e.getSource();

    if (nombreUtilisateur > 16)
    {
        button.setText("autre nombre svp");


                SwingUtilities.invokeLater(new Runnable(){
                    public void run(){
                        JDialog dialog = new JDialog();
                        JPanel panel = new JPanel();
                        panel.add(new JLabel("entrez un entier inférieur a 17"));
                        dialog.add(panel);
                        dialog.setSize(300, 200);
                        dialog.setTitle("Erreur");
                        dialog.setVisible(true);
                        dialog.setLocationRelativeTo(null);
                        dialog.setDefaultCloseOperation(JDialog.HIDE_ON_CLOSE);
                    }
                });



    }
    else {

        button.setText(texteUtilisateur + "!");


        String resultat = Integer.toString(fact(nombreUtilisateur));
        label.setText(resultat);
    }
    }


    public static int fact (int n) {
        int f = 1;
        for (int i=1; i<=n; i++)
            f=f*i;
        return(f);
    }
}
