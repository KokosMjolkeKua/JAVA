package Variables_Assignmnets;
import static javax.swing.JOptionPane.*;
public class Assignment_6 {
    public static void main(String[]args){
        int age;

        showMessageDialog(null, "Hello");
        age = Integer.parseInt(showInputDialog("What is your age? (In whole numbers)"));

        showMessageDialog(null, "My age is " + age + " years!");
    }
}
