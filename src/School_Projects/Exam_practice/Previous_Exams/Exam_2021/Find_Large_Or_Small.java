package School_Projects.Exam_practice.Previous_Exams.Exam_2021;

import java.util.ArrayList;

public class Find_Large_Or_Small {

    public int large(ArrayList<Integer> ints){
        int max = ints.getFirst();
        for(int i: ints){
            if(max < i){
                max = i;
            }
        }
        return max;
    }

    public int small(ArrayList<Integer> ints){
        int min = ints.getFirst();
        for(int i: ints){
            if(min > i) {
                min = i;
            }
        }
        return min;
    }

}
