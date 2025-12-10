package School_Projects.Exam_practice.ChatPGT_Made_Excersizes.Excersises;

import static javax.swing.JOptionPane.*;

public class O_1 {
    public static void main(String[]args){
        showMessageDialog(null, "Good Morning.");
        String name = showInputDialog("What is your name?");
        int age = Integer.parseInt(showInputDialog("What is your age?"));

        showMessageDialog(null, "Hei, my name is " + name + " and i am " + age + " years of age!");

        if(age >= 18){
            showMessageDialog(null, "I am an adult");
        }
        else{
            showMessageDialog(null, "I am a child");
        }

        for (int i = 1; i <= 10; i++) {
            System.out.print(i + ", ");
        }
    }
}
