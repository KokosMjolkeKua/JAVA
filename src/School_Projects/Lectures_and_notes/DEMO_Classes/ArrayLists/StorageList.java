package School_Projects.Lectures_and_notes.DEMO_Classes.ArrayLists;

import java.util.ArrayList;

public class StorageList {
    private ArrayList<String> dairyList = new ArrayList<>();

    public void addDairy(String dairyProduct){
        dairyList.add(dairyProduct);
    }

    public void printDairy(){
        for (int i = 0; i < dairyList.size(); i++) {
            System.out.println("Produkt: " + dairyList.get(i));
        }
    }
}
