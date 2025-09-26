package Variables_Assignmnets;
import static javax.swing.JOptionPane.*;
public class Assignment_1 {
    public static void main(String[]args){
        String firstName;
        String lastName;

        showMessageDialog(null, "Hi and Welcome!");

        firstName = showInputDialog("What is your first-name?");
        lastName = showInputDialog("What is your last-name?");

        showMessageDialog(null, "Welcome " + firstName + " " + lastName + " to our Program!");

        showMessageDialog(null, "Goodbye!");
    }
}
