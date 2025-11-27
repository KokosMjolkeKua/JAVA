package School_Projects.Lectures_and_notes.Forelesning4;

public class AirportSystemV1 {
    public static void main(String[]args){
        TicketV1 ticket1 = new TicketV1("Trym", "15125615123", "Svalbard");
        ticket1.printTicketInfo();

        TicketV1 ticket2 = new TicketV1("Per", "12232412178", "Tromsø");
        ticket2.printTicketInfo();

        TicketV1 ticket3 = new TicketV1("Faid", "24079856473", "Algerie");
        ticket3.printTicketInfo();

    }
}
