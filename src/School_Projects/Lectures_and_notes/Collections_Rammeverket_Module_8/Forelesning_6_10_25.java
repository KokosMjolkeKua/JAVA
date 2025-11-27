package School_Projects.Lectures_and_notes.Collections_Rammeverket_Module_8;
import java.util.ArrayList;
import java.util.Collections;

public class Forelesning_6_10_25{
    public static void main(String[]args){
        ArrayList<String> passengerList = new ArrayList<String>();

        passengerList.add("person1");
        passengerList.add("person2");
        passengerList.add("person3");

        passengerList.add(1, "person1");

        boolean passengerInList = passengerList.contains("person1"); //contains gir en verdi eller objekt
        int index = passengerList.indexOf("person2"); //lete etter index av elementer

        String passenger1 = passengerList.get(1);

        String passenger0 = passengerList.remove(0);
        boolean removedPassenger = passengerList.remove("person3");
        passengerList.clear();


        // kan bruke en for loop

        for(String passengerName : passengerList){
            System.out.println(passengerName);
        }

        Collections.sort(passengerList);
    }
}
