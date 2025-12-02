package School_Projects.Lectures_and_notes.DEMO_Classes.ArrayLists;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[]args){

        System.out.println("\nArray lager: ");
        String[] stringArray = new String [3]; //denne er en fastsatt dataform(kan bare legge til 3) den kan ikke endres når den er lagd.
        stringArray[0] = "Banan";
        stringArray[1] = "Eple";
        stringArray[2] = "Appelsin";
        //stringArray[3] = "Kiwi"; //indeksen funker nå ikke, fordi du kan bare ha 3 variabler.

        System.out.println(stringArray.length);

        for (int i = 0; i < stringArray.length; i ++){
            System.out.println(stringArray[i]);
        }
        for (String s: stringArray){ //begge måter funker på samme måter
            System.out.println(s);
        }



        System.out.println("\nArrayList lager: ");
        ArrayList<String> stringList = new ArrayList<>(); //Det som kommer bak er selve koden
        stringList.add("Helmelk");  //en rafinert form for datalagring.
        stringList.add("LettMelk");
        stringList.add("Extra-lettmelk");
        stringList.add("Skummet Melk");
        stringList.add("Gulost");

        for (int i = 0; i < stringList.size(); i++){
            System.out.println(stringList.get(i));
        }
        for (String s: stringList){
            System.out.println(s);
        }

        System.out.println(stringList.contains("Gulost"));
        System.out.println(stringList.contains("LettMelk"));
        System.out.println(stringList.indexOf("LettMelk"));



        System.out.println("\nHashMap lager: ");
        HashMap<String, String> stringMap = new HashMap<>();
        stringMap.put("Kjøttdeig", "Kjøleskap");
        stringMap.put("KyllingLår", "Fryst");
        stringMap.put("Lakse-filet", "Ferskvare");
        stringMap.put("VegetarKjøtt", "Kjøleskap");

        System.out.println(stringMap);

        for (String s: stringMap.values()){
            System.out.println(s);
        }
        for (String s: stringMap.keySet()){
            System.out.println(s);
        }

        for (String s: stringMap.keySet()){
            System.out.println("Nøkkelverdi: " + s + ". Oppbevaring: " + stringMap.get(s));
        }


        //INT ARRAY:
        System.out.println("\n" + "Int Array: ");
        int[] intArray = new int[3];
        intArray[0] = 1;
        intArray[1] = 2;
        intArray[2] = 3;
        //kan også ikke legge inn mer enn 3 elementer

        System.out.println("\nint ArrayList: ");
        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(2);
        intList.add(3);
        intList.add(1);
        intList.add(4);

        System.out.println("\nint HashMap: ");
        HashMap<String, Integer> intMap = new HashMap<>();
        intMap.put("Fryser", -15);
        intMap.put("Kjøleskap", 2);
        intMap.put("Ferskvare", 4);




        //Implementasjon as Klassene:

        System.out.println("\nKlasse Implementasjon:");
        StorageList kiwi = new StorageList();
        kiwi.addDairy("Lettmelk");
        kiwi.addDairy("Helmelk");
        kiwi.addDairy("Gulost");
        kiwi.addDairy("Blåmuggost");
        kiwi.addDairy("Extra-lettmelk");
        kiwi.addDairy("Smør");

        kiwi.printDairy();


        StorageArray coop = new StorageArray();
        coop.addFruit("Apple");
        coop.addFruit("Orange");
        coop.addFruit("Guava");
        coop.addFruit("Pomegranite");
        coop.addFruit("Banan");

        coop.printFruit();


        StorageHashMap rema = new StorageHashMap();
        rema.addMeat("Kjøttdeig", 300);
        rema.addMeat("Indrefilet", 450);
        rema.addMeat("Kylling-Lår", 150);
        rema.addMeat("Due", 677);

        rema.printMeat();


    }
}
