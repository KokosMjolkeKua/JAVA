package School_Projects.Lectures_and_notes.OppgaverKlasserOgObjekter;

class Bøker{
    public String tittel;
    public String pris;
    public String forfatter;
    public String iSBN;

    public void settBok(){
        System.out.println("Tittel:   " + tittel + ".");
        System.out.println("Pris: " + pris + ".");
        System.out.println("Forfatter: " + forfatter + ".");
        System.out.println("iSBN-Nummer: " + iSBN + ".");
    }
}

public class  Oppgave1 {
    public static void main(String[]args){
        Bøker nyBok = new Bøker();
        nyBok.tittel = "Hunger Games";
        nyBok.pris = "299kr";
        nyBok.forfatter = "IDk";
        nyBok.iSBN = "765348653";

        nyBok.settBok();
    }
}
