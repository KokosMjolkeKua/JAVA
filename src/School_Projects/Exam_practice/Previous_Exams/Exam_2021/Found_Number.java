package School_Projects.Exam_practice.Previous_Exams.Exam_2021;

public class Found_Number {

    public static boolean funnetTall(int[] ints, int number){
        boolean foundNumber = false;
        for(int i: ints){
            if (i == number) {
                foundNumber = true;//For boolean ifs you need a break after!!
                break;
            }
        }
        return foundNumber;
    }
}
