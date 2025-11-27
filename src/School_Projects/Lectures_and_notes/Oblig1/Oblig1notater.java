package School_Projects.Lectures_and_notes.Oblig1;

import static javax.swing.JOptionPane.showInputDialog;

//import static brukes for å vise Input dialog
// og * brukes for alle, så istedenfor å skrive
// ( JOptionPane.showInputDialog( "Hva heter du?" );)
// så kan du skrive bare showInputDialog("Hva heter du?" );

public class Oblig1notater {
    public static void main(String[] args) {
        String forNavn;
        // kan skrives på to måter
        forNavn = showInputDialog("Hva er fornavnet ditt?");
        //String fornavn = showInputDialog("Hva er fornavnet ditt?");
        String etterNavn = showInputDialog("Hva er etternavnet ditt?");



        //  String navn; deklarerer variabel som skal brukes til lagring
        //  navn = JOptionPane.showInputDialog( "Hva heter du?" );
        //  leser inn og lagrer det som er skrevet
        //da kan skrive hva jeg vil


        String fulltNavn = forNavn + " " + etterNavn;

        // String er datatypen for tekst
        //bruk disse for å skrive ting uten at det påvirker noe tehhee

        System.out.println("Tenk at jeg " + fulltNavn + ", har naila Oblig1 allerede!");
        //showMessageDialog(null,"Tenk at jeg " + fulltNavn + /n + "har allerede fullført Oblig1!");

        // husk å legge til showmessagedialog fordi hvis du ikke gjør det vil ikke
        // "appen" komme oppc

    }
}
