package School_Projects.Exam_practice.Module_seven;

import java.util.ArrayList;

public class ArrayList_testing {

    ArrayList<String> stringList = new ArrayList<>();

    public void addItem(String stringItem){
        stringList.add(stringItem);
    }

    public void printItem(){
        for (String s: stringList){
            System.out.println(s);
        }
    }

}
