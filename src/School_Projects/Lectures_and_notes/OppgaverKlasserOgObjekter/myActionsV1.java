package School_Projects.Lectures_and_notes.OppgaverKlasserOgObjekter;

import javax.swing.*;

import static javax.swing.JOptionPane.*;

public class myActionsV1 {
    public String metodeA;
    public String metodeB;
    public String metodeC;
    public String metodeD;

    public static void main(String[]args){
        myActionsV1 nyAction = new myActionsV1();
        Object[] options = {"Addere", "Subtrahere", "Multiplisere", "Dividere"};
        int choice = showOptionDialog(null, "Velg en metode: ", "Metode Velger: ", YES_NO_CANCEL_OPTION, QUESTION_MESSAGE, null, options, options[0]);

        switch (choice){
            case 0:
                nyAction.metodeA();
                break;
            case 1:
                nyAction.metodeB();
                break;
            case 2:
                nyAction.metodeC();
                break;
            case 3:
                nyAction.metodeD();
                break;

            case JOptionPane.CLOSED_OPTION:
                showMessageDialog(null,"Ingen metode valgt!");
                break;
        }

    }

    public void metodeA(){
        //this.metodeA = metodeA;
        showMessageDialog(null,"Addere har blitt valgt!");
    }
    public void metodeB(){
        //this.metodeB = metodeB;
        showMessageDialog(null,"Subtrahere har blitt valgt!");
    }
    public void metodeC(){
        //this.metodeC = metodeC;
        showMessageDialog(null,"Multiplisere har blitt valgt!");
    }
    public void metodeD(){
        //this.metodeD = metodeD;
        showMessageDialog(null,"Dividere har blitt valgt!");
        
    }

}

