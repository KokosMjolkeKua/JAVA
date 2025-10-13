package Control_Structure;
import static javax.swing.JOptionPane.*;
public class Assignment_Other_5 {
    public static void main(String[]args){
        int number;
        int largest = 0;
        int secondLargest = 0;
        for (int i = 1; i <= 5; i++){
            String inputNumber = showInputDialog(null, "Write a number: nr: " + i);
            number = Integer.parseInt(inputNumber);
            if (number > largest){
                secondLargest = largest;
                largest = number;
            }
            else if (number > secondLargest){
                secondLargest = number;
            }
        }
        showMessageDialog(null, "\nThe largest number is " + largest +
                "\nAnd the second largest number is: " + secondLargest);
    }
}
