package School_Projects.Lectures_and_notes.DEMO_Classes.Exam_Walkthrough.Oppg_1;

public class Investigate {

    public void investigateIntArray(int[] ints, int number){

        int lessThanZero = 0;
        for(int i: ints){
            if (i < 0){
                lessThanZero ++;
            }
        }
        System.out.println("Hvor mange har mindre verdi enn 0?  " + lessThanZero);


        int lessThanZeroTwo = 0;
        for (int i = 0; i < ints.length; i++) {
            if(ints[i] < 0){
                lessThanZeroTwo ++;
            }
        }
        System.out.println("Mindre enn 0: " + lessThanZeroTwo);


        int sum = 0;
        for (int i = 0; i < ints.length; i++) {
            sum = ints[i] + sum;
        }
        System.out.println("Summen av alle tall: " + sum);


        int max = ints[0]; //hvis det bare er negative tall, vil bare 0 vises
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] > max){
                max = ints[i];
            }
        }
        System.out.println("Det Størst tallet: " + max);

        for (int i = 0; i < ints.length; i++) {
            if (ints[i] % number == 0){
                System.out.println("Tall som er delelig med " + number + ": " + ints[i]);
            }
        }
    }
}
