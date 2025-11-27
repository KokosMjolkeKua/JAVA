package School_Projects.Lectures_and_notes.Arv_Association_Forelesning.CargoHold;

public class Dimensions {
    private double length;
    private double width;
    private double height;
    private double weight;

    public Dimensions(double length, double width, double height, double weight){
        this.length = length;
        this.width = width;
        this.height = height;
        this.weight = weight;
    }

    public double getWeight(){
        return this.weight;
    }

    public double getVolume(){
        return length * width * height;
    }

    public String toString(){
        return "\nDimensions: " +
                "\nlength: " + length +
                "\nWidth: " + width +
                "\nHeight: " + height +
                "\nWeight: " + weight;
    }

    public void setWeight(double newWeight){
        this.weight = newWeight;
    }
}
