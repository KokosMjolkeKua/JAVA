package School_Projects.Lectures_and_notes.Collections_Rammeverket_Module_8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

import static javax.swing.JOptionPane.showInputDialog;

public class PassengerList {
    public static void main(String[]args){
        ArrayList<String> passengerList = new ArrayList<>(); //trenger ikke skrive Stirng i den andre arrayen fordi du allerede har sagt det i første

        passengerList.add("Kine");
        passengerList.add("Tobias");
        passengerList.add("Trym");

        passengerList.add(2, "Per"); //adder en person med en plass som du bestemmer
        passengerList.set(2, "Maria"); //bytter ut per med maria, setter istedenfor å adde en person til

        Collections.sort(passengerList);//skal lære å identifisere egne objekter/klasser vi kan sortere (det er en egen kode som kan gjøre det)

        String passengerName;
        do {
            passengerName = showInputDialog(null, "Put the name of the passenger that has cancelled");
        } while (passengerList.remove(passengerName) == false); //kommer ikke ut av loopen med mindre man skriver inn ett navn som er der

        //boolean removedPassenger = passengerList.remove("Jørgen"); //Skriver false ut fordi vi prøver å fjerne en person som ikke eksisterer
        //System.out.println(removedPassenger);


        HashMap <String, String> airportCountryMap = new HashMap<>();

        airportCountryMap.put("Gardemoen", "Norway");
        airportCountryMap.put("Gatwick", "England");
        airportCountryMap.put("Schipool", "Netherlands");

        String country = airportCountryMap.get("Gardemoen");

        System.out.println(country);

    }
}
