package School_Projects.Lectures_and_notes.Forelesning_10_11_25.Oppgave_5;

public class Main {
    public static void main(String[]args){

        Car janice = new Car(3, 5, true, 10);

        Tires tires = janice.getTires();
        tires.setWearPercentage(0);

    }
}
