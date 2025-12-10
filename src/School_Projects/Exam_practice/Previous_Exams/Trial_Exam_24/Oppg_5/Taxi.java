package School_Projects.Exam_practice.Previous_Exams.Trial_Exam_24.Oppg_5;

public class Taxi implements Transport{
    public double taxiCostPerMeter = 0.05;
    public double TaxiMinPerMeter = 1;

    @Override
    public double calculateCosts(double distanceMeter) {
        return (this.taxiCostPerMeter * distanceMeter) + 50;
    }

    @Override
    public double calculateTime(int distanceKM, int minutesTillNextTransport) {
        double finalTime = 0.0;
        if((0.5 * distanceKM) > minutesTillNextTransport){
            System.out.println("Det tar raskere tid å ta Taxi!");
            finalTime = (this.TaxiMinPerMeter * distanceKM) - minutesTillNextTransport;
        }
        if((0.5 * distanceKM) > minutesTillNextTransport){
            System.out.println("Det tar lenger tid å ta Toget!");
            finalTime = minutesTillNextTransport - (this.TaxiMinPerMeter * distanceKM);
        }
        if((this.TaxiMinPerMeter * distanceKM) == minutesTillNextTransport){
            System.out.println("Det tar like lang tid å vente på Toget som å ta Taxi");
            finalTime = minutesTillNextTransport;
        }
        return finalTime;
    }
}
