package School_Projects.Exam_practice.Previous_Exams.Exam_2024_newTry;

import java.util.ArrayList;

public class Main {
    public static void main(String[]args){

        //OPPGAVE 1:
        int[] ints = {1,2,3,4,-1,-1,-2,-3,5, 2, 34,5 ,5};
        O_1 oppg1 = new O_1();
        oppg1.investigateIntArray(ints, 2);

        //OPPGAVE 2:
        O_2 oppg2 = new O_2();
        System.out.println(oppg2.O_2("2","3"));

        //OPPGAVE 3:
        ArrayList<String> animalList = new ArrayList<>();
        animalList.add("Lion");
        animalList.add("Cat");
        animalList.add("Dog");
        animalList.add("Giraffe");
        animalList.add("Pelican");
        O_3 oppg3 = new O_3();
        oppg3.guessTheAnimal(animalList);

        //OPPGAVE 4:
        GreenhouseGas CO2 = new GreenhouseGas("CO2",1, 38869.0);
        GreenhouseGas CH4 = new GreenhouseGas("CH4",25, 171.27);
        GreenhouseGas N2O = new GreenhouseGas("N2O",298, 8.44);

        GreenhouseGas[] norge = {CO2, CH4, N2O};
        double sum = 0;
        for(GreenhouseGas g: norge){
            System.out.println(g);
            sum = sum + g.calculateEquivalent();
        }
        System.out.println("Summen av alle gassene er " + sum + " kilotonn CO^2");
    }
}
