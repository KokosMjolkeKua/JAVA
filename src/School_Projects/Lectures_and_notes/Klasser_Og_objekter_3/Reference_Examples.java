package School_Projects.Lectures_and_notes.Klasser_Og_objekter_3;

public class Reference_Examples {
    public static void main(String[]args){

        int age = 34;

        int ageAlias = age;

        age += 1;

        Person trym = new Person(34, "January");
        Person weds = trym;

        Time.agePerson(trym);
        Time.agePerson(weds);



    }
}
