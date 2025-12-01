package School_Projects.Exam_practice.Module_two.Assignments;

import static javax.swing.JOptionPane.*;

public class A_five {
    public static void main(String[]args){
        showMessageDialog(null, "This program reads in 3 decimal numbers and then " +
                "\nsummize these numbers into a single number.");

        String decInputOne = showInputDialog("What is your first decimal-number?");
        String decInputTwo = showInputDialog("What is your second decimal-number?");
        String decInputThree = showInputDialog("What is your last decimal-number?");

        double numberOne;
        double numberTwo;
        double numberThree;

        String text = "Invalid Input";

        try{
            numberOne = Double.parseDouble(decInputOne);
            numberTwo = Double.parseDouble(decInputTwo);
            numberThree = Double.parseDouble(decInputThree);

            text = "The Summation of: " +
                    "\nFirst number: " + numberOne +
                    "\nSecond number: " + numberTwo +
                    "\nLast number: " + numberThree +
                    "\nIs: ";
        }
        catch(Exception e){
            numberOne = 0;
            numberTwo = 0;
            numberThree = 0;
//
//            String outputOne = " ";
//            String outputTwo = " ";
//            String outputThree = " ";
//
//            if(numberOne == 0){
//                outputOne = "\nYour First number is an invalid input";
//            }
//            if(numberTwo == 0){
//                outputTwo = "\nYour Second number is an invalid input";
//            }
//            if(numberThree == 0){
//                outputThree = "\nYour Last number is an invalid input";
//            }
//            text = outputOne + outputTwo + outputThree;
        }

        double summized = numberOne + numberTwo + numberThree;

        String summizedTwoDecimals = String.format("%.2f", summized);

        showMessageDialog(null, text + " " + summized);

        showMessageDialog(null, text + " " + summizedTwoDecimals);
        System.out.println(text + " " + summizedTwoDecimals);
    }
}
