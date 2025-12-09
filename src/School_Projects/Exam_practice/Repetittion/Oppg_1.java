package School_Projects.Exam_practice.Repetittion;

import static javax.swing.JOptionPane.*;

public class Oppg_1 {
    public static void main(String[]args){
        showMessageDialog(null, "NUMBER INPUTS");

        String inputOne;
        String inputTwo;
        double numberOne;
        double numberTwo;

        boolean yes = true;

        while(yes){
            String loop = showInputDialog(null, "Type 'y' to continue." + "\nType 'q' to quit");

            if(loop.contains("y")){
                inputOne = showInputDialog("Write your first number: ");
                inputTwo = showInputDialog("Write your second number: ");

                try{
                    numberOne = Double.parseDouble(inputOne);
                    numberTwo = Double.parseDouble(inputTwo);

                    double sum = numberOne + numberTwo;
                    showMessageDialog(null, "Summen av " + numberOne + " og " + numberTwo + " er " + sum);

                    double produkt = numberOne * numberTwo;
                    String produktTwoDec = String.format("%.2f", produkt);
                    showMessageDialog(null, "Produktet av " + numberOne + " og " + numberTwo + " er " + produktTwoDec);

                    double diff = numberOne / numberTwo;
                    String diffTwoDec = String.format("%.2f", diff);
                    showMessageDialog(null, "Differansen av "+ numberOne + " og " + numberTwo + " er " + diffTwoDec);

                }
                catch(Exception e){
                    numberOne = 0;
                    numberTwo = 0;
                    showMessageDialog(null, "You have to write number.");
                    yes = false;
                }
            }

            else if(loop.contains("q")){
                yes = false;
            }

            else{
                showMessageDialog(null, "Try again.");
            }
        }
    }
}
