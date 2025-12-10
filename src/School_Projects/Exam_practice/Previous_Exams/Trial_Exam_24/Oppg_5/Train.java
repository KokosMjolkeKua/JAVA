package School_Projects.Exam_practice.Previous_Exams.Trial_Exam_24.Oppg_5;

public class Train implements Transport{
    public double TrainCostPerMeter = 0.01;
    public double TrainMinPerKM = 0.5;

    @Override
    public double calculateCosts(double distance) {
        return this.TrainCostPerMeter * distance;
    }

    @Override
    public double calculateTime(int distanceKM, int minutesTillNextTransport) {
        double finalTime = 0.0;
        if(distanceKM > minutesTillNextTransport){
            System.out.println("Det tar raskere tid å ta Toget!");
            finalTime = (this.TrainMinPerKM * distanceKM) - minutesTillNextTransport;
        }
        if(distanceKM < minutesTillNextTransport){
            System.out.println("Det tar lenger tid å ta Taxi!");
            finalTime = minutesTillNextTransport - (this.TrainMinPerKM * distanceKM);
        }
        if((this.TrainMinPerKM * distanceKM) == minutesTillNextTransport){
            System.out.println("Det tar like lang tid å vente på Taxi som å ta Toget");
            finalTime = minutesTillNextTransport;
        }
        return finalTime;
    }
}
