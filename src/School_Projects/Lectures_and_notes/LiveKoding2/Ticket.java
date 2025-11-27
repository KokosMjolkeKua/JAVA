package School_Projects.Lectures_and_notes.LiveKoding2;

public class Ticket {
    private int ticketNr;
    private static int nrOfTicketsPrinted = 0; //vil gjerne at disse variablene skal ha en standard verdi (0)

    public Ticket(){
        nrOfTicketsPrinted ++; //nrOfTicketsPrinted + 1 (er mulig å skrive)
        this.ticketNr = nrOfTicketsPrinted;
    }
}
