package School_Projects.Exam_practice.Module_two;

public class Variables {
    public static void main(String[]args){
        String textVariabel = "2";
        int tallPlusOgMinus;
        double decimaltall;
        long langtTall;
        short kortTall;

        String textVariabelDecimal = "2.343";

        //for å gjøre om tekst til tall
        int textTall = Integer.parseInt(textVariabel);

        String tallText = String.valueOf(textTall);

        System.out.println(tallText + " " + textTall);

        double textTallDouble = Double.parseDouble(textVariabelDecimal);

        System.out.println(textTallDouble);



        String navn;
        navn = "Per Olsen";
        String tall = "23";
        String spesialtegn = " £€∞§|[©≈] ";
        String norskeTegn = "æøå ÆØÅ";
        String blankStreng = "  ";
        String nyLinje = "\n";
        String navnOgAdresse = "Per Olsen \n Osloveien 82";

        System.out.println("\nNavn: " + navn +
                "\nÅr: " + tall +
                "\nSpesial Tegn: " + spesialtegn +
                "\nNorske Tegn: " + norskeTegn +
                "\nNavn å adresse: " + navnOgAdresse);


        //Forskjellige type VARIABLER/Input
//
//        int: tall som er hele
//        double: decimaltall
//        float: veldig store tall (3.402823 × 10-38 3.402823 × 1038)
//        boolean: true eller false
//        byte: tall mellom -128 til +127
//        short: tall mellom -32.768 og + 32.767
//        long: tall mellom -2^63 og + 2^63-1
//        char: kun! ett tegn!
//


    }
}
