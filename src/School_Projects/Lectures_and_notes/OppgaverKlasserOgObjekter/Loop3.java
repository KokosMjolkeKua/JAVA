package School_Projects.Lectures_and_notes.OppgaverKlasserOgObjekter;

import javax.swing.*;
public class Loop3 {
        public static void main(String[] args) {
            boolean continueProgram = true;

            while (continueProgram) {
                // ---- Start of the program logic ----
                JOptionPane.showMessageDialog(null, "Welcome! This is the start of the program.");

                // Example of program logic
                String name = JOptionPane.showInputDialog(null, "What's your name?");
                if (name == null) break; // User clicked "Cancel"

                JOptionPane.showMessageDialog(null, "Hello, " + name + "!");

                // ---- End of the program logic ----

                // Ask the user if they want to run the program again
                String input = JOptionPane.showInputDialog(null, "Do you want to run the program again? (yes/no)");

                if (input == null || input.equalsIgnoreCase("no")) {
                    continueProgram = false;
                } else if (!input.equalsIgnoreCase("yes")) {
                    JOptionPane.showMessageDialog(null, "Invalid input. Program will now exit.");
                    continueProgram = false;
                }
                // if input is "yes", it will loop again automatically
            }

            JOptionPane.showMessageDialog(null, "Program finished.");
        }
    }


