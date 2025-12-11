package School_Projects.Exam_practice.Previous_Exams.Exam_2024_newTry;

import java.util.ArrayList;
import static javax.swing.JOptionPane.*;
//I use this import mechanism so i dont have to worry about which JOptionPane import i have to use

public class O_3 {

    public void guessTheAnimal(ArrayList<String> animals){
        showMessageDialog(null, "Guess The Animal");

        boolean yes = true;
        while(yes){
            String input = showInputDialog("Type 'y' to guess an Animal!" +
                    "\nType 'q' to stop guessing!");

            if(input.equalsIgnoreCase("y")){
                String guess = showInputDialog("Guess the animal!");

                int i = 0;
                for(String s: animals){
                    if(guess.equalsIgnoreCase(s)){
                        showMessageDialog(null, "Congratulations!!" +
                                "\n" + s + " is CORRECT!");
                        showMessageDialog(null, "Try again?");
                        i = 1;
                    }
                }
                if(i == 0){
                    showMessageDialog(null, "I am Sorry.. " + "\nThat is not CORRECT");
                    showMessageDialog(null, "Try again?");
                }
            }
            if(input.equalsIgnoreCase("q")){
                showMessageDialog(null, "Goodbye!");
                yes = false;
            }
        }
    }


}
