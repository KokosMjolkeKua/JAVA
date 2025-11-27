package School_Projects.Lectures_and_notes.OppgaverForelesning1og2;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class  oppgave4 {
    public static void main(String[] args){
        showMessageDialog(null, "Hei, velkommen til mitt program!");

        String forNavn = showInputDialog("Skriv inn fornavnet dett:");
        String etterNavn = showInputDialog("Skriv inn etternavnet ditt:");
        String fulltNavn = forNavn + " " + etterNavn;
        String alder = showInputDialog("Have er din alder?");

        String postNr, adresse, postSted;
        adresse = showInputDialog("Hva er din adresse?");
        postNr = showInputDialog("Hva er ditt postnummer?");
        postSted = showInputDialog("Hva er ditt poststed?");

        showMessageDialog(null, "Navnet: " + fulltNavn + "\n" + "Alder: " + alder + "\n" + "Adresse: " + adresse + "\n" + "Postnummer: " + postNr + "\n" + "Poststed: " + postSted);

    }
}
