package School_Projects.Lectures_and_notes.Arv_Association_Forelesning.CargoHold;

public class Dog extends Animal{

    public Dog(double length, double width, double height, double weight){
        super(length, width, height, weight);
    }

    public void makeSound(){
        System.out.println("Woff");
    }
    public void sniffOutTarget(String target){
        System.out.println("Target scent found!");
    }

    public String toString(){
        String out = "\nDette er en hund: ";
        out += super.toString();
        return out;
    }
}
