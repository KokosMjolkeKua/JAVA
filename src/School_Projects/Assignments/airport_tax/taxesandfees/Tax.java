package School_Projects.Assignments.airport_tax.taxesandfees;

public class Tax {
//hvis man ikke setter public så kan ikke andre pakker
// enn taxes and fees bruke denne classen.
    private static double PASSENGER_FEE = 60;
    private static double VAT_RATE = 0.25;

    private Tax (){ //på grunn av denne kan du ikke bruke TAX veriden

    }

    public static double getPassengerFee(){
        return PASSENGER_FEE;
    }

    public static double computeVAT(double netPrice){
        double VAT = netPrice * VAT_RATE;
        return VAT;
    }
}
