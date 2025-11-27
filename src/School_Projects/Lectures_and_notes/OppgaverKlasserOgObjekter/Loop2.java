package School_Projects.Lectures_and_notes.OppgaverKlasserOgObjekter;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;
public class Loop2 {
     public static void main(String[] args) {
         boolean continueProgram = true;

         while (continueProgram) {
             showMessageDialog(null, "This is a part of the program that will loop.");

             String input = showInputDialog(null, "Do you want to run it again? (yes/no)");

             if (input == null) {
                    // User pressed "Cancel" or closed the dialog
                    continueProgram = false;
             } else if (input.equalsIgnoreCase("no")) {
                    continueProgram = false;
             } else if (!input.equalsIgnoreCase("yes")) {
                    showMessageDialog(null, "Invalid input. Please enter 'yes' or 'no'.");
             }
            }

            showMessageDialog(null, "Program finished.");

    }

}
