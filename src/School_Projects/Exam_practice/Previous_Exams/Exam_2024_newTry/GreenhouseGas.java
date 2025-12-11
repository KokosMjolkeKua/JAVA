package School_Projects.Exam_practice.Previous_Exams.Exam_2024_newTry;

public class GreenhouseGas {
    private String gasName;
    private double globalWarmingPotential;
    private double emissionKiloTonne;

    public GreenhouseGas(String gasName, double globalWarmingPotentional, double emissionKiloTonne) {
        this.gasName = gasName;
        this.globalWarmingPotential = globalWarmingPotentional;
        this.emissionKiloTonne = emissionKiloTonne;
    }

    public double calculateEquivalent(){
        return globalWarmingPotential * emissionKiloTonne;
    }

    public String toString(){
        return emissionKiloTonne + " kilotonn " + gasName +
                " tilsvarer " + calculateEquivalent() + " kilotonn CO^2.";
    }
}
