package School_Projects.Exam_practice.Previous_Exams.Trial_2024_Again;

public class Train implements Transport{
    public double trainCostPerMeter = 0.05;
    public double meterPerMin = 2000;
    public double minTilNextTrain = 30;

    @Override
    public double calculateCost(int distance) {
        return distance * trainCostPerMeter;
    }

    @Override
    public double calculateTime(int distance, int minutesTilNextTransport) {


        return 0;
    }
}
