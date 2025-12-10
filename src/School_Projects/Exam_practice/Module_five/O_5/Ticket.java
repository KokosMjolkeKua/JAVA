package School_Projects.Exam_practice.Module_five.O_5;

import static javax.swing.JOptionPane.showInputDialog;

public class Ticket{
    private String name;
    private String destination;
    private int personNr;
    static int seatNr = 1;
    static int ticketNr = 1;

    public Ticket(String name, String destination, int personNr){
        this.name = name;
        this.destination = destination;
        this.personNr = personNr;
    }

    public void printTicket(){
        String text = "Ticket:" +
                "\nName: " + name +
                "\nDestination: " + destination +
                "\nSeat-Nr: " + seatNr +
                "\nPerson-Nr: " + personNr;

        seatNr = seatNr + 1;

        System.out.println(text);
    }

    public void checkPrice(){
        double price = 60 + (60 * 0.25);
        System.out.println("Your Ticket comes out to " + price +
                "\nYour ticket number: " + ticketNr);
        ticketNr++;
    }

    public String buyTicket(int creditCard){

        return "Reciept: " +
                "\nPayment: CREDIT CARD" +
                "\nStatus: PAID";
    }
}
