package School_Projects.Lectures_and_notes.OppgaverAritmetikk;

public class  oppg2 {
    public static void main(String[]args){
        int antall = 0;
        while (antall < 10) {
            antall += 2;
            System.out.println(antall);
        }
        //det er et kontrollflyt statement (boolean) en blokk som gjentar en kode så lenge en angitt betingelse er sann.
        //så her fordi antall er mindre enn 10 blir det bare printet til 10, hvis jeg hadde satt 20 ville det printet til 20
    }
}
