package School_Projects.Lectures_and_notes.DEMO_Classes.Exam_Walkthrough.Oppg_4;

public class GreenhouseGas {

    private String gas;
    private double globalWarmingPotential;
    private double emissionInKiloTonne;

    public GreenhouseGas(String gas, double globalWarmingPotential, double emissionInKiloTonne) {
        this.gas = gas;
        this.globalWarmingPotential = globalWarmingPotential;
        this.emissionInKiloTonne = emissionInKiloTonne;
    }

    public double calculateEmission(){
        double CO2Emission = globalWarmingPotential * emissionInKiloTonne;

        return CO2Emission;
    }

    @Override
    public String toString() {
        String gasInput = this.gas.toLowerCase();
        switch(gasInput){
            case "co2":
                System.out.println("An emission of " + emissionInKiloTonne + " kiloTonne CO2, equals to " + emissionInKiloTonne + " CO2.");
                break;
            case "ch4":
                System.out.println("An emission of " + emissionInKiloTonne + " kiloTonne CH4, equals to " + (25 * emissionInKiloTonne) + " CO2.");
                break;
            case "n2o":
                System.out.println("An emission of " + emissionInKiloTonne + " kiloTonne N2O, equals to " + (298 * emissionInKiloTonne) + " CO2.");
                break;
            default:
                System.out.println("Invalid Input");
                break;
        }

        return gasInput;
    }


}
