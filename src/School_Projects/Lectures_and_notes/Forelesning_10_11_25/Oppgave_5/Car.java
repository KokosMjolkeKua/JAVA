package School_Projects.Lectures_and_notes.Forelesning_10_11_25.Oppgave_5;

public class Car {
    private double[] position;
    private Tires tires;

    public Car(double x, double y, boolean isWinterTires, double wearPercentage){
        this.position = new double[2];
        this.position[0] = x;
        this.position[1] = y;

        this.tires = new Tires(isWinterTires, wearPercentage);
    }

    public Tires getTires(){
        return this.tires;
    }

    public void move(double[] position){
        this.position[0] = position[0];
        this.position[1] = position[1];
    }
}
