package School_Projects.Exam_practice.Previous_Exams.Exam_2024_newTry;

public class O_2 {
    private int teller;
    private int nevner;

    //b)
    //Du kan bruke en statisk metode
    //når man bruker en statisk metode i denne sammenhengen vil man kunne kalle
    //på klassen uten å måtte opprette ett object.

    //c)
    //Om metoden er privat eller public har noe med hvem sok har tilgang på den
    //informasjonen og om den kan endres eller ikke.
    //f eks. variablene teller og nevner i dette tilfelle kan ikke endres i main fordi
    //fordi de er private. så når man oppretter ett object med de variablene vil de
    //ikke kunne endres.

    public double O_2(String teller, String nevner){
        int t;
        int n;
        double sum = -1;
        try{
            t = Integer.parseInt(teller);
            n = Integer.parseInt(nevner);

            if(t > 0 && n > 0){
                this.teller = t;
                this.nevner = n;

                sum = (double) t / n;
                String sum2Dec = String.format("%.2f", sum);
                sum = Double.parseDouble(sum2Dec);
                //Omgjør den til bare 2 decimaler så den ikke gir alt for mange.
            }
        }
        catch(Exception e){
            t = 0;
            n = 0;
        }

        return sum;
    }
}
