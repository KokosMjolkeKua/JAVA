package School_Projects.Exam_practice.Module_seven.Assignments;

public class Oppg_6 {
    public static void main(String[]args){
        int[] arrayOne = {45, 34, 5, 8, 10, 2, 13, 25};
        int[] arrayTwo = {45, 34, 5, 8, 10, 2, 13, 25};

        if(arrayOne.length == arrayTwo.length){
            System.out.println("Arrayene kan være like fordi de har samme lengde!");

            boolean alike = true;

            for (int i = 0; i < arrayOne.length; i++) {
                if(arrayOne[i] != arrayTwo[i]){
                    alike = false;
                }
            }
            if (!alike){
                System.out.println("Arrayene er ikke like.");
            }
            else{
                System.out.println("Arrayene er helt like.");
            }
        }
        else{
            System.out.println("Arrayene kan ikke være like fordi de ikke har samme lengde!");
        }




    }

}
