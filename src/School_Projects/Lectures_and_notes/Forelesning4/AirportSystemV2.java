package School_Projects.Lectures_and_notes.Forelesning4;

public class AirportSystemV2 {
    public static void main(String[]args){
        TicketV2 ticket1 = new TicketV2("Trym", "15125615123", "Svalbard");
        ticket1.printTicketInfo();

        ticket1.setName();
        ticket1.setPassengerInfo("Kristian", "15423654253");
        //Må nå skrive både navn og personnr for at det skal funke
        ticket1.printTicketInfo();
        //blir feil fordi denne klasen TicketV2 er privat, kan dermed ikke endre i dette programmet.
        //blir riktig navn men ikke personNr , selv om destinasjonen er riktig.

        String destination = ticket1.getDestination();





    }
}
