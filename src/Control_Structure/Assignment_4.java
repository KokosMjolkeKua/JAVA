package Control_Structure;
import static javax.swing.JOptionPane.*;
public class Assignment_4 {
    public static void main(String[]args){
        String inputAge = showInputDialog(null, "What is your age?");
        int age;
        try{
            age = Integer.parseInt(inputAge);
            if (age < 18){
                showMessageDialog(null,
                        "You are not old enough to take your drivers-liscense.");
            }
            else {
                showMessageDialog(null,
                        "You are old enough to take your drivers-liscense.");
                if (age >= 70){
                    showMessageDialog(null,
                            "But; you have to have a yearly health check because of your age.");
                }
                if (age >= 18 && age <= 70){
                    showMessageDialog(null, "And; you do not need a yearly health check!");
                }
            }

        } catch (Exception e){
            age = 0;
            showMessageDialog(null, "Write a whole-Number.");
        }
    }
}
