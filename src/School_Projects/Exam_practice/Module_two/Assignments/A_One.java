package School_Projects.Exam_practice.Module_two.Assignments;

import static javax.swing.JOptionPane.*;

public class A_One {
    public static void main(String[]args){

        showMessageDialog(null, "God dag i luken!");
        String fornavn = showInputDialog("Skriv inn fornavnet ditt");
        String etternavn = showInputDialog("Skriv inn etternavnet ditt");

        String fulltNavn = fornavn + " " + etternavn;

        showMessageDialog(null, "God dag i skuffen " + fulltNavn + "\nHåper du får en fin dag");
    }
}
