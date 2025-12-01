package School_Projects.Exam_practice.Module_three.Assignments;

import static javax.swing.JOptionPane.*;

public class A_One {
    public static void main(String[]args){

        showMessageDialog(null, "Good Day to you..:");

        String name = showInputDialog("What is your name?");
        String ageInput = showInputDialog("What is your age?");

        int age;
        int year;
        int pension;
        String text = "Invalid Input.";

        try{
            age = Integer.parseInt(ageInput);

            if (age < 67){
                year = 2025 - age;
                pension = year + 67;

                text = "\n" + name + " is today " + age + " years old." +
                        "\nBorn in " + year + "." +
                        "\nIn " + pension + " " + name + " will be 67 years old, and start their pension";
            }
            if (age >= 67){
                year = 2025 - age;
                pension = year + 67;

                text = "\n" + name + " is today " + age + " years old." +
                        "\nBorn in " + year + "." +
                        "\nAnd " + name + " started their pension in " + pension + ".";
            }
        }
        catch (Exception e){
            age = 0;
            text = "You need to write a whole number.";
        }
        showMessageDialog(null, text);
    }
}
