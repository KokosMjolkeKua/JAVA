package School_Projects.Lectures_and_notes.Forelesning2;

public class extranotaterombrød {
    public static void main(String[] args){
        // { betyr tilhørlighet av seksjonen

        double melDl;
        melDl = 2.0;

        double melkDl = 1.0;

        // double melDl, melkDl; (kan også deklarere flere variabler på en linje)
        // melDl = 2.0; melkDl = 1.0;

        // double melDl = 2.0, melkDl = 1.0; (kan også deklarere og initialisere på en linje)

        double deigDl = melDl + melkDl;

        double deigDlperBrod = 2.5;

        double antallBrod = deigDl/ deigDlperBrod;

        String bakerNavn = "Baker Hansen";

        System.out.println(bakerNavn + " kan lage " + antallBrod + " Brød.");
        // system.out.println("Du kan lage" + " " + antallBrod + " " + "Brød.");



        // System.out.println(deigDl);

    }
}
