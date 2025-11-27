package School_Projects.Lectures_and_notes.OppgaverAritmetikk;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;
public class oppg7 {
    public static void main(String[]args){
        showMessageDialog(null, "Lurer du på hvor mange stykker pizza dere får hver der?");
        int antallPizza = Integer.parseInt(showInputDialog("Hvor mange pizzaer har dere?"));
        int antallPersoner = Integer.parseInt(showInputDialog("Hvor mange personer er dere?"));
        int antallSlicesPerPizza = (6 * antallPizza) / antallPersoner;
        int restSlices = (6 * antallPizza) % antallPersoner;

        showMessageDialog(null, "Dersom man er " + antallPersoner + " personer og man har " + antallPizza + " pizzaer får hver person " + antallSlicesPerPizza + " slices, og det blir " + restSlices + " slices til overs!");
    }
}
