package School_Projects.Exam_practice.Scratch_Programs;

public class Plane_Ticket {
    public static void main(String[]args){


        Ticket ticket = new Ticket();
        ticket.getTicket("Inga", "Svalbard", "19 12 97");
        ticket.printTicket();

        ticket.getTicketJOption();
        ticket.printTicket();
    }
}
