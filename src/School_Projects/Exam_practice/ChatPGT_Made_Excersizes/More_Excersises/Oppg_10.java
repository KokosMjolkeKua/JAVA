package School_Projects.Exam_practice.ChatPGT_Made_Excersizes.More_Excersises;

public class Oppg_10 {

    public int maks(int a, int b){
        return Math.max(a, b);
    }

    public int min(int a, int b){
        return Math.min(a, b);
    }


    public static void main(String[]args){
        Oppg_10 test = new Oppg_10();
        System.out.println(test.maks(2,3));
        System.out.println(test.min(8,9));
    }
}
