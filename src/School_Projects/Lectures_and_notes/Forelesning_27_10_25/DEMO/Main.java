package School_Projects.Lectures_and_notes.Forelesning_27_10_25.DEMO;

public class Main {
    public static void main(String[] args) {
        // Not possible as Animal now is abstract
        // Animal benny = new Animal("Benny");

        Animal passop = new Dog("Passop", false, true, 5);
        Cat mia = new Cat("Mia", true, 2,  "Royal Canin");
        // Testing the dog
        // Look what happens when the object has a toString method:
        System.out.println(passop);
        passop.makeSound();
        // Why doesn't his work ?!?
        //passop.fetchTheStick();

        // Testing the cat
        System.out.println(mia);
        mia.makeSound();
        mia.blockViewToScreen();
        mia.feedBaby();

        Parrot perry = new Parrot("perry", false, 34.2);
        System.out.println(perry);
    }
}