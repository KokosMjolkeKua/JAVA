package School_Projects.Lectures_and_notes.Klasser_Og_objekter_3;

import static javax.swing.JOptionPane.showInputDialog;
public class Person {
    private int age;
    private String birthMonth;

    public Person(int age, String birthMonth){
        this.age = age;
        this.birthMonth = birthMonth;
    }

    public Person(){
        this.age = Integer.parseInt(showInputDialog(null, "Write your age in whole numbers."));
        this.birthMonth = showInputDialog(null, "What month where you born?");
    }

    public void incrementAge(){
        int ageIncrement = 1;
        System.out.println("You are " + ageIncrement + " year older");
        this.age++;
    }

    public String incrementAge(int ageIncrement){
        //denne kan ikke skille om det er string eller void den skal ha, så når man putter
        this.age += ageIncrement;
        return "You are older.." + ageIncrement;
    }
}
