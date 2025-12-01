package School_Projects.Exam_practice.Module_three.Assignments;

import static javax.swing.JOptionPane.*;

public class A_Five {
    public static void main(String[]args){

        double farenheit = Double.parseDouble(showInputDialog("How many degrees farenheit is the temparature at the moment?"));
        double celsius = (farenheit - 32) / 1.8;

        String celsiusTwoDec = String.format("%.2f", celsius);

        showMessageDialog(null,"Farenheit " + farenheit + " degrees, is " + celsiusTwoDec + " celsius..");

    }
}
