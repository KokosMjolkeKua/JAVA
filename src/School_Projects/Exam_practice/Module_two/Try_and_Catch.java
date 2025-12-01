package School_Projects.Exam_practice.Module_two;

import static javax.swing.JOptionPane.*;

public class Try_and_Catch {
    public static void main(String[]args){

        showMessageDialog(null, "Welcome to this program!");

        String numberInput;
        double number;
        numberInput = showInputDialog("Write in a number please:");

        try{
            number = Double.parseDouble(numberInput);
        }
        catch (Exception e){
            number = 0;
            showMessageDialog(null, "Write a number only!");
        }

        showMessageDialog(null, "Your number is: " + number);




        String numberInputTwo;
        numberInputTwo = showInputDialog("Write a number between 1-100:");
        double numberTwo;

        String text = "Invalid input";
        try{
            numberTwo = Double.parseDouble(numberInputTwo);

            if (numberTwo < 1 || numberTwo > 100){
                showMessageDialog(null, "You did not write a number between 1 and 100..");
            }
            else{
                text = "Your number is: " + numberTwo;
            }
        }
        catch (Exception e){
            numberTwo = 0;
            showMessageDialog(null, "You did not provide a number");
        }

        showMessageDialog(null, text + "\nYour Input: " + numberTwo);
    }
}
