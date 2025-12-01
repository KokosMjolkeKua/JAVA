package School_Projects.Exam_practice.Module_three;

import static javax.swing.JOptionPane.*;

public class Aritmetikk_and_Logic {
    public static void main(String[]args){
        showMessageDialog(null, "Summation project:");

        String numberInputOne = showInputDialog("Write in the First whole number!");
        String numberInputTwo = showInputDialog("Write your second whole number!");

        String text = "Invalid Input";

        int firstNr;
        int secondNr;
        int sum;

        try{
            firstNr = Integer.parseInt(numberInputOne);
            secondNr = Integer.parseInt(numberInputTwo);

            sum = firstNr + secondNr;

            text = firstNr + " + " + secondNr + " = " + sum;
        }
        catch (Exception e){
            firstNr = 0;
            secondNr = 0;
        }

        showMessageDialog(null, "The Results: " +
                "\n" + text);

        System.out.println("The Results: " + "\n" + text);



    }
}
