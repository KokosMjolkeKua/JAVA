package School_Projects.Exam_practice.Previous_Exams.E_2024;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[]args){

        Oppg_1 ints = new Oppg_1();
        ints.investigateIntArray(new int[]{1, 2, -3, 4, -6, 3, 0, 1, 3, -4}, 2);

        Oppg_2 devi = new Oppg_2();
        devi.Oppg_2("4", "2");
        Oppg_2.Oppg_2("5", "3");
        Oppg_2.Oppg_2("6", "3");
        Oppg_2.Oppg_2("7", "3");

        //b)
        //When you use static instead of just a normal method, you
        //can access said class without having to create a new item. but
        //A static method belongs to the class , not to any object created
        // from the class. This means it can be called without creating
        // an instance. A method should be static if it does not use or
        // depend on instance variables and its behavior is the same for
        // all objects. If the method needs to work with object-specific
        // data, then it should not be static.

        //c)
        // If a method is public , it can be accessed from outside the class
        // by other classes. This is used when the method is part of the class
        // 's intended functionality. If a method is private , it can only be
        // used inside the same class. This is useful for helper methods and
        // helps protect internal logic and maintain encapsulation


        ArrayList<String> animalis = new ArrayList<>();
        animalis.add("Lion");
        animalis.add("Tiger");
        animalis.add("Giraffe");
        animalis.add("Python");
        animalis.add("Hippo");
        animalis.add("Cat");

        Oppg_3 animal = new Oppg_3();
        animal.guessTheAnimal(animalis);



        //OPPGAVE 4:

        GreenHouseGas CO2 = new GreenHouseGas("CO2", 1, 100);
        GreenHouseGas CH4 = new GreenHouseGas("CH4", 25, 100);
        GreenHouseGas N2O = new GreenHouseGas("N2O", 298, 100);

        System.out.println(CO2);
        System.out.println(CH4);
        System.out.println(N2O);

        HashMap<String, Double> norgeList = new HashMap<>();
        norgeList.put("CO2", 38869.00);
        norgeList.put("CH4", 171.27);
        norgeList.put("N2O", 8.44);

        System.out.println(norgeList);
        double sum = 0;
        for(String s: norgeList.keySet()){
            if(s.contains("CO2")){
                GreenHouseGas CO2_two = new GreenHouseGas("CO2", 1, norgeList.get(s));
                System.out.println(CO2_two);
                sum = CO2_two.calculateEquivalent() + sum;
            }
            if(s.contains("CH4")){
                GreenHouseGas CH4_two = new GreenHouseGas("CH4", 25, norgeList.get(s));
                System.out.println(CH4_two);
                sum = CH4_two.calculateEquivalent() + sum;
            }
            if(s.contains("N2O")){
                GreenHouseGas N2O_two = new GreenHouseGas("N2O", 298, norgeList.get(s));
                System.out.println(N2O_two);
                sum = N2O_two.calculateEquivalent() + sum;
            }
        }

        System.out.println("Summen av alle norges gassene i CO2: " + sum);

    }
}
