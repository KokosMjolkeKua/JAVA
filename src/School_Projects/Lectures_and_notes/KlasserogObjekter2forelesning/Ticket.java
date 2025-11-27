package School_Projects.Lectures_and_notes.KlasserogObjekter2forelesning;

public class Ticket {
    private int ticketNr;
    private static int nrOfTicketsPrinted = 0;

    public Ticket(){
        nrOfTicketsPrinted ++; //++ betyr legg til en til denne variablenem kunne skrivet nrOfTicketsPrinted = nrOf.. + 1;
        this.ticketNr = nrOfTicketsPrinted;
    }
}


