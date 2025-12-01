package School_Projects.Exam_practice.Module_one;

import static javax.swing.JOptionPane.*;

public class Oblig_one {
    public static void main(String[]args){

        showMessageDialog(null, "Welcome to this world!");

        String nameInput = showInputDialog("What is your first name?");
        String lastNameInput = showInputDialog("What is your last name?");

        showMessageDialog(null, "Thank you " + nameInput + " " + lastNameInput + " for your cooperation!");

        String fullName = nameInput + " " + lastNameInput;

        showMessageDialog(null, "Think that i, " + fullName + " has allready finished the first obligatory assignment!");


    }
}
