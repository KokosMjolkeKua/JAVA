package School_Projects.Lectures_and_notes.Forelesning4;

public class TicketV1 {
    String name;
    String personNr;
    String destination;

    public TicketV1(String name, String personNr, String destination) {
        this.name = name;
        this.personNr = personNr;
        this.destination = destination;

    }

    public void printTicketInfo(){
        System.out.println("\nBillet Informasjon");
        System.out.println("Name: " + this.name);
        System.out.println("Person Nr: " + this.personNr);
        System.out.println("Destination: " + this.destination);

    }
    //husk å skrive System.out.println (fordi ln avgjør om det er neste linje eller ikke)

}
