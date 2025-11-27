package School_Projects.Lectures_and_notes.Forelesning_27_10_25.DEMO;

public class Dog extends Mammal {

    private boolean canFetchNewsPaper;

    public Dog(String name, boolean foodProvider, boolean canFetchNewsPaper, int teats) {
        super(name, foodProvider, teats);
        this.canFetchNewsPaper = canFetchNewsPaper;
    }

    @Override
    public void makeSound() {
        System.out.println("Voff, voff!");
    }

    // Name is private. I have to use the getter
    public void fetchTheStick(){
        System.out.println(getName() + " fetching the stick you threw...");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "canFetchNewsPaper=" + canFetchNewsPaper +
                "} " + super.toString();
    }

    @Override
    public void feedBaby(){
        if(isFoodProvider()) {
            System.out.println("Providing food for my baby through one of my "
                    + this.teats + " tats.");
        } else{
            System.out.println("Not a food-provider.");
        }
    }
}