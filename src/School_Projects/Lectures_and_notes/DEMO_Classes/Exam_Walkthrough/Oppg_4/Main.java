package School_Projects.Lectures_and_notes.DEMO_Classes.Exam_Walkthrough.Oppg_4;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[]args){

    GreenhouseGas CO2 = new GreenhouseGas("CO2", 1, 100);
    GreenhouseGas CH4 = new GreenhouseGas("CH4", 25, 100);
    GreenhouseGas N2O = new GreenhouseGas("N2O", 298, 100);
    GreenhouseGas test = new GreenhouseGas("test", 1, 100);

        System.out.println(CO2.calculateEmission());
        System.out.println(CH4.calculateEmission());
        System.out.println(N2O.calculateEmission());
        System.out.println(test.calculateEmission());

        CO2.toString();
        CH4.toString();
        N2O.toString();
        test.toString();


        ArrayList<String> release = new ArrayList<>();
        release.add(0, "38869.00");
        release.add(1, "171.27");
        release.add(2, "8.44");

        for (int i = 0; i < release.size(); i++) {

        }


    }
}
