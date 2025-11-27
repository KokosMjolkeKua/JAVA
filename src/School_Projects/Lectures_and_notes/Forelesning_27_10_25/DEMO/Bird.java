package School_Projects.Lectures_and_notes.Forelesning_27_10_25.DEMO;

public abstract class Bird extends Animal{
    private double beakLength;

    public Bird(String name, boolean foodProvider, double beakLength) {
        super(name, foodProvider);
        this.beakLength = beakLength;
    }

    public double getBeakLength(){
        return beakLength;
    }

    public void fly(){

    }

    @Override
    public String toString() {
        return "Bird{" +
                "beakLength=" + beakLength +
                '}';
    }
}
