package School_Projects.Exam_practice.Module_four.O_1;

public class Ticket {
    private String name;
    private int personNr;
    private String destination;
    private static int ticketsPrinted;

    public Ticket(String name, int personNr, String destination) {
        if(String.valueOf(personNr).length() <= 10){
            this.personNr = personNr;
        }

        this.name = name;
        this.destination = destination;
        ticketsPrinted ++;


    }

    public String toString(){
        return "Ticket: " +
                "\nName: " + name +
                "\nDestination: " + destination +
                "\nPersonNr: " + personNr;
    }

    public String amountOfPassengers(){
        return "The amount of Tickets printed: " + ticketsPrinted;
    }
}
