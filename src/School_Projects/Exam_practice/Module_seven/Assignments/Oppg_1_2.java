package School_Projects.Exam_practice.Module_seven.Assignments;

public class Oppg_1_2 {
    public static void main(String[]args){
        int[] ints = {1,2,3,4,5,6,7,8,9};
        System.out.println(ints[2]);
        System.out.println(ints[5]);

        int sum = 0;
        for(int i: ints){
            sum = i + sum;
        }
        System.out.println(sum);
    }
}
