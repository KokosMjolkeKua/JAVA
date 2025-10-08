package Classes_Objects_Assignments;

class Ticket{
    private int accountNr;
    private String name;

    int price = 60;
    int ticketNr;
    double moms = price + (price * 0.25);

    public Ticket(int accountNr, String name, int ticketNr) {
        this.accountNr = accountNr;
        this.name = name;
        this.ticketNr = ticketNr;
    }

    public void printTicket(){
        System.out.println("\nName: " + name +
                "\nAccount-Number: " + accountNr +
                "\nTicket-price with moms: " + moms +
                "\nTicket-Number: " + Ticket.getTicketNr(ticketNr));
    }

    public static String getTicketNr(int ticketNr){
        int t = ticketNr % 10;
        switch (t){
            case 0 -> {
                return "Seat nr. 1";
            }
            case 1 -> {
                return "Seat nr. 2";
            }
            case 2 -> {
                return "Seat nr. 3";
            }
            case 3 -> {
                return "Seat nr. 4";
            }
            case 4 -> {
                return "Seat nr. 5";
            }
            case 5 -> {
                return "Seat nr. 6";
            }
            case 6 -> {
                return "Seat nr. 7";
            }
            case 7 -> {
                return "Seat nr. 8";
            }
            case 8 -> {
                return "Seat nr. 9";
            }
            case 9 -> {
                return "Seat nr. 10";
            }
        } return "";
    }

    public static boolean ticketNr(int ticketNr){
        for (ticketNr = 0; ticketNr < 10; ticketNr++){
            if (ticketNr > 0){
                System.out.println("Your Ticket-Number is: " + Ticket.getTicketNr(ticketNr));
                return true;
            }
        } return false;
    }
}
public class Extra_5 {
    public static void main(String[]args){
        Ticket ticket = new Ticket(134513452, "Jodie", 2);
        ticket.printTicket();



    }
}
