package School_Projects.Lectures_and_notes.Forelesning_10_11_25.Oppgave_5;

public class Drone implements Movable{
    private double[] position;

    public Drone(double x, double y){
        this.position = new double[2];
        this.position[0] = x;
        this.position[1] = y;
    }

    public void move(double[] position){
        this.position[0] = position[0];
        this.position[1] = position[1];
    }
}
