package Control_Structure;
import static javax.swing.JOptionPane.*;
public class Assignment_2 {
    public static void main(String[]args){
        String inputAge = showInputDialog("What is your age?");
        int age;
        try{
            age = Integer.parseInt(inputAge);
            if (age < 18){
                showMessageDialog(null,
                        "You are not old enough to drink!");
            }
            if (age >= 18 && age < 20){
                showMessageDialog(null,
                        "You are old enough to drink, " +
                                "but you cannot drink anything above 22% alcohol");
            } if (age >= 20) {
                showMessageDialog(null,
                        "You are old enough to drink what you want!");
            }
        } catch (Exception e){
            age = 0;
            showMessageDialog(null, "Write a whole number.");
        }

    }
}
