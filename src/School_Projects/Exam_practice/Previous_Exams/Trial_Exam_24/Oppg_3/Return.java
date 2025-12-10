package School_Projects.Exam_practice.Previous_Exams.Trial_Exam_24.Oppg_3;

public class Return {

    public void charArray(char[] ints){
        for(char i: ints){
            System.out.print(i);
        }

        System.out.println();

        for (int i = ints.length - 1; i >= 0; i--) {
            System.out.print(ints[i]);
        }
    }
}
