package School_Projects.Exam_practice.Previous_Exams.Trial_2024_Again;

public class Main {
    public static void main(String[]args){

        //Oppgave 1:
        String[] O_1 = {"defr", "banana", "hi", "bye", "tomato","", "hi", "beer", "bear", null, null};
        Investigate oppg1 = new Investigate();
        oppg1.investigateStringArray(O_1);

        //Oppgave 2:
        Meny.presentMeny();

        //Oppgave 3;
        char[] chars = {'A', 'B', 'C', 'D'};
        Char.directionChar(chars);

        //Oppgave 4:
        // Create a SmartLight
        Smart.SmartLight light = new Smart.SmartLight(70, true);
        // Create a SmartLamp with a light installed
        Smart.SmartLamp lamp = new Smart.SmartLamp(light, true);
        // Adjust brightness via SmartLamp
        lamp.setLightBrightness(90);
        System.out.println(lamp);
        // Create a SmartLamp WITHOUT a SmartLight
        Smart.SmartLamp emptyLamp = new Smart.SmartLamp(true);
        emptyLamp.setLightBrightness(50); // should warn that no light is installed

        //Oppgave 5;


    }
}
