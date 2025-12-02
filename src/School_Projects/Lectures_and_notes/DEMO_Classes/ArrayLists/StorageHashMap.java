package School_Projects.Lectures_and_notes.DEMO_Classes.ArrayLists;

import java.util.HashMap;

public class StorageHashMap {
    HashMap<String, Integer> meatMap = new HashMap<>();

    public void addMeat(String meatProduct, int price){
        meatMap.put(meatProduct, price);
    }
    public void printMeat(){
        for (String s: meatMap.keySet()){
            System.out.println("Meat-Produkt: " + s + ". Price: " + meatMap.values());
        }
    }
}
