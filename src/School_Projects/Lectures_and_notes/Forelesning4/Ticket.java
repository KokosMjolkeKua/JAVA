package School_Projects.Lectures_and_notes.Forelesning4;
//atributter , mal på en billett om hva vi vil ha i malen.
//trenger ikke public static void main, fordi denne koden skal ikke utfører i den filen den er i
//public class Ticket {
   // String name;
   // String personNr;
   // String destination;

//}

//Ticket ticket1 = new Ticket();
//ticket1.name = "Trym";
//ticket1.personNr = "24545454542";
//ticket1.destination = "Svalbard";

//Hvis du ikke legger inn destinasjon eksempel, vil tvinge de som skal bruke koden bruker den riktig.
//for at det som skriver ikke skal være feil må vi sørge for at alt blir svart før det printes fysiskt
//eskempel flybilett at alle partene er svart.

//Konstruktør:
//istedenfor å skrive såånn:
public class Ticket {
    String name;
    String personNr;
    String destination;

    //skriver vi sånn istedenfor, for å gjøre det kortere.
    public Ticket(String name, String personNr, String destination) {
        this.name = name;
        this.personNr = personNr;
        this.destination = destination;

    }
}
//Ticket ticket1 = new Ticket(name:"Trym", personNr:"21212121221", destination:"Svaldbard");

//Må legge til alle variablene for at det skal funke, funker ikke nå men men

