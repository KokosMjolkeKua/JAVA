package School_Projects.Lectures_and_notes.DEMO_Classes.Exam_Walkthrough.Oppg_2;

public class Investigate_Two {
    static String name;
    String nameTest;

    public void checkNumber(String teller, String nevner){
        int tellerInput;
        int nevnerInput;
        double sum = 0;
        String text = "Invalid Input";
        try{
            tellerInput = Integer.parseInt(teller);
            nevnerInput = Integer.parseInt(nevner);
            sum = (double) tellerInput / nevnerInput;

            if (sum < 0){
                text = "-1";
            }
            else{
                text = "Summen er: " + sum;
            }
        }
        catch(Exception e){
            tellerInput = 0;
            nevnerInput = 0;
            text = "-1";
        }
        System.out.println(text);    }



    public double divideBy(String teller, String nevner){
        double result;

        try{
            int tellerTall = Integer.parseInt(teller);
            int nevnerTall = Integer.parseInt(nevner);

            if(tellerTall < 0 || nevnerTall < 0){
                return -1.0;
            }

            result = (double) tellerTall / nevnerTall;

        }
        catch (NumberFormatException e){
            return -1.0;
        }

        return result;
    }
}
