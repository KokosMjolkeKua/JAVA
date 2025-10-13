package Control_Structure;
import static javax.swing.JOptionPane.*;
public class Assignment_Other_4 {
    public static void main(String[]args){
        int number;
        int largest = 0;
        for (int i = 1; i <= 10; i++){
            String inputNumber = showInputDialog(null, "Write in a whole number, number: " + i);
            number = Integer.parseInt(inputNumber);
            if (number > largest){
                largest = number;
            }
        }
        showMessageDialog(null, "\nThe largest number is: " + largest + "\n");
    }
}
