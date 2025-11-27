package School_Projects.Lectures_and_notes.OppgaverForelesning1og2;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;
public class  Oppgave8 {
    public static void main(String[] args){
        showMessageDialog(null, "Velkommen til desimaltallsregning!");
        String tall1 = showInputDialog("Skriv inn et desimaltall:");
        String tall2 = showInputDialog("Skriv inn et desimaltall til:");
        String tall3 = showInputDialog("Skriv inn et siste desimaltall:");
        double tall4 = Double.parseDouble(tall1);
        double tall5 = Double.parseDouble(tall2);
        double tall6 = Double.parseDouble(tall3);

        double sum = tall4 + tall5 + tall6;
        System.out.println("Summen av tallene er: " + sum);
        double gjenomsnitt = sum / 3;
        System.out.println("Gjenomsnittet av tallene er: " + gjenomsnitt);
        showMessageDialog(null, "Summen av tallene er: " + sum + "\n" + "Gjennomsnittet av tallene er: " + gjenomsnitt);


    }
}
