package School_Projects.Lectures_and_notes.Forelesning_27_10_25.DEMO;

public class Cat extends Mammal {
    private String favouriteFood;

    public Cat(String name, boolean foodProvider, int teats, String favouriteFood) {
        super(name, foodProvider, teats);
        this.favouriteFood = favouriteFood;
    }

    @Override
    public void makeSound() {
        System.out.println("Miaaaau!");
    }

    // Name is private. I have to use the getter
    public void blockViewToScreen(){
        System.out.println("Me, " + getName() + " is now blocking your screen");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "favouriteFood='" + favouriteFood + '\'' +
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