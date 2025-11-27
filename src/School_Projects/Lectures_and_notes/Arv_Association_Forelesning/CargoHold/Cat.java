package School_Projects.Lectures_and_notes.Arv_Association_Forelesning.CargoHold;

public class Cat extends Animal{

    public Cat(double length, double width, double height, double weight){
        super(length, width, height, weight);
    }

    public void tipGlassOfShelf(){
        System.out.println("Crash");
    }

    public void makeSound(){
        System.out.println("Meow!");
    }

    public String toString(){
        String out = "\nThis is a cat: ";
        out += super.toString();

        return out;
    }
}
