package School_Projects.Exam_practice.Scratch_Programs;

import static javax.swing.JOptionPane.*;

public class Ticket {

    private String name;
    private String destination;
    private String dateOfBirth;

    public void getTicket(String name, String destination, String dateOfBirth){
        this.name = name;
        this.destination = destination;
        this.dateOfBirth = dateOfBirth;
    }

    public void printTicket(){
        System.out.println("\nTICKET INFORMATION: " +
                "\nName: " + name +
                "\nDestination: " + destination +
                "\nDate Of Birth: " + dateOfBirth);
    }

    public void getTicketJOption(){
        this.name = showInputDialog("What is your full name?");
        this.destination = showInputDialog("What is your destination?");
        this.dateOfBirth = showInputDialog("What is your date of birth?");
    }
}
