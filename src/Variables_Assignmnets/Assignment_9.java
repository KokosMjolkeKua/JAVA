package Variables_Assignmnets;
import static javax.swing.JOptionPane.*;
public class Assignment_9 {
    public static void main(String[]args){
        showMessageDialog(null, "Welcome to this program!");
        String N1 = showInputDialog("Write a decimal number: ");
        String N2 = showInputDialog("Write another decimal number: ");
        String N3 = showInputDialog("Write a last decimal number: ");

        double n1, n2, n3;
        try {
            n1 = Double.parseDouble(N1);
            n2 = Double.parseDouble(N2);
            n3 = Double.parseDouble(N3);

        } catch (Exception e){
            n1 = 0;
            n2 = 0;
            n3 = 0;

            showMessageDialog(null, "Write a number!");

        }


        double sum = n1 + n2 + n3;
        double sumAverage = (n1 + n2 + n3) / 3;
        String average = String.format("%.2f", sumAverage);
        String sumToD = String.format("%.2f", sum);

        showMessageDialog(null, "The summation of the decimal-numbers are: " + sumToD +
                                                        "\nAnd the average is: " + average);

    }
}
