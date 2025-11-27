package School_Projects.Assignments.airport_tax;

import static taxesandfees.Tax.*;
//fordi vi bruker static så kan vi accesse Tax selv om den
// er private. Om den er public skriver vi:
// import taxesandfees.Tax;

public class Main {
    public static void main(String[]args){
        double passengerFee = getPassengerFee();
        System.out.println(passengerFee);
        System.out.println("YEPSI Pepsi");

        //Tax tax = new Tax();
        //hvis man gjør det over så skriver man med liten t i
        //taxen, ellers ville det bli skrevet:
        //double VAT = Tax.computeVAT(); istedenfor

        double VAT = computeVAT(10_000);
        System.out.println(VAT);
    }


}
