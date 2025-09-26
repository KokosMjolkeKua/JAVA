package Variables_Assignmnets;
import static javax.swing.JOptionPane.*;
public class Assignment_2 {
    public static void main(String[]args){
        String firstName;
        String lastName;
        int age;

        showMessageDialog(null, "Hi and Welcome!");

        firstName = showInputDialog("What is your first-name?");
        lastName = showInputDialog("What is your last-name?");
        age = Integer.parseInt(showInputDialog("What is you age? (In whole numbers)"));

        showMessageDialog(null, "Welcome " + firstName + " " + lastName + " who is "
                                                + age + " years of age, and thank you for using our program!");

        showMessageDialog(null, "Goodbye!");
    }
}
