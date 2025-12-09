package School_Projects.Exam_practice.Module_seven.Assignments;

public class Oppg_7 {
    public static void main(String[]args){

        int[] ints = {45, 34, 5, 8, 10, 2, 13, 25, 12, 2, 3,
                4, 5, 7, 8, 98, 67, 434, 5, 7, 8, 98, 67, 43, 1, 3, 34, 8, 3, 5, 7};

        int checkAmountP = 0;
        System.out.println("Partall:");
        for(int i = 0; i < ints.length; i++){
            if(ints[i] % 2 == 0){
                System.out.print(ints[i] + ", ");
                checkAmountP ++;
            }
        }
        System.out.println("\nAntall partall: " + checkAmountP);

        int checkAmountO = 0;
        System.out.println("\nOddetall: ");
        for(int i = 0; i < ints.length; i++){
            if(ints[i] % 2 != 0){
                System.out.print(ints[i] + ", ");
                checkAmountO ++;
            }
        }
        System.out.println("\nAntall oddetall: " + checkAmountO);
    }
}
