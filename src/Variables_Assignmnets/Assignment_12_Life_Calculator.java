package Variables_Assignmnets;
import static javax.swing.JOptionPane.*;
public class Assignment_12_Life_Calculator {
    public static void main(String[]args){
        showMessageDialog(null, "Life Calculator");

        String inputAge = showInputDialog(null, "How old are you in years?");

        int age;
        try{
            age = Integer.parseInt(inputAge);
        }catch (Exception e){
            age = 0;

            showMessageDialog(null, "Please write a number");
        }

        int aliveDays = 365 * age;
        int aliveHours = aliveDays * 24;
        int aliveMinutes = aliveHours * 60;

        showMessageDialog(null, "Hello, you are " + age + " years old." +
                "\nYou have lived for " + aliveDays + " days." + "\nYou have lived for " + aliveHours + " hours." +
                "\nAnd you have been alive for " + aliveMinutes + " minutes.");

        showMessageDialog(null, "Goodbye");
    }
}
