package School_Projects.Exam_practice.Previous_Exams.E_2024;

public class GreenHouseGas {
    private String gasName;
    private double globalWarmingPotential;
    private double emissionInKiloTonnes;

    public GreenHouseGas(String gasName, double globalWarmingPotential, double emissionInKiloTonnes) {
        this.gasName = gasName;
        this.globalWarmingPotential = globalWarmingPotential;
        this.emissionInKiloTonnes = emissionInKiloTonnes;
    }

    public double calculateEquivalent(){
        return globalWarmingPotential * emissionInKiloTonnes;
    }

    public String toString(){
        return emissionInKiloTonnes + " kilo tonnes " + gasName + " is " + calculateEquivalent() + " kilo tonnes in CO2";
    }
}
