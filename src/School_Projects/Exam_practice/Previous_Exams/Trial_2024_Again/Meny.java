package School_Projects.Exam_practice.Previous_Exams.Trial_2024_Again;

import static javax.swing.JOptionPane.*;

public class Meny {

    public static void presentMeny(){
        showMessageDialog(null, "Welcome to your choice.");
        showMessageDialog(null, "You have 3 choices in this program." +
                "\nFirst choice; receive Words of Wisdom." +
                "\nSecond choice; check today's Weather." +
                "\nThird to quit the program.");
        boolean yes = true;
        while(yes){
            String input = showInputDialog("Your Choices: " +
                    "\nType 'w' for Words of Wisdom.." +
                    "\nType 'e' for the Weather Report.." +
                    "\nType 'q' to Quit..");

            if(input.equalsIgnoreCase("w")){
                showMessageDialog(null, Meny.wordsOfWisdom());
                showMessageDialog(null, "Try again?");
            }
            if(input.equalsIgnoreCase("e")){
                showMessageDialog(null, Meny.todaysWeather());
                showMessageDialog(null, "Try again?");
            }
            if(input.equalsIgnoreCase("q")){
                showMessageDialog(null, Meny.exitProgram());
                yes = false;
            }
            if(!(input.equalsIgnoreCase("w")) &&
                    !(input.equalsIgnoreCase("e")) &&
                    !(input.equalsIgnoreCase("q"))){
                showMessageDialog(null, "This input is invalid" +
                        "\nPlease Try again!");
            }

        }

    }

    public static String wordsOfWisdom(){
        return "Do the difficult things while they are easy and do the great things while they are small.";
    }

    public static String todaysWeather(){
        return "Today's Weather: " +
                "\nToday in Oslo, expect a mix of cloudy skies " +
                "\nwith chances of morning/afternoon showers or " +
                "\nlight rain, temperatures around 3°C (37°F) feeling" +
                "\ncooler (around -1°C/30°F), with light winds and " +
                "\nhigh humidity, leading to a generally damp and " +
                "\novercast winter day with some potential for drizzle " +
                "\nlater, but clearing somewhat tonight";
    }

    public static String exitProgram(){
        return "Thank you for using the Program!" +
                "\nGoodbye for now!";
    }
}
