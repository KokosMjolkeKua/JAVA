package Arithmetic_Logical_Methods_Assignments;
import static javax.swing.JOptionPane.*;
public class Assignment_1 {
    public static void main(String[]args){
        String name = showInputDialog("What is your  full name?");
        String inputAge = showInputDialog("What is your age?");

        int age;
        try{
            age = Integer.parseInt(inputAge);
        } catch (Exception e){
            age = 0;
            showMessageDialog(null, "Write in a whole number!");
        }
        int year = 2025 - age;

        showMessageDialog(null, "Hi " + name + "." +
                "\nSince you are " + age + " years of age." + "\nYou must have been born in " + year + ".");

        if (age > 67){
            showMessageDialog(null, "Since you are over the age of 67" +
                    "\nYou have already started your pension!");
        } else {
            int future = year + 67;
            showMessageDialog(null, "In " + future + " you will be 67 years of age, and starting your pension!");
        }
        showMessageDialog(null, "Thank you and Goodbye!");
    }
}
