package School_Projects.Lectures_and_notes.KLasserOgObjekterOppgaver;

class Books{
    private String tittel;
    private String pris;
    private String forfatter;
    private String isbnNr;

    public void settInfo(String tittel, String pris, String forfatter, String isbnNr){
        this.tittel = tittel;
        this.pris = pris;
        this.forfatter = forfatter;
        this.isbnNr = isbnNr;
    }

    public void PrintnyBooks(){
        System.out.println("Bøker til salgs: \n");
        System.out.println("Tittel: " + this.tittel);
        System.out.println("Pris: " + this.pris);
        System.out.println("Forfatter: " + this.forfatter);
        System.out.println("ISBN Nummer: " + this.isbnNr);
    }


}
public class Oppgave1 {
    public static void main(String[]args){
        Books nyBok = new Books();
        //String Print = Books.PrintnyBok
        nyBok.settInfo("Hunger games", "299", "Ett eller annet", "12345678");
        //System.out.print(PrintnyBok);





    }
}
