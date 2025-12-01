package School_Projects.Exam_practice.Module_three;

import static javax.swing.JOptionPane.*;

public class Is_it_the_same {
    public static void main(String[]args){

        showMessageDialog(null, "Are These Numbers the Same??");

        String inputNumberOne = showInputDialog("Write in a number between 1-100: ");
        String inputNumberTwo = showInputDialog("Write a second number between 1 and 100!");

        double nr1;
        double nr2;

        try{
            nr1 = Double.parseDouble(inputNumberOne);
            nr2 = Double.parseDouble(inputNumberTwo);

            if (nr1 == nr2){
                showMessageDialog(null, "\n" + nr1 + " and " + nr2 + " is the same value");
            }
            if (nr1 > nr2){
                showMessageDialog(null,"\n" + nr1 + " is a larger value than " + nr2 + ".");
            }
            if (nr1 < nr2){
                showMessageDialog(null,"\n" + nr1 + " is a lower value than " + nr2 + ".");
            }
            if (nr1 != nr2){
                showMessageDialog(null,"\n" + nr1 + " and " + nr2 + " are different values.");
            }
            if (nr1 >= nr2){
                showMessageDialog(null, "\n" + nr1 + " is higher or the same value as " + nr2 + ".");
            }
            if (nr1 <= nr2){
                showMessageDialog(null, "\n" + nr1 + " is a lower or the same value as " + nr2 + ".");
            }
        }
        catch (Exception e){
            nr1 = 0;
            nr2 = 0;
        }
    }
}
