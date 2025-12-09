package School_Projects.Exam_practice.Previous_Exams.Trial_Exam_24.Oppg_2.Two;

import static javax.swing.JOptionPane.*;

public class Main_two {
    public static void main(String[]args){
        showMessageDialog(null, "Welcome!" + "\nWhat would you like to do today?");

        boolean yes = true;
        while(yes){
            showMessageDialog(null, "You have 3 options: " +
                    "\nWords Of Wisdom" + "\nTodays Weather" + "\nTo Quit This Program.");
            String input = showInputDialog("\nType 'w' for Words of Wisdom" +
                    "\nType 'e' for Todays Weather" + "\nType 'q' to quit");

            if(input.equals("w")){
                Display_Two hello = new Display_Two();
                showMessageDialog(null, hello.wordsOfWisdom());
                System.out.println(hello.wordsOfWisdom());
            }
            if(input.equals("e")){
                Display_Two hello = new Display_Two();
                showMessageDialog(null,hello.displayWeather());
                System.out.println(hello.displayWeather());
            }
            if(input.equals("q")){
                showMessageDialog(null, "Goodbye");
                yes = false;
            }
        }
    }
}
