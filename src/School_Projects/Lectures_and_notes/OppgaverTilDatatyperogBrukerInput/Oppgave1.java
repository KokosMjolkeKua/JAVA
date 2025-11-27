package School_Projects.Lectures_and_notes.OppgaverTilDatatyperogBrukerInput;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;
public class  Oppgave1 {
    public static void main(String[] args){
        showMessageDialog(null, "Hei, dette er et program hvor vi kan finne ut hvor mye melk du trenger.");
        double MelDL;
        MelDL = Double.parseDouble(showInputDialog("Hvor mange DL mel har du?"));
        double DeigPerBrød = 1.5;
        double melkDL = MelDL / DeigPerBrød;

        double deig = MelDL + melkDL / DeigPerBrød;
        showMessageDialog(null, "Du trenger " + melkDL + " Dl med melk, når du har " + MelDL + " Dl med Mel." + "\n" + "Du kan lage " + deig + " Dl med deig, med de ingrediensene du har.");


    }
}
