package School_Projects.Exam_practice.Previous_Exams.Testing_Abilities;

public class Int_Array {

    public void investigateIntArray(int[] ints, int number){
        for (int i: ints){
            if(i < 0){
                System.out.println(ints[number]);
            }

        }
    }

    public static void main(String[]args) {
        Int_Array ints = new Int_Array();
        ints.investigateIntArray(new int[]{2, 2, -2, -3}, 2);
    }
}
