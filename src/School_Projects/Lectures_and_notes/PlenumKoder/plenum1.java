package School_Projects.Lectures_and_notes.PlenumKoder;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class plenum1 {
    public static void main(String[] args){
        String navn, adresse;
        navn = "Per Hansen";
        adresse = "Osloveien82";
        String postAdresse = "Oslo";
        String postNr = "0234";
        System.out.println("navnet er: " + navn);
        System.out.println("Adressen er: ");
        System.out.println(adresse + " " + postNr + " " + postAdresse);

        String innNavn = showInputDialog("Skriv inn fornavn og etternavn:");
        String innAdresse = showInputDialog("Skriv inn adressen din:");
        String innPostNr = showInputDialog("Skriv inn postnummeret ditt:");

        showMessageDialog(null, innNavn + " har adressen " + innAdresse + innPostNr);

        String ut = "Navnet : " + innNavn + "\n" + "Adressen : " + innAdresse + "\n" + innPostNr;
        showMessageDialog(null, ut);
    }
}
