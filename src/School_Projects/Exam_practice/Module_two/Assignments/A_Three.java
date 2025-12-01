package School_Projects.Exam_practice.Module_two.Assignments;

import static javax.swing.JOptionPane.*;

public class A_Three {
    public static void main(String[]args){
        showMessageDialog(null, "God dag suppehue!");

        String fornavn = showInputDialog("Hva er ditt fornavn?");
        String etternavn = showInputDialog("Hva er ditt etternavn?");
        String fulltNavn = fornavn + " " + etternavn;

        String alderInput = showInputDialog("What is your age?");
        int alder;

        String by = showInputDialog("Hva heter byen du bor i?");
        String postNr = showInputDialog("Hva er ditt post-Number");
        String adresse = showInputDialog("Hva er din adresse?");

        String text = "Invalid Input";

        String alderText;

        try {
            alder = Integer.parseInt(alderInput);
            text = "\nNavn: " + fulltNavn +
                    "\nAlder: " + alder +
                    "\nAdresse: " + adresse +
                    "\nBy: " + by + " " + postNr;
        }
        catch(Exception e){
            alder = 0;
            text = "Du må skrive ett helt tall for å få en valid input...";
        }

        if(alder == 0){
            alderText = "  Invalid Age..  ";
        }
        else{
            alderText = " ";
        }

        showMessageDialog(null, text + alderText);
        System.out.println(text + alderText);
    }
}
