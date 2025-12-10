package School_Projects.Exam_practice.ChatPGT_Made_Excersizes.More_Excersises;

import java.util.HashMap;

public class Oppg_9 {
    public static void main(String[]args){
        HashMap<String, Integer> elevKar = new HashMap<>();
        elevKar.put("Olav", 78);
        elevKar.put("Ida", 23);
        elevKar.put("Norleif", 45);

        System.out.println(elevKar.get("Olav"));
        System.out.println(elevKar.get("Ida"));

    }
}
