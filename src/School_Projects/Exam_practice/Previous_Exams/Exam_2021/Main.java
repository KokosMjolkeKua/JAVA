package School_Projects.Exam_practice.Previous_Exams.Exam_2021;

import java.util.ArrayList;

public class Main {
    public static void main(String[]args){

        //OPPGAVE 1:
        int sum = 0;
        int i = 0;

        while(i < 100){
            if(i % 5 == 0){
                sum = sum + i;
            }
            i++;
        }
        System.out.println(sum);


        int newSum = 0;
        for (int j = 0; j < 100; j++) {
            if(j%5==0){
                newSum = newSum + j;
            }
        }
        System.out.println(newSum);


        //OPPGAVE 2:
        int[] ints = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        System.out.println(Found_Number.funnetTall(ints, 3));
        System.out.println(Found_Number.funnetTall(ints, 34));


        //OPPGAVE 3:
        ArrayList<Integer> intArray = new ArrayList<>();
        intArray.add(1);
        intArray.add(2);
        intArray.add(3);
        intArray.add(4);
        intArray.add(5);
        Find_Large_Or_Small oppg3 = new Find_Large_Or_Small();
        System.out.println("Det største tallet i Arrayen er: " + oppg3.large(intArray));
        System.out.println("Det minste tallet i Arrayen er: " + oppg3.small(intArray));


    }
}

