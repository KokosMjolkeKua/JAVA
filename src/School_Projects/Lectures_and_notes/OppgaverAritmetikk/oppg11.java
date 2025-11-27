package School_Projects.Lectures_and_notes.OppgaverAritmetikk;
import java.util.Scanner;
public class oppg11 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

                // Les inn et tall fra brukeren
        System.out.print("Skriv inn et tall mellom 0 og 1000: ");
        int tall = scanner.nextInt();

                // Sjekk at tallet er innenfor gyldig område
        if (tall < 0 || tall > 1000) {
            System.out.println("Tallet må være mellom 0 og 1000.");
        } else {
            int originaltTall = tall;
            int tverrsum = 0;
            // Beregn tverrsummen
            while (tall > 0) {
                tverrsum += tall % 10;  // Legg til siste siffer
                tall = tall / 10;       // Fjern siste siffer
                    }

                    // Skriv ut resultatet
                    System.out.println("Tverrsummen av " + originaltTall + " er " + tverrsum);
                }

                scanner.close();

    }
}
