package School_Projects.Lectures_and_notes.OppgaverAritmetikk;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;
public class oppg3 {
    public static void main(String[]args){
        showMessageDialog(null, "Hei! velkommen til denne areal kalkulatoren!");
        double length;
        double width;

        try {
            length = Double.parseDouble(showInputDialog("Vennligst skriv inn lengden på rektangelet:"));
            width = Double.parseDouble(showInputDialog("Vennligst skriv inn bredden på rektangelet:"));
            double areal = length * width;
            showMessageDialog(null, "Et rektangel med bredden " + width + " cm og en lengde på " + length + " cm, har et areal på " + areal + " cm^2.");

        }
        catch (Exception e){
            length = 0;
            width = 0;
            showMessageDialog(null, "Vennligst skriv inn et decimaltall!");
        }

    }
}
