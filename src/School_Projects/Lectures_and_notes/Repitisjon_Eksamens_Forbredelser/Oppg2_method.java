package School_Projects.Lectures_and_notes.Repitisjon_Eksamens_Forbredelser;

public class Oppg2_method {

    public static String findMonthByNumber(int mnd) {
        if (mnd < 13 && mnd > 0){
            String month = switch (mnd) {
                case 1 -> "Januar";
                case 2 -> "Februar";
                case 3 -> "Mars";
                case 4 -> "April";
                case 5 -> "Mai";
                case 6 -> "Juni";
                case 7 -> "Juli";
                case 8 -> "August";
                case 9 -> "September";
                case 10 -> "Oktober";
                case 11 -> "November";
                case 12 -> "Desember";
                default -> "Feil";
            }; return month;
        } else {
            return "Dette er ikke ett Månedsnummer";
        }
    }

    public static String findMonthByNumberArray (int i){
        String[] months = {"Ingen måned", "Januar", "Februar", "Mars", "April",
                "Mai", "Juni", "Juli", "August", "September",
                "Oktober", "November", "Desember"};

        if (i < 0 || i >= months.length){
            i = 0;
        }

        return months[i];
    }
}