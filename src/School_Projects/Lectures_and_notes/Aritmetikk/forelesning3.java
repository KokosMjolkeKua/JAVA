package School_Projects.Lectures_and_notes.Aritmetikk;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class forelesning3 {
    public static void main(String[] args){
        //Addisjonsoperatør
        String førsteSifferstreng, andreSifferstreng;
        int førstetall, andretall, sum;
        førsteSifferstreng = showInputDialog("Skriv inn første hele tall!");
        andreSifferstreng = showInputDialog("Skriv inn andre hele tall!");

        førstetall = Integer.parseInt(førsteSifferstreng);
        andretall = Integer.parseInt(andreSifferstreng);

        sum = førstetall + andretall;

        showMessageDialog(null, "Summer er: " + sum);


        double D1 = 13.7, D2 = 3.97;
        int n = 5;
        double S1 = D1 + D2;
        double S2 = S1 + n;
        String resultat = "Resultatet er " + S2;
        System.out.println(resultat);

        //Aritmetiske Operatører:
        // + addisjon
        // - subtraksjon
        // * multiplikasjon
        // / divisjon
        // % rest ved heltallsdivisjon
        //

        int tall2 = 13;
        int tall3 = 3;
        int sum3 = tall2 / tall3;
        int modulus = tall2 % tall3;
        System.out.println(sum3 + " " + modulus);

        //modulus = rest som er igjen når man deler heltall på hverandre (Int = Integer)
        int tall4 = 2;
        int tall5 = 4;
        int resultatTo = tall4*tall5-tall4+(tall4+tall5)/tall4;
        //Regnerekkefølge: starter fra venstre til høyre
        //regner paranteser først
        //så gange og dele
        //så legge sammen og trekke fra
        System.out.println(resultatTo);


        //KONVERTERING mellom TYPER (CASTING)
        int tall6 = 23;
        int tall7 = 3;
        double tall8 = (double) tall6;
        double tall9 = 23.6;
        int tall10 = (int) tall9;
        double divisjon4 = (double) tall6 / (double) tall7;
        double divisjon5 = tall6 / (double) tall7;
        System.out.println(divisjon4 + " " + divisjon5);

        //LIKHET, STØRRE, MINDRE:
        // likhet: ==
        // ikke lik: !=
        // større: >
        // mindre: <
        // større eller lik: >=
        // mindre eller lik: <=

        if (tall8 == tall9) {
            System.out.print("Tallene er like!");
        }
        if (tall8 != tall9) {
            System.out.println("Tallene er ikke like!");
        }
        if (tall8 > tall9) {
            System.out.println("Første tallet er større enn det andre!");
        }
        if (tall8 < tall9) {
            System.out.println("Første tallet er mindre enn det andre!");
        }
        if (tall8 >= tall9) {
            System.out.println("Første tallet er større eller likt det andre tallet!");
        }
        if (tall8 <= tall9) {
            System.out.println("Første tallet er mindre eller likt det andre tallet!");
        }

        // BOOLEAN er bare for true eller false






    }
}
