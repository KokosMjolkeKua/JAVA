package School_Projects.Lectures_and_notes.Forelesning_10_11_25.Oppgave_5;

public class Tires {
    private boolean isWinterTire;
    private double wearPercentage;

    public Tires(boolean isWinterTire, double wearPercentage){
        this.isWinterTire = isWinterTire;
        this.wearPercentage = wearPercentage;
    }

    public void setWearPercentage(double wearPercentage){
        this.wearPercentage = wearPercentage;
    }
}
