package School_Projects.Lectures_and_notes.Oblig1;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class HelloWorld {
    public static void main(String[] args) {
        showMessageDialog(null, "Hei, velkommen til Oblig 1!");

        String forNavn;
        forNavn = showInputDialog("Hva er fornavnet ditt?");

        String etterNavn = showInputDialog("Hva er etternavnet ditt?");


        String fulltNavn = forNavn + " " + etterNavn;



        System.out.println("Tenk at jeg " + fulltNavn + ", har naila Oblig1 allerede!");
        showMessageDialog(null,"Tenk at jeg " + fulltNavn  + ", har naila oblig 1 allerede!");


    }
}