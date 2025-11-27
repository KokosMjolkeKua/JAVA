package School_Projects.Lectures_and_notes.OppgaverKlasserOgObjekter;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

class  Boker {
    public String tittel;
    public String pris;
    public String forfatter;
    public String iSBN;

    public void settBok() {
        this.tittel = tittel;
        this.pris = pris;
        this.forfatter = forfatter;
        this.iSBN = iSBN;

        tittel = showInputDialog("Hva er tittelen på boken?  ");
        pris = showInputDialog("Hva er prisen?");
        forfatter = showInputDialog("Hvem er forfatteren?");
        iSBN = showInputDialog("Hva er iSBN nummeret?");
    }

    public void printBok() {
        showMessageDialog(null,"\nBok-Informasjon" + "\nTittel: " + this.tittel + "." + "\nPris: " + this.pris + "kr." + "\nForfatter: " + this.forfatter + "." + "\niSBN-Nummeret: " + this.iSBN + ".");
    }


}
    public class  Oppgave2 {
    public static void main(String[]args){

        Boker nyBok = new Boker();
        nyBok.settBok();
        nyBok.printBok();

    }
}
