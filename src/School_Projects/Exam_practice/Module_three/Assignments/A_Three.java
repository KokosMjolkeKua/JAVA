package School_Projects.Exam_practice.Module_three.Assignments;

import static javax.swing.JOptionPane.*;

public class A_Three {
    public static void main(String[]args){

        showMessageDialog(null, "Rectangle Calculator:");

        String lengthInput = showInputDialog("What is the length of the rectangle?");
        String widthInput = showInputDialog("What is the width of the rectangle?");

        String text = "Invalid Input";

        double length;
        double width;
        double areal;

        try{
            length = Double.parseDouble(lengthInput);
            width = Double.parseDouble(widthInput);

            if ((length < 0) || (width < 0)){
                text = "These numbers are not valid." +
                "\nThey must be higher than 0.";
            }
            else{
                areal = length * width;
                text = "A rectangle with a length of " + length + " cm, " +
                        "\n and a width of " + width + " cm." +
                        "\n Has an Areal of " + areal + " cm^2.";
            }
        }
        catch (Exception e){
            length = 0;
            width = 0;
        }

        showMessageDialog(null, text);
    }
}
