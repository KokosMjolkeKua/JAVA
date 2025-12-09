package School_Projects.Exam_practice.Previous_Exams.Trial_Exam_24;

import static javax.swing.JOptionPane.*;

public class Main {
    public static void main(String[]args){

        showMessageDialog(null, "Good Morning!" +
                "\nWhat would you like to do today?");

        boolean yes = true;
        while (yes){
            Object[] options1 = {"Display Words of Wisdom",
                    "Today's Weather",
                    "Quit"};

            int result = showOptionDialog(null,"What Would you like to do Today?","Choose a Path:",
                    YES_NO_CANCEL_OPTION,PLAIN_MESSAGE,null,options1,null);

            if(result == YES_OPTION){
                DisplayWordsOfWisdom test = new DisplayWordsOfWisdom();
                System.out.println(test.displayWordsOfWisdom());
            }
            if(result == NO_OPTION){
                DisplayWeather today = new DisplayWeather();
                System.out.println(today.displayWeather());
            }
            if(result == CANCEL_OPTION){
                yes = false;
            }

        }



    }
}
