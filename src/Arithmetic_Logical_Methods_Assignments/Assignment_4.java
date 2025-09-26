package Arithmetic_Logical_Methods_Assignments;
import static javax.swing.JOptionPane.*;
public class Assignment_4 {
    public static void main(String[]args){
        String inputRadius = showInputDialog("Write in the radius of a circle: ");

        double radius;
        try {
            radius = Double.parseDouble(inputRadius);
        } catch (Exception e){
            radius = 0;
            showMessageDialog(null, "Write a number!");
        }

        double circumference = 2 * 3.14 * radius;
        String twoDecimalsCircumference = String.format("%.2f", circumference);
        showMessageDialog(null, "The circumference of a circle that has a radius of " + radius + " cm." +
                "\nHas the circumference " + twoDecimalsCircumference + " cm.");

        showMessageDialog(null, "Goodbye!");
    }
}
