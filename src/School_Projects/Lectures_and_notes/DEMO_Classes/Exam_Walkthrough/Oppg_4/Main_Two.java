package School_Projects.Lectures_and_notes.DEMO_Classes.Exam_Walkthrough.Oppg_4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

public class Main_Two {
    public static void main(String[]args) {


        GreenHouseGassesTwo CO2 = new GreenHouseGassesTwo("CO2", 1, 100);
        GreenHouseGassesTwo CH4 = new GreenHouseGassesTwo("CH4", 25, 100);
        GreenHouseGassesTwo N2O = new GreenHouseGassesTwo("N2O", 298, 100);

        System.out.println(CO2.toString());
        System.out.println(CH4.toString());
        System.out.println(N2O.toString());


        HashMap<String, Double> hashList = new HashMap<>();
        hashList.put("CO2", 38869.00);
        hashList.put("CH4", 171.27);
        hashList.put("N2O", 8.44);

        System.out.println(hashList);

        double sum = 0;
        for (String s : hashList.keySet()) {
            if (s.equals("CO2")) {
                GreenHouseGassesTwo CO2_Two = new GreenHouseGassesTwo("CO2", 1, hashList.get(s));
                System.out.println(CO2_Two.toString());
                sum = sum + CO2.calculateEquivalent();
            }
            if (s.equals("CH4")) {
                GreenHouseGassesTwo CH4_Two = new GreenHouseGassesTwo("CH4", 25, hashList.get(s));
                System.out.println(CH4_Two.toString());
                sum = sum + CH4.calculateEquivalent();
            }
            if (s.equals("N2O")) {
                GreenHouseGassesTwo N2O_Two = new GreenHouseGassesTwo("N2O", 298, hashList.get(s));
                System.out.println(N2O_Two.toString());
                sum = sum + N2O.calculateEquivalent();
            }

        }
        System.out.println("Summen av alle utslippene i CO2 form er " + sum);
    }
}
