package Variables_Assignmnets;
import static javax.swing.JOptionPane.*;
public class Assignment_7 {
    public static void main(String[]args){
        showMessageDialog(null, "Hello, and Welcome..");
        double n1 = Double.parseDouble(showInputDialog("Write one decimal number!"));
        double n2 = Double.parseDouble(showInputDialog("Write one more decimal number!"));
        double n3 = Double.parseDouble(showInputDialog("Write one last decimal number!"));

        showMessageDialog(null, "We will now summize these numbers!");

        double sum = n1 + n2 + n3;
        String toDecimalSum = String.format("%.2f", sum);

        System.out.println("The answer: " + toDecimalSum);
    }
}
