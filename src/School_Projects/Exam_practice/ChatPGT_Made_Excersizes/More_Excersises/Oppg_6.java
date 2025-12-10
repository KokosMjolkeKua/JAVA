package School_Projects.Exam_practice.ChatPGT_Made_Excersizes.More_Excersises;

import java.util.ArrayList;

public class Oppg_6 {
    public static void main(String[]args){
        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        intList.add(4);
        intList.add(5);
        intList.add(6);
        intList.add(7);
        intList.add(8);

        int sum = 0;
        int amount = 0;
        double average;
        for(int i = 0; i < intList.size(); i++) {
            sum = sum + intList.get(i);
            amount ++;
        }
        average = (double) sum / amount;
        System.out.println("Summen av alle tallene i ArrayListen er: " + sum);
        System.out.println("The average is: " + average);

        int[] intListArray = {1,2,3,4,5,6,7,8,4,9};
        int intArraySum = 0;
        int intArrayAmount = 0;
        double arrayAverage;
        for(int i: intListArray){
            intArraySum = intArraySum + i;
            intArrayAmount ++;
        }
        arrayAverage = (double) intArraySum / intArrayAmount;
        System.out.println("Summen av alle tallene i int Arrayen er: " + intArraySum);
        System.out.println("The average is: " + arrayAverage);
    }
}
