package School_Projects.Exam_practice.Module_seven.Assignments;

import static javax.swing.JOptionPane.*;

public class Oppg_8 {
    public static void main(String[]args){
//        Det skal lages et program som beregner gjennomsnittlig poengsummer for et antall elever - poengene er
//    mellom 0 og 100.
//
//        Lag et program som først leser inn hvor mange poengsummer som skal leses inn. Så skal det opprettes et
//    heltalls-array med riktig lengde (fra input). Deretter skal det leses inn poengsummer via en løkke samtidig
//        som arrayet fylles. Tilslutt skal det via en løkke beregnes gjennomsnittlig poengsum også vise dette
//        på skjermen. (Det er mulig å løse denne oppgaven enklere uten å bruke array, men oppgaven trener på
//        bruk av arrays).
//
//        Bruk gjerne try/catch ved parsing av input og spør igjen om tall dersom det ikke er oppgitt riktig.

        int[] examPoints = new int[6];

        boolean yes = true;
        int input = 0;
        showMessageDialog(null, "Hello!" + "\nDo you wish to add your score from the exam?");

        for (int i = 0; i < examPoints.length; i++) {
            while(yes){
                String quit = showInputDialog("Type 'Yes' if you wish to continue" + "\nType 'q' if you wish to quit");
                if(quit.contains("Yes")){
                    String textInput = showInputDialog("Write your score please: " + "\nBetween 1 and 100");
                    try{
                        input = Integer.parseInt(textInput);
                        if(input < 0 || input > 100){
                            showMessageDialog(null, "The number has to be between 1 and 100..");
                            yes = false;
                        }
                        else{
                            examPoints[i] = input;
                            if(examPoints[i] == examPoints[5]){
                                yes = false;
                            }
                        }

                    }
                    catch (Exception e){
                        input = 0;
                        showMessageDialog(null,"Invalid input.." + "\nOnly input whole numbers.");
                        yes = false;
                    }
                }
                if(quit.contains("q")){
                    showMessageDialog(null, "Goodbye!");
                    yes = false;
                }
                else{
                    showMessageDialog(null, "Add more");
                }
            }
            showMessageDialog(null, "Array: " + examPoints[i]);
        }
    }
}
