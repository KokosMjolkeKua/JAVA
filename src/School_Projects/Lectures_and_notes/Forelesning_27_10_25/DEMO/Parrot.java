package School_Projects.Lectures_and_notes.Forelesning_27_10_25.DEMO;

public class Parrot extends Bird implements Flyable {

    public Parrot(String name, boolean foodProvider, double beakLength) {
        super(name, foodProvider, beakLength);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " wants a cracker, SQUACK SQUACK");

    }

    @Override
    public void fly(){
        System.out.println("I can fly when im not in a cage");
    }

    @Override
    public String toString() {
        return "Parrot{}" + super.toString();
    }
}
