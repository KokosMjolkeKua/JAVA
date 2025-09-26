package Variables_Assignmnets;
import static javax.swing.JOptionPane.*;
public class Assignment_3 {
    public static void main(String[]args){
        String firstName;
        String lastName;
        int age;
        int postNr;
        String address;
        String city;

        showMessageDialog(null, "Hi and Welcome!");

        firstName = showInputDialog("What is your first-name?");
        lastName = showInputDialog("What is your last-name?");
        age = Integer.parseInt(showInputDialog("What is you age? (In whole numbers)"));
        postNr = Integer.parseInt(showInputDialog("What is your post-number? (In whole numbers)"));
        address = showInputDialog("What is your address?");
        city = showInputDialog("What is the name of your city?");

        showMessageDialog(null, "Welcome " + firstName + " " + lastName + "." +
                            "\nWho is " + age + " years of age." +
                            "\nAnd lives at " + address + " " + postNr + "." +
                            "\nIn the city of " + city + ".");

        showMessageDialog(null, "Thank you for using the Program!" + "\nGoodbye!");
    }
}
