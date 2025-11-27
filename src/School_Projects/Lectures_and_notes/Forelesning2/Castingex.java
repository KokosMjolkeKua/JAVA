package School_Projects.Lectures_and_notes.Forelesning2;

public class Castingex {
    public static void main(String[] args) {
        // må få fjerne denne dritt skrivinga

        // int integer1 = 5;
        //long veryLargeInteger = integer1;
        // System.out.println(integer1);
        // System.out.println(veryLargeInteger);


        //integer1 = (int)veryLargeInteger; // dette funker ikke fordi long er større enn int, funker bare på widening ikke narrowing
        // System.out.println(integer1);

        //double doubleNr1 = 6.18;
        // int integerNr1 = (int)doubleNr1; //går fra decimal til heltall, kan ikke ha decimaler

        // System.out.println(doubleNr1);
        // System.out.println(integerNr1);


        //long veryBigInteger = Long.MAX_VALUE;
        //float decimalNumber = veryBigInteger; // dette funker fordi float er større enn long
        // System.out.println(veryBigInteger);
        // System.out.println(decimalNumber);
        //hvorfor er det komma? (E18 betyr at det er 18 nuller etter 2.3) så det er fordi float ikke har plass til alle tallene i long
        // godt til å vite om vi får feil tall men alt annet funker


        double nrOfBread;
        int doughDL = 10;
        double doughDLPerBread = 3.3; //rundefeil blir gjort når vi gjør int / double
        //int doughDLPerBread = 3; //rundefeil blir ikke gjort
        nrOfBread = (double) doughDL / (double) doughDLPerBread;
        double doughDLLeftover = doughDL % doughDLPerBread;

        System.out.println(nrOfBread);
        System.out.println(doughDLLeftover); //ble riktig, men kan gå galt hvis vi ikke caster til double
    }
}
