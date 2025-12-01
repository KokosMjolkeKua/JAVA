package School_Projects.Exam_practice.Module_two.Assignments;

import static javax.swing.JOptionPane.*;

public class A_Seven {
    public static void main(String[]args){

//        En av kinoene i Oslo vil ha ett nytt kasse system som regner ut hvor mye en kunde
//        må betale basert på hvor mange voksen billetter og hvor mange barnebilletter de
//        ønsker å kjøpe. Lag ett program som spør om antall billetter av hver type og printer
//        ut totalsummen i kroner. Annta at en voksen billett koster 150 kr og en barnebillett
//        har en 10 % rabbatt i forhold til voksenbilletten.

        showMessageDialog(null, "Welcome to the Cinema!");

        String adultTicket = showInputDialog("How many adult tickets do you need?");
        String childTicket = showInputDialog("How many child tickets do you need?");

        int adultPrice = 150;
        double childPrice = 150 - (150 * 0.1);

        int adult = 0;
        double child = 0;

        String text = "Invalid Input";

        double total = 0;

        try{
            adult = adultPrice * Integer.parseInt(adultTicket);
            child = childPrice * Integer.parseInt(childTicket);

            total = adult + child;
            String totalTwoDec = String.format("%.2f", total);

            text = "Ticket-Price: " +
                    "\nNumber of Adults: " + adultTicket +
                    "\nNumber of Children: " + childTicket +
                    "\nTotal Price: " + totalTwoDec;
        }
        catch (Exception e){
            adult = 0;
            child = 0;
        }

        showMessageDialog(null, text);
        System.out.println(text);

    }
}
