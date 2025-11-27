package School_Projects.Lectures_and_notes.Aritmetikk;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;
public class Logiskeutrykk {
    public static void main(String[]args){
        //PÅminning om logiske utrykk
        //double tall1 = 2;
        //double tall2 = 3;
        //tall1 == tall2;  // tall1 er lik tall2
        //tall1 != tall2;  //tall1 er ikke lik tall2

        //tall1 < tall2;    //tall1 er mindre enn tall2
        //tall1 > tall2;    //tall1 er større enn tall2

        //tall1 <= tall2;   //tall1 er mindre eller lik tall2
        //tall1 >= tall2;   //tall1 er større eller lik tall2


        //tall1 == tall2 : false;
        //tall1 != tall2 : true;
        //tall1 < tall2  : true;
        //tall1 > tall2  : false;
        //tall1 <=tall2  : true;
        //tall1 >= tall2 : false;


        //BRUK AV LOGISKE UTRYKK
        String innStreng1 = showInputDialog("Skriv inn tall1");
        String innStreng2 = showInputDialog("Skriv inn tall2");
        int tall1 = Integer.parseInt(innStreng1);
        int tall2 = Integer.parseInt(innStreng2);
        if (tall1 == tall2){
            showMessageDialog(null, "Tall1 er lik tall2");
        }
        if (tall1 != tall2){
            showMessageDialog(null, "Tall1 er IKKE lik tall2"); }
        if (tall1 < tall2){
            showMessageDialog(null, "Tall1 er mindre enn tall2");
        }
        if (tall1 > tall2){
            showMessageDialog(null, "Tall1 er større enn tall2");
        }
        if (tall1 <= tall2){
            showMessageDialog(null, "Tall1 er mindre eller lik tall2");
        }
        if (tall1 >= tall2){
            showMessageDialog(null, "Tall1 er større eller lik tall2");
        }

    }
}
