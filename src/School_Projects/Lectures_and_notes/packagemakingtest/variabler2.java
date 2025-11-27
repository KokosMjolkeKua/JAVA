package School_Projects.Lectures_and_notes.packagemakingtest;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;


public class  variabler2 {
    public static void main(String[] args) {
        showMessageDialog(null, "Hei!");
        String forNavn = showInputDialog("Hva er fornavnet ditt?");
        String etterNavn = showInputDialog("Hva er etternavnet ditt?");
        String fulltNavn = forNavn + " " + etterNavn;

        double alder = Double.parseDouble(showInputDialog("Hvor gammel er du?"));

        // double aarsTall = alder - 2025 " eller " + alder - 2024;

        // /n linjeshift

        String adresse;
        String postNr;
        String postSted;
        String telefonNr;
        System.out.println("Din alder er " + alder);
    }
}
