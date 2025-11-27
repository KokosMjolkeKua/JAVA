package School_Projects.Lectures_and_notes.OppgaverTilDatatyperogBrukerInput;
//import static javax.swing.JOptionpane.*;
public class  Oppgave4 {
    public static void main(String[]args) {

       int tall1, tall2, sum;
       tall1 = 1;
       tall2 = 5;
       sum = tall1 / tall2;
       System.out.println(sum);

        //med int når man deler på to tall er det ingen decimaler fordi det er bare heltall
        //derfor vil tallet bare være hvor mange ganger det andre tallet går opp i det andre

        //hvis det første tallet er størst vil resultatet være hvor mange ganger det andre går opp i det første
        // og hvis det første tallet er mindre vil resultatet være 0

        byte b1 = 5, b2 = 30;
        byte sumByte = (byte) (b1 / b2);
        System.out.println(sumByte);

        //det er samme resultat med byte som med int fordi begge er heltall

        long L1 = 456, L2 = 123;
        long sumLong = L1 / L2;
        System.out.println(sumLong);
        //det er samme resultat med long som med int fordi begge er heltall

        short S1 = 10, S2 = 20;
        short sumShort = (short) (S1 / S2);
        System.out.println(sumShort);
        //det er samme resultat med short som med int fordi begge er heltall

        double D1 = 5.0, D2 = 3.0;
        double sumDouble = D1 / D2;
        System.out.println(sumDouble);
        //med double får vi decimaler fordi det er et desimaltall, derfor blir
        //double har 16 desimaler etter komma

        float F1 = 5.0f, F2 = 3.0f;
        float sumFloat = F1 / F2;
        System.out.println(sumFloat);
        //med float får vi decimaler fordi det er et desimaltall. men float har mindre presisjon enn double
        // men også mindre desimaler
        // float har 7 desimaler etter komma

        char C1 = 'A', C2 = 'B';
        int sumChar = C1 / C2;
        System.out.println(sumChar);
        //char er egentlig et tall, derfor blir det samme som int
        //En char-variabel er en datatype innen programmering som er designet for å lagre ett enkelt tegn
        // , som en bokstav, et tall eller et symbol, innenfor et avgrenset område


    }
}
