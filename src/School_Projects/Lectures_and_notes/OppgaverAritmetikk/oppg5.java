package School_Projects.Lectures_and_notes.OppgaverAritmetikk;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;
public class oppg5 {
    public static void main(String[]args){
        double Farenheit;
        double sum;
        double sumToDecimaler;

        try {
            Farenheit = Double.parseDouble(showInputDialog("Vennligst skriv inn hvor mange grader Farenheit:"));
            sum = (Farenheit - 32) / 1.8;
            sumToDecimaler = Double.parseDouble(String.format("%.2f", sum));

            showMessageDialog(null, "Når det er " + Farenheit + " grader Farenheit, er det " + sumToDecimaler + " grader Celsius.");
        } catch (Exception e){
            Farenheit = 0;
            showMessageDialog(null, "Vennligst skriv inn ett decimaltall");
        }
    }
}
