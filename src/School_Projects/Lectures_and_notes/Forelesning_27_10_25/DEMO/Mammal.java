package School_Projects.Lectures_and_notes.Forelesning_27_10_25.DEMO;

public abstract class Mammal extends Animal{
    int teats;

    public Mammal(String name, boolean foodProvider, int teats) {
        super(name, foodProvider);
        this.teats = teats;
    }

    public void feedBaby(){
        if(isFoodProvider()) {
            System.out.println("Providing food for my baby through one of my "
                    + this.teats + " teats.");
        } else{
            System.out.println("Not a food-provider.");
        }
    }

    /*public String amountOfTeats (int teats){
        this.teats = teats;
        return "The animal has " + this.teats + " amount of teats";
    }*/

    @Override
    public String toString(){
        return "Mammal{" +
                "nrOfTeats=" + teats + "}";
    }
}
