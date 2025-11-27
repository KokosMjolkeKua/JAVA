package School_Projects.Lectures_and_notes.Forelesning_10_11_25.Oppgave_4;

public class Chef extends Employee{

    public Chef(int age, double salary, String name) {
        super(age, salary, name);
    }

    public void makeDish(String dish){
        System.out.println(dish + " is ready to be served!");
    }

    public void makeDish(){
        System.out.println("The Chef speciality is finished!");
    }
}
