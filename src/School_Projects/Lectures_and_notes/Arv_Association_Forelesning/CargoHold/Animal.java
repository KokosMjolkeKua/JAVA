package School_Projects.Lectures_and_notes.Arv_Association_Forelesning.CargoHold;

public class Animal {
    private Dimensions dimensions;

    public Animal(double length, double width, double height, double weight){
        this.dimensions = new Dimensions(length, width, height, weight);
    }

    public double getWeight(){
        return this.dimensions.getWeight();
    }

    public double getVolume(){
        return this.dimensions.getVolume();
    }

    public void makeSound(){
        System.out.println("");
    }

    public String toString(){
        return this.dimensions.toString();
    }
}
