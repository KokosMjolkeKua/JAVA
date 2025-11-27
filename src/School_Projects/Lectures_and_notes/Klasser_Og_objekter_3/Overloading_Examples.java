package School_Projects.Lectures_and_notes.Klasser_Og_objekter_3;

public class Overloading_Examples {
    public static void main(String[]args){

        Person trym = new Person(34, "January");
        Person student = new Person();

        trym.incrementAge();
        student.incrementAge();

        trym.incrementAge(4);
        student.incrementAge(2);




    }
}
