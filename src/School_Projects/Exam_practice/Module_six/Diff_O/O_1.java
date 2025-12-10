package School_Projects.Exam_practice.Module_six.Diff_O;

import static javax.swing.JOptionPane.*;

public class O_1 {
    public static void main(String[]args){

        double piB = 3.14159265358;
        String pi6Dec = String.format("%.6f", piB);
        System.out.println("Pi: " + piB +
                "\nPi med seks desimaler: " + pi6Dec);

        int nummer = Integer.parseInt(showInputDialog("Skriv inn et heltall for antall :"));
        double pi=4;
        int fortegn=-1;
        for (long i=3;i<nummer;i+=2) {
            pi+=fortegn*(4/(double)i);
            fortegn = -fortegn;
        }
        showMessageDialog(null,"PI skal være 3.14159265358.\n Blir : "+pi);

    }
}


//Oppgave 1
//Beregn Pi med 6 desimalers nøyaktighet. Pi er et tall med et uendelig antall desimaler. Pi med 11desimaler er 3.14159265358.
//Bruk en løkke til å beregne pi ved hjelp av denne rekken:
//Pi=4 - 4/3 + 4/5 - 4/7 + 4/9 - 4/11+....