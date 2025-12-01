package School_Projects.Exam_practice.Module_two.Assignments;

import static javax.swing.JOptionPane.*;

public class A_Four {
    public static void main(String[]args){
        showMessageDialog(null, "GoodMorning... Potato head...");

        String inputAge = showInputDialog("What is your age?");
        int age;

        String text = "Invalid input modda";

        try{
            age = Integer.parseInt(inputAge);
            text = "Hello User.." +
                    "\nYour age is " + age + "." +
                    "\nAccording to your input..";
        }
        catch (Exception e){
            age = 0;
        }

        showMessageDialog(null, text);
    }
}
