package School_Projects.Exam_practice.Module_seven.Assignments;

public class Oppg_4_5 {
    public static void main(String[]args){

        int[] ints = {45, 34, 5, 8, 10, 2, 13, 25};


        int max = ints[0];
        int min = ints[0];
        for (int i = ints.length - 1; i >= 0; i--) {
            System.out.print(ints[i] + ", ");

            if(ints[i] > max){
                max = ints[i];
            }
            if(ints[i] < min){
                min = ints[i];
            }
        }

        System.out.println("\nDet høyeste tallet er: " + max);
        System.out.println("Det laveste tallet er: " + min);
    }
}
