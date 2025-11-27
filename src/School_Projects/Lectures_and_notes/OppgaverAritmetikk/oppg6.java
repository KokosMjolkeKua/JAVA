package School_Projects.Lectures_and_notes.OppgaverAritmetikk;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;
public class oppg6 {
    public static void main(String[]args){
        showMessageDialog(null, "Kurs Kalkulator:");
        double USD;
        double NOK;

        USD = Double.parseDouble(showInputDialog("Skriv inn hvor mange dollar du ønsker å konvertere:"));
        NOK = USD * 10.05;

        double NOKToDecimaler = Double.parseDouble(String.format("%.2f", NOK));

        showMessageDialog(null, "Når man har " + USD + " amerikanske dollar, har man " + NOKToDecimaler + " norske kroner.");
    }
}
