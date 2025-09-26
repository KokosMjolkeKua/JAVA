package Variables_Assignmnets;
import static javax.swing.JOptionPane.*;
public class Assignment_10_BreadCalculator {
    public static void main(String[] args) {

        String flourDlInput = showInputDialog("Hvor mye mel har du?");


        double flourDl;
        try {
            flourDl = Double.parseDouble(flourDlInput);
        } catch (Exception e) {

            flourDl = 0;

            showMessageDialog(null, "Du ga ikke tall inputt");
        }

        double milkDl = flourDl / 2;
        double doughDl = flourDl + milkDl;
        double doughPerBread = 1.5;
        double amountOfBread = doughDl/doughPerBread;

        showMessageDialog(null, "When you have " + flourDl + " Dl of flour, you need half the amount milk." + "\nWhich in this case is: " + milkDl + "\nWith this amount of flour and milk you can make " + doughDl + " Dl of Dough." + "\nAnd " + amountOfBread + " number of bread!");
    }
}