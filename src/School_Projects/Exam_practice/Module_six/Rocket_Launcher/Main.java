package School_Projects.Exam_practice.Module_six.Rocket_Launcher;

import static javax.swing.JOptionPane.*;

public class Main {
    public static void main(String[]args){
        Rocket lucy = new Rocket("Lucy");

        boolean yes = true;
        showMessageDialog(null, "Would you like to shoot up a rocket?");

        int rocketAmount = 0;
        while (yes) {
            String input = showInputDialog("Type 'y' to shoot up a rocket." +
                    "\nType 'q' to quit the program.");
            if(input.contains("y")){
                lucy.countDownClock();
                lucy.countDown();
                showMessageDialog(null, "Try again?");
                rocketAmount++;
            }
            if(input.contains("q")){
                showMessageDialog(null, "Goodbye!");
                yes = false;
            }
        }
        showMessageDialog(null, "You shot up " + rocketAmount + " rockets!");

    }
}
