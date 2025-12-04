package School_Projects.Exam_practice.Module_seven;

import java.util.HashMap;

public class Animal {

    HashMap<String, Integer> animals = new HashMap<>();

    public void addAnimal(String animalia, int amount){
        animals.put(animalia, amount);
    }

    public void printAnimal(){
        for (String s: animals.keySet()){
            System.out.println("Number of animals: " + animals.values() + ". Animal: " + s);
        }
    }

}

