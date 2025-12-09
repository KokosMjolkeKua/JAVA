package School_Projects.Exam_practice.Previous_Exams.Trial_Exam_24.Oppg_1;

public class Investigate {

    public void investigateStringArray(String[] strings){
        int charAmount = 0;
        int nullAmount = 0;
        for(String s: strings){
            if(s.contains("a")){
                System.out.println(s + " Inneholder bokstaven a!");
            }
            charAmount = s.length() + charAmount;

            if(s.contains(" ")){
                nullAmount++;
            }
        }
        System.out.println("Antall bokstaver i denne stringen er: " + charAmount);
        System.out.println("Antall null verdier: " + nullAmount);
    }
}
