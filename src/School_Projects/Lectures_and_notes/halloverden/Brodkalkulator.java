package School_Projects.Lectures_and_notes.halloverden;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

// Stor forbokstav betyr klasse
// liten forbokstav betyr variabel
// camelCase

public class Brodkalkulator {
    public static void main(String[] args) {

        double melDl;
        double melkDl;

        String melDlInput;
        String melkDlInput;

        melDlInput = showInputDialog("Hvor mye mel har du i Dl?");
        melkDlInput = showInputDialog("Hvor mye melk har du i Dl?");

        // blir feil fordi de ikke er samme datatype
        // må konvertere String til double

        //konvertere string til double
        try {
            melDl = Double.parseDouble(melDlInput);
            melkDl = Double.parseDouble(melkDlInput);
        }
        catch (Exception e) {
            melDl = 0;
            melkDl = 0;
            showMessageDialog(null, "Du gav ikke tall inputt.");
        }


        double deigDl = melDl + melkDl;
        double deigPerBrød = 1.5;

        double antallBrød = deigDl/deigPerBrød;

        showMessageDialog(null, "Du kan lage " + antallBrød + " antall brød!");

        System.out.println("Du har " + melDl + " Dl mel og " + melkDl + " Dl melk.");
        showMessageDialog(null, "Du har " + melDl + " Dl mel og " + melkDl + " Dl melk.");


        //hvis du skriver tekst istedenfor tall i inputboksen, vil programmet krasje
        //kan bruke try og catch for å unngå dette
    }
}
