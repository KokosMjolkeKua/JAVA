package School_Projects.Exam_practice.ChatPGT_Made_Excersizes.Excersises;

public class O_2 {
    public static void main(String[]args){
        int[] tall = {1,2,3,4,5};


        int sum = 0;
        for (int i = 0; i < tall.length; i++) {
            System.out.print(tall[i] + ", ");
            sum = tall[i] + sum;
        }
        System.out.println("\n" + sum);


    }
}
