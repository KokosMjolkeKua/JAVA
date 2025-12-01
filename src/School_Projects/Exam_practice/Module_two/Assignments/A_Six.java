package School_Projects.Exam_practice.Module_two.Assignments;

import static javax.swing.JOptionPane.*;

public class A_Six {
    public static void main(String[]args){

        //BREAD CALCULATOR:

        String milk = showInputDialog("How many Dl milk do you have?");
        String flour = showInputDialog("How manu Dl flour do you have?");

        double flourDl = Double.parseDouble(flour);
        double milkDl = Double.parseDouble(milk);

        double doughDl = flourDl + milkDl;

        double doughDlPerBread = 2.5;

        double amountOfBread = doughDl / doughDlPerBread;
        double leftOverDough = doughDl % doughDlPerBread;

        String proffession = showInputDialog("What is your Proffession?");
        String lastName = showInputDialog("What is your last name?");

        String person = "\nPerson: " + proffession + " " + lastName;

        String leftOverDoughTwoDecimals = String.format("%.2f", leftOverDough);


        showMessageDialog(null, person +
                "\nHas " + doughDl + " Dl dough." +
                "\nThis will give you " + amountOfBread + " amount of Bread." +
                "\nAnd you have " + leftOverDoughTwoDecimals + " dough left over.");

        System.out.println(person +
                "\nHas " + doughDl + " Dl dough." +
                "\nThis will give you " + amountOfBread + " amount of Bread." +
                "\nAnd you have " + leftOverDough + " Dl of dough left over.");
    }
}
