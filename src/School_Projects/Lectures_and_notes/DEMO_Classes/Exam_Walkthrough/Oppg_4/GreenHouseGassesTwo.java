package School_Projects.Lectures_and_notes.DEMO_Classes.Exam_Walkthrough.Oppg_4;

public class GreenHouseGassesTwo {
    private String gasName;
    private double globalWarmingPotential;
    private double emissionInKiloTonnes;

    public GreenHouseGassesTwo(String gasName, double globalWarmingPotential, double emissionInKiloTonnes) {
        this.gasName = gasName;
        this.globalWarmingPotential = globalWarmingPotential;
        this.emissionInKiloTonnes = emissionInKiloTonnes;
    }

    public double calculateEquivalent(){
        return globalWarmingPotential * emissionInKiloTonnes;
    }

    @Override
    public String toString(){
        return emissionInKiloTonnes + " kilotonn " + gasName +
                " tilsvarer " + calculateEquivalent() + " kilotonn CO2.";
    }
}
