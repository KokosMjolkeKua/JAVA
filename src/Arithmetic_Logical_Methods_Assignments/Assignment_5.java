package Arithmetic_Logical_Methods_Assignments;
import static javax.swing.JOptionPane.*;
public class Assignment_5 {
    public static void main(String[]args){
        String inputF = showInputDialog("What is the temperature in Fahrenheit?");

        double F;
        try {
            F = Double.parseDouble(inputF);
        } catch (Exception e){
            F = 0;
            showMessageDialog(null, "Write a number!");
        }

        double C = (F-32)/1.8;
        String twoDecimalsC = String.format("%.2f", C);

        showMessageDialog(null, F + " degrees fahrenheit is " + C + " degrees celsius.");
    }
}
