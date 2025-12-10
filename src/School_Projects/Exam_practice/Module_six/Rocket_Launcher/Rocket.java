package School_Projects.Exam_practice.Module_six.Rocket_Launcher;

import static javax.swing.JOptionPane.*;

public class Rocket {
    private String rocketName;
    private int countDownFrom;

    public Rocket(String rocket){
        this.rocketName = rocket;
    }

    public void countDownClock(){
        String input = showInputDialog("Write the number you wish to count down from:");
        int countdownFrom;
        try{
            countdownFrom = Integer.parseInt(input);
            this.countDownFrom = countdownFrom;
        }
        catch(Exception e){
            countdownFrom = 0;
            showMessageDialog(null, "Write a whole number.");
        }
    }

    public void countDown(){
        int i = countDownFrom;
        while(i >= 0){
            System.out.println(i);
            i--;

            if(i < 0){
                System.out.println("LAUNCH!");
            }
        }
    }
}
