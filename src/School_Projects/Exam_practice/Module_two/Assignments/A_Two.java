package School_Projects.Exam_practice.Module_two.Assignments;

import static javax.swing.JOptionPane.*;

public class A_Two {
    public static void main(String[]args){
        showMessageDialog(null, "God dag i luken!");
        String fornavn = showInputDialog("Skriv inn fornavnet ditt:");
        String etternavn = showInputDialog("Skriv inn etternavnet ditt:");
        String alderInput = showInputDialog("Skriv inn din alder:");

        String fulltNavn = fornavn + " " + etternavn;

        int age;
        String text = "Invalid Input";

        try{
            age = Integer.parseInt(alderInput);
            text = "God dag i skuffen " + fulltNavn +
                    "\nAlder: " + age +
                    "\nHåper du får en fin dag";
        }
        catch(Exception e){
            age = 0;
            text = "Write a number " + fulltNavn + " please!";
        }

        showMessageDialog(null, text);
    }
}
