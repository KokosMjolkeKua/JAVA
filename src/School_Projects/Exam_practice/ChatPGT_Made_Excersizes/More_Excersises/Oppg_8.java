package School_Projects.Exam_practice.ChatPGT_Made_Excersizes.More_Excersises;

import static javax.swing.JOptionPane.*;
import java.util.ArrayList;

public class Oppg_8 {
    public static void main(String[]args){

        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Torleif");
        stringList.add(showInputDialog("Add ett navn:"));
        stringList.add(showInputDialog("Add ett navn:"));

        System.out.println(stringList);
    }
}
