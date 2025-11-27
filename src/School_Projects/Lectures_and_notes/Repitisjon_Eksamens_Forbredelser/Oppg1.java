package School_Projects.Lectures_and_notes.Repitisjon_Eksamens_Forbredelser;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Oppg1 {
    public static void main(String[]args){

        double a = 0;
        double b = 0;

        String tallA;
        String tallB;

        do {
            tallA = showInputDialog("Skriv inn ett desimaltall, eller q for å avslutte Loopen!");

            try {
                a = Double.parseDouble(tallA);
            } catch (Exception e) {
                showMessageDialog(null, "Bruker input var ikke ett tall");
            }

            tallB = showInputDialog("Skriv inn ett desimaltall til:");

            try {
                b = Double.parseDouble(tallB);
            } catch (Exception e){
                showMessageDialog(null, "Bruker input var ikke ett tall");
            }

            double sum = a + b;
            double produkt = a * b;
            double diff;

            if (a > b){
                diff = a - b;
            } else {
                diff = b - a;
            }

            showMessageDialog(null, "\nSummen:" + sum
                    + "\nProduktet: " + produkt + "\nDifferansen: " + diff);

        } while (!tallA.equals("q") || !tallB.equals("q"));
    }
}
