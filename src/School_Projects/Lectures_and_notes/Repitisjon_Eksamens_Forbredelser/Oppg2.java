package School_Projects.Lectures_and_notes.Repitisjon_Eksamens_Forbredelser;

public class Oppg2 {
    public static void main(String[]args){
        String monthOutput1 = Oppg2_method.findMonthByNumber(2);
        String monthOutput2 = Oppg2_method.findMonthByNumber(6);
        String monthOutput3 = Oppg2_method.findMonthByNumber(13);

        System.out.println(monthOutput1);
        System.out.println(monthOutput2);
        System.out.println(monthOutput3);


        String output1 = Oppg2_method.findMonthByNumberArray(2);
        String output2 = Oppg2_method.findMonthByNumberArray(5);
        String output3 = Oppg2_method.findMonthByNumberArray(-2);

        System.out.println(output1);
        System.out.println(output2);
        System.out.println(output3);

    }
}
