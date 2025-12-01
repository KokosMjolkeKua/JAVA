package School_Projects.Exam_practice.Module_two.Assignments;

import static javax.swing.JOptionPane.*;

public class A_Eight {
    public static void main(String[]args){

//        Lag ett program som regner ut hvor mange dager du har levd basert
//        på hvor gammel du er (i år).
//        Vurder hvilke datatype som gir mest mening å bruke her.

        showMessageDialog(null, "Welcome to your life calculator!");
        String ageInput = showInputDialog("What is your age this year?");

        int age;
        int days = 0;
        String text = "Invalid Input";


        try{
            age = Integer.parseInt(ageInput);
            days = age * 365;
            text = "When you turn " + age + "." +
                    "\nYou will have lived for " + days + " days";
        }
        catch (Exception e){
            age = 0;
        }


        showMessageDialog(null, text);
        System.out.println(text);
    }
}
