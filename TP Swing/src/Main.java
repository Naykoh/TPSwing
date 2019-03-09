import javax.swing.*;

public class Main {

    public static void main(String[] args)
    {
        afficherFrame();
        afficherDecouverte();
        afficherTestClic();
        afficherClicAbstract();
        afficherAuditeur();
        afficherFactorielle();
        afficherCalculAge();
    }

    public static void afficherFrame()
    {
        SwingUtilities.invokeLater(new Runnable(){
            public void run() {
                SimpleFrame frame = new SimpleFrame();
                frame.setVisible(true);
            }
        });
    }

    public static void afficherDecouverte()
    {
        SwingUtilities.invokeLater(new Runnable(){
            public void run() {
                Decouverte frame = new Decouverte();
                frame.setVisible(true);
            }
        });
    }

    public static void afficherTestClic()
    {
        SwingUtilities.invokeLater(new Runnable(){
            public void run() {
                TestClic frame = new TestClic();
                frame.setVisible(true);
            }
        });
    }

    public static void afficherClicAbstract()
    {
        SwingUtilities.invokeLater(new Runnable(){
            public void run() {
                ClicAbstract frame = new ClicAbstract();
                frame.setVisible(true);
            }
        });
    }

    public static void afficherAuditeur()
    {
        SwingUtilities.invokeLater(new Runnable(){
            public void run() {
                Auditeur frame = new Auditeur();
                frame.setVisible(true);
            }
        });
    }

    public static void afficherFactorielle()
    {
        SwingUtilities.invokeLater(new Runnable(){
            public void run() {
                Factorielle frame = new Factorielle();
                frame.setVisible(true);
            }
        });
    }


    public static void afficherCalculAge()
    {
        SwingUtilities.invokeLater(new Runnable(){
            public void run() {
                CalculAge frame = new CalculAge();
                frame.setVisible(true);
            }
        });
    }

}
