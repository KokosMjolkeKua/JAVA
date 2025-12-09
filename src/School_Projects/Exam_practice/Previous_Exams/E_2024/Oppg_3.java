package School_Projects.Exam_practice.Previous_Exams.E_2024;

import java.util.ArrayList;
import static javax.swing.JOptionPane.*;

public class Oppg_3 {

    public void guessTheAnimal(ArrayList<String> animals){
        showMessageDialog(null, "Would you like to guess an animal?");
        String input;
        boolean guessAgain = true;

        while (guessAgain){
            input = showInputDialog("Type 'Guess' if you would like to guess" +
                    "\nType 'Give Up' if you wish to quit.");

            if(input.equals("Guess")){
                String tryGuess = showInputDialog("Write the animal you want to guess!");
                if(!animals.contains(tryGuess)){
                    showMessageDialog(null, "You loose!");
                }
                else{
                    showMessageDialog(null, "Congratulations, you found an animal!");
                }
            }
            if(input.equals("Give Up")){
                guessAgain = false;
            }
            else{
                showMessageDialog(null, "...");
            }
        }


    }
}
