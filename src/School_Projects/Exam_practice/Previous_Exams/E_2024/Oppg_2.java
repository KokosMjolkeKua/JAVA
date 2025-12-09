package School_Projects.Exam_practice.Previous_Exams.E_2024;

public class Oppg_2 {

    public static double Oppg_2(String numerator, String denominator) {
        double print = 0;
        int d1;
        int d2;
        try{
            d1 = Integer.parseInt(numerator);
            d2 = Integer.parseInt(denominator);

            if(d1 < 0 || d2 < 0){
                System.out.println("\nThe numbers must be equals to, or above 0.");
            }
            else{
                print = d1 / d2;
                System.out.println("\n" + d1 + " divided by " + d2 + " equals " + print);
            }
        }
        catch(Exception e){
            d1 = 0;
            d2 = 0;
            System.out.println("\nYou must write whole numbers.");
        }
        return print;
    }
}
