package School_Projects.Exam_practice.Repetittion;

public class Oppg_2_trial_2 {

    public static String checkMonth(int number){
        switch(number){
            case 0: return "January";
            case 1: return "Februar";
            case 2: return "Mars";
            case 3: return "April";
            case 4: return "Mai";
            case 5: return "Juni";
            case 6: return "Juli";
            case 7: return "August";
            case 8: return "September";
            case 9: return "Oktober";
            case 10: return "November";
            case 11: return "December";
            default: return "Ingen Måned";
        }
    }

    public static void main(String[]args){

        System.out.println("Måneden for dette taller er " + Oppg_2_trial_2.checkMonth(3));
    }
}
