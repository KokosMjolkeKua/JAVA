package Variables_Assignmnets;

import static javax.swing.JOptionPane.*;

public class Assignment_4 {
    public static void main(String[]args){
        String firstName = "Ole";
        String lastName = "Olsen";
        int age = 21;
        String postNr = "0470";
        String address = "Osloveien 23";
        String city = "Oslo";

        showMessageDialog(null, "Hi and Welcome!");
        showMessageDialog(null, "\nName: " + firstName + " " + lastName +
                            "\nAdresse: " + address +
                            "\nPost-Number: " + postNr +
                            "\nCity: " + city +
                            "\nAge: " + age);


        showMessageDialog(null, "Thank you for using the Program!" + "\nGoodbye!");
    }
}
