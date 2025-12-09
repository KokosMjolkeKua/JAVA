package School_Projects.Exam_practice.Previous_Exams.E_2024;

public class Oppg_1 {

    public void investigateIntArray(int[] ints, int number){
        int sum = 0;
        int lessThanZero = 0;
        int max = ints[0]; //this does not work for bigger numbers, ideally you should use
        //int max = ints[0]; this way the lowest number in the int is the starting for
        //the max value.

        for(int i: ints){
            if(i < 0){
                lessThanZero ++;
            }
            sum = i + sum;

            if(i % number == 0){
                System.out.println(i + " is devidable with " + number);
            }

            if(i > max){
                max = i;
            }
        }

        System.out.println("\nThis amount of numbers that are below zero: " + lessThanZero);
        System.out.println("Summen av alle tallene er: " + sum);
        System.out.println("The largest number in the Array is " + max);
    }
}
