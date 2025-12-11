package School_Projects.Exam_practice.Previous_Exams.Trial_2024_Again;

public class Char {

    public static void directionChar(char[] chars){

        int i = chars.length;
        System.out.println("The Opposite direction: ");
        while(i > 0){
            i--;
            System.out.println(chars[i]);
        }
        //I am using a while loop in this instance because i am not so comfortable using a for loop
        //I know the principle is the same and that a for loop might be more efficient and clean.
        //i might come back to this assignment to do it again
    }
}
