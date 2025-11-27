package School_Projects.Lectures_and_notes.Forelesning4;

public class AirportSystemV105 {
    public static void main(String[]args){
        TicketV1 ticket1 = new TicketV1("Trym", "15125615123", "Svalbard");
        ticket1.printTicketInfo();

        ticket1.name = "Kristian";
        ticket1.printTicketInfo();

        //blir riktig navn men ikke personNr , selv om destinasjonen er riktig.
    }
}
