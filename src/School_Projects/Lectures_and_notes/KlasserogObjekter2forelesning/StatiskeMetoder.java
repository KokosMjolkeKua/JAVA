package School_Projects.Lectures_and_notes.KlasserogObjekter2forelesning;

public class StatiskeMetoder {
    private static double PASSENGER_FEE = 60;

    public static double computeVAT(double netPrice){
        return netPrice * 0.25;
    }

    public static double getPassengerFee(){
        return PASSENGER_FEE;
    }
}
//metoden bruker statiske attributter