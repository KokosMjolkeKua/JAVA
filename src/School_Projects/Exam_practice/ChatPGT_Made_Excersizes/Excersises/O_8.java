package School_Projects.Exam_practice.ChatPGT_Made_Excersizes.Excersises;

import static javax.swing.JOptionPane.*;

public class O_8 {
    public static void main(String[]args){

        String nrInput = showInputDialog("Skriv ett tall:");
        String nrInputTwo = showInputDialog("Skriv ett tall til:");

        int tall1;
        int tall2;
        int produktet;
        int modulus;

        try{
            tall1 = Integer.parseInt(nrInput);
            tall2 = Integer.parseInt(nrInputTwo);

            produktet = tall1/tall2;
            modulus = tall1%tall2;

            showMessageDialog(null, "Summen av " + tall1 + " og " + tall2 + " er " + produktet);
            showMessageDialog(null, "Resten er " + modulus);
        }
        catch (Exception e){
            tall1 = 0;
            tall2 = 0;
            showMessageDialog(null, "Skriv ett heltall!");
        }
    }
}
