package School_Projects.Exam_practice.ChatPGT_Made_Excersizes.More_Excersises;

import static javax.swing.JOptionPane.*;

public class Oppg_1_2_3 {
    public static void main(String[]args){

        showMessageDialog(null, "Welcome to Us");
        String name = showInputDialog("Write your name:");
        String ageInput = showInputDialog("Write your age: ");

        int age;
        try{
            age = Integer.parseInt(ageInput);

            showMessageDialog(null, "Hi, my name is " + name + " and i am " + age + " years of age!");
        }
        catch(Exception e){
            age = 0;
            showMessageDialog(null, "You need to write a whole number!");
        }


        showMessageDialog(null, "Now i wish for you to write any number!");
        String numberInput = showInputDialog("Write the desired number");
        double number;
        try{
            number = Double.parseDouble(numberInput);

            if(number < 0){
                showMessageDialog(null, "The number " + number +" is Negative!");
            }
            if(number > 0){
                showMessageDialog(null, "The number " + number +" is Positive!");
            }
            if(number == 0){
                showMessageDialog(null, "The number " + number +" is Exactly zero");
            }
        }
        catch(Exception e){
            number = 0;
            showMessageDialog(null, "It has to be a number, not text..");
        }


        showMessageDialog(null, "We are now moving on to a point system.");
        boolean yes = true;
        while(yes){
            String yesOrNo = showInputDialog("Type 'yes' to continue." + "\nType 'no' to quit the program.");

            if(yesOrNo.contains("yes")){
                String inputNr = showInputDialog("Write your score!" + "\nBetween 1-100");
                int input;
                try{
                    input = Integer.parseInt(inputNr);

                    if(input < 0 || input > 100){
                        showMessageDialog(null, "It has to be a number between 1-100..");
                        showMessageDialog(null, "Try again?");

                    }
                    if(input <= 50){
                        showMessageDialog(null, "You failed the test...");
                        showMessageDialog(null, "Try again?");

                    }
                    if(input >= 50){
                        showMessageDialog(null, "You passed the test!");
                        showMessageDialog(null, "Try again?");

                    }
                }
                catch(Exception e){
                    input = 0;
                    showMessageDialog(null, "You need to write a whole number..");
                    showMessageDialog(null, "Try again?");
                }
            }
            if(yesOrNo.contains("no")){
                showMessageDialog(null, "Goodbye");
                yes = false;
            }
        }

    }
}
