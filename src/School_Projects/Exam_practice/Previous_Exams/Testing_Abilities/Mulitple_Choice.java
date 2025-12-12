package School_Projects.Exam_practice.Previous_Exams.Testing_Abilities;

public class Mulitple_Choice {
    public static void main(String[]args){
        String movie1 = "Mamma Mia";
        String movie2 = "Mamma Mia";

        System.out.println("De er like!");

        int[] tab = {1};
        int a = 2;

        myProcedure(tab, a);
    }

    public static void myProcedure(int[] tab, int a) {
        tab[0] = 3;
        a = 4;
    }
}
