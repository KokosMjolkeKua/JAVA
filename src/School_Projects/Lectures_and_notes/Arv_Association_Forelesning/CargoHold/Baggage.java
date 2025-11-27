package School_Projects.Lectures_and_notes.Arv_Association_Forelesning.CargoHold;

public class Baggage{
    private final double MAX_WEIGHT = 20; //bruker final for å deklarere at denne ikke kan endres
    private Dimensions dimensions;

    public Baggage(double length, double width, double height, double weight){
        this.dimensions = new Dimensions(length, width, height, weight);
    }

    //public Dimensions getDimensions(){
    //    return this.dimensions;
    //}

    //kan ikke skrive sånn fordi den overskrider neste linje, uten å sjekke
    //kan kun eksistere i klassen.


    public void setWeight(double newWeight){
        if (newWeight <= MAX_WEIGHT){
            this.dimensions.setWeight(newWeight);
        } else{
            System.out.println("Baggagen er for tung!");
        }
    }
}
