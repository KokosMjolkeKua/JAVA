package School_Projects.Lectures_and_notes.Forelesning_10_11_25.Oppgave_4;

public class Waiter extends Employee {
    private static double tipJar = 0;

    public Waiter(int age, double salary, String name) {
        super(age, salary, name);
    }

    public void takeTips(double tips){
        Waiter.tipJar += tips;
    }

    public static double getTipJar(){
        double outTips = Waiter.tipJar;
        Waiter.tipJar = 0;
        return outTips;
    }

    public static double distributeTips (int nrOfEmployees){
        double outTips = Waiter.tipJar;
        Waiter.tipJar = 0;
        return outTips/nrOfEmployees;
    }

}
