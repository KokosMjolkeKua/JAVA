package School_Projects.Lectures_and_notes.OppgaverForelesning1og2;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;
public class  oppgave9 {
    public static void main(String[]args){
        showMessageDialog(null, "Velkommen til desimaltallsregning!");
        //String tall1 = showInputDialog("Skriv inn et desimaltall:");
        //String tall2 = showInputDialog("Skriv inn et desimaltall til:");
        //String tall3 = showInputDialog("Skriv inn et siste desimaltall:");
        //double tall4 = Double.parseDouble(tall1);
        //double tall5 = Double.parseDouble(tall2);
        //double tall6 = Double.parseDouble(tall3);

       // double sum = tall4 + tall5 + tall6;
       // System.out.println("Summen av tallene er: " + sum);
       // double gjenomsnitt = sum / 3;
        //System.out.println("Gjenomsnittet av tallene er: " + gjenomsnitt);
       // showMessageDialog(null, "Summen av tallene er: " + sum + "\n" + "Gjennomsnittet av tallene er: " + gjenomsnitt);
        double tall4, tall5, tall6;

        try {
            tall4 = Double.parseDouble(showInputDialog("Skriv inn et heltall:"));
            tall5 = Double.parseDouble(showInputDialog("Skriv inn et heltall til:"));
            tall6 = Double.parseDouble(showInputDialog("Skriv inn et siste heltall:"));
            Double sumHeltall = tall4 + tall5 + tall6;
            System.out.println("Summen av tallene er: " + sumHeltall);
            double gjenomsnittHeltall = sumHeltall / 3.0;
            System.out.println("Gjenomsnittet av tallene er: " + gjenomsnittHeltall);
            showMessageDialog(null, "Summen av tallene er: " + sumHeltall + "\n" + "Gjennomsnittet av tallene er: " + gjenomsnittHeltall);

        } catch (Exception e){
            tall4 = 0;
            tall5 = 0;
            tall6 = 0;
            showMessageDialog(null, "Du må skrive inn et heltall!");
            System.out.println("Du må skrive inn et heltall!");
        }


    }
}
