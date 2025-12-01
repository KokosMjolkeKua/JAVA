package School_Projects.Exam_practice.Module_three.Assignments;

import static javax.swing.JOptionPane.*;

public class A_Four {
    public static void main(String[]args){

        showMessageDialog(null, "Radius Calculator:");

        String radiusInput = showInputDialog("What is the radius of the circle?");

        double radius;
        double around;
        String aroundTwoDecimals;
        String text = "Invalid Input";

        try{
            radius = Double.parseDouble(radiusInput);
            around = 2 * 3.14 * radius;
            aroundTwoDecimals = String.format("%.2f", around);

            text = "A circle with the radius of " + radius + " cm." +
                    "\nHas an around of " + aroundTwoDecimals + " cm.";
        }
        catch(Exception e){
            radius = 0;
        }

        showMessageDialog(null, text);
    }
}
