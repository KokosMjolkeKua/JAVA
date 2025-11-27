package School_Projects.Lectures_and_notes.PlenumKoder;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class plenum2 {
    public static void main(String[] args){
        int alderPer = 23;
        int alderLine, sumAlder;
        alderLine = 22;
        sumAlder = alderPer + alderLine;
        System.out.println("Summen av alderen til Per og Line er " + sumAlder);

        String innNavn = showInputDialog("Skriv inn Navnet ditt");
        String innAlder = showInputDialog("Skriv inn alderen din");
        int alder = Integer.parseInt(innAlder);
        int fødeår = 2025 - alder;
        showMessageDialog(null, innNavn + " er født " + fødeår);

        //Decimaltall
        String innStreng1 = showInputDialog("Skriv inn ett decimaltall:");
        String innStreng2;
        innStreng2 = showInputDialog("Skriv et decimaltall til:");

        double innTall1 = Double.parseDouble(innStreng1);
        double innTall2 = Double.parseDouble(innStreng2);
        double divisjon = innTall1 / innTall2;
        showMessageDialog(null, innTall1 + " delt på " + innTall2 + " blir " + divisjon);

        //Heltallsdivisjon
        String innStreng3 = showInputDialog("Skriv inn et heltall:");
        String innStreng4 = showInputDialog("Skriv inn et heltall til:");
        int innTall3 = Integer.parseInt(innStreng3);
        int innTall4 = Integer.parseInt(innStreng4);
        int divisjon2 = innTall3 / innTall4;
        showMessageDialog(null, innTall3 + " delt på " + innTall4 + " blir " + divisjon2);

        //hva skjer om vi setter 0 i nevneren, eller ikke ett heltall
        //for å ungå bruker vi try og catch
        double tall;
        String innStreng5 = showInputDialog("Skriv inn et tall: ");
        try{
            tall = Double.parseDouble(innStreng5);
        }
        catch (Exception e){
            tall = 0;

        }
        showMessageDialog(null, "Tallet er nå " + tall);

    }

}
