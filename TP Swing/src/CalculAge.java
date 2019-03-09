import java.awt.*;
import java.util.Calendar;

import javax.swing.*;

public class CalculAge extends JFrame {

    private JLabel labelLastName;
    private JTextField lastName;

    private JLabel labelFirstName;
    private JTextField firstName;

    private JLabel labelAge;
    private JTextField age;


    private JTextField birthDate;


    public CalculAge() {
        super();
        build();
    }

    private void build() {
        setTitle("Calcul age");
        setSize(400,200);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(buildContentPane());
    }

    private JPanel buildContentPane() {
        JPanel TopPanel = new JPanel();
        TopPanel.setLayout(new GridLayout(2,1));
        TopPanel.setBackground(Color.green);

        labelLastName = new JLabel("Votre nom : ");
        lastName = new JTextField("", 20);
        lastName.setEditable(true);
        TopPanel.add(labelLastName);
        TopPanel.add(lastName);

        labelFirstName = new JLabel("Votre prénom : ");
        firstName = new JTextField("", 20);
        firstName.setEditable(true);
        TopPanel.add(labelFirstName);
        TopPanel.add(firstName);

        JPanel MidPanel = new JPanel();
        MidPanel.setLayout(new FlowLayout());
        MidPanel.setBackground(Color.green);
        labelAge = new JLabel("Votre année de naissance : ");
        birthDate = new JTextField("", 3);
        birthDate.setEditable(true);
        age = new JTextField(" ", 27);
        age.setEditable(false);
        age.setBackground(Color.cyan);
        MidPanel.add(labelAge);
        MidPanel.add(birthDate);
        MidPanel.add(age);

        JPanel BotPanel = new JPanel();
        BotPanel.setLayout(new FlowLayout());
        BotPanel.setBackground(Color.yellow);

       JButton buttonAge = new JButton(new ButtonCalculAge(this,"Age?"));
       JButton buttonReverse = new JButton(new ButtonReverse(this,"Reverse"));


        BotPanel.add(buttonAge);
        BotPanel.add(buttonReverse);
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.add("North", TopPanel);
        panel.add("Center", MidPanel);
        panel.add("South", BotPanel);
        return panel;
    }

    public JTextField getLastName() {
        return lastName;
    }

    public JTextField getFirstName() {
        return firstName;
    }

    public JTextField getBirthDate() {
        return birthDate;
    }

    public JTextField getAge() {
        return age;
    }


    void calcul()
    {
        JTextField birthDate = getBirthDate();
        if (birthDate.getText().equals("") == false)
        {
            Calendar cal = Calendar.getInstance();
            int annee = cal.get(Calendar.YEAR);
            int age = annee - Integer.parseInt(birthDate.getText());

            String chaine = "En " + annee + " vous avez " + age + " ans.";
            getAge().setText(chaine);
        }
    }
}






