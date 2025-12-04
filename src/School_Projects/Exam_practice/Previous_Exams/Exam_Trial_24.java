package School_Projects.Exam_practice.Previous_Exams;

public class Exam_Trial_24 {

    public void investigateStringArray(String[] strings){
        for(String s: strings){
            System.out.println(s);
        }

        for(String a: strings){
            if(a != null && a.contains("a")){
                System.out.println(a);
            }
            else{
                System.out.println("Does not contain a.");
            }
        }

        int totalChars = 0;
        for(String c: strings){
            if(c != null){
                totalChars += c.length();
            }
        }
        System.out.println("Total Chars: " + totalChars);

        int nullCount = 0;
        for(String n: strings){
            if(n == null){
                nullCount ++;
            }
        }
        System.out.println("Total nulls:" + nullCount);
    }
}
