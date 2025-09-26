package Variables_Assignmnets;
import static javax.swing.JOptionPane.*;
public class Assignment_11_Cinema {
    public static void main(String[]args){

        showMessageDialog(null, "Welcome to the Cinema." + "\nThe price for adults are 150 kr" + "\nThe price for children is 135kr");

        String adult = showInputDialog("How many adult tickets?");
        String child = showInputDialog("How many child tickets?");

        int adultTicket, childTicket;
        try{
            adultTicket = Integer.parseInt(adult);
            childTicket = Integer.parseInt(child);

        } catch (Exception e){

            adultTicket = 0;
            childTicket = 0;

            showMessageDialog(null,"You have to write a whole-number!");
        }
        int priceAdult = adultTicket * 150;
        double priceTicketChild = 150 - (0.1 * 150);
        double priceChild = childTicket * priceTicketChild;

        showMessageDialog(null, "For " + adult + " amount of adults, and for " + child + " amount of children." +
                "\nWill the price for adults be " + priceAdult + " kr." + "\nAnd the price for children is " + priceChild + " kr.");
    }
}
