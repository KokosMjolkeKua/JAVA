package School_Projects.Lectures_and_notes.OppgaverForelesning1og2;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class  oppgave3 {
    public static void main(String[] args){
        showMessageDialog(null, "Hei, velkommen til mitt program!");

        String forNavn = showInputDialog("Skriv inn fornavnet dett:");
        String etterNavn = showInputDialog("Skriv inn etternavnet ditt:");
        String alder = showInputDialog("Have er din alder?");

        String postNr, adresse, postSted;
        adresse = showInputDialog("Hva er din adresse?");
        postNr = showInputDialog("Hva er ditt postnummer?");
        postSted = showInputDialog("Hva er ditt poststed?");

        showMessageDialog(null, forNavn + " " + etterNavn + " er " + alder + " gammel, og bor på " + adresse + " " + postNr + " " + postSted + ".");
    }
}
