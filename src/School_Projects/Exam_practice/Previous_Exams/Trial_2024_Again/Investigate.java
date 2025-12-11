package School_Projects.Exam_practice.Previous_Exams.Trial_2024_Again;

public class Investigate {

    public void investigateStringArray(String[] strings){
        int amountChar = 0;
        int nullAmount = 0;

        for(String s: strings){
            if(s == null){
                nullAmount++;
            }
            else{
                if(s.contains("a")){
                    System.out.println(s + " inneholder bokstaven a.");
                }
                amountChar = amountChar + s.length();
            }
        }

        System.out.println("String Arrayet inneholder " + amountChar + " tegn.");
        System.out.println("String Arrayet inneholder " + nullAmount + " null verdier.");


    }
}
