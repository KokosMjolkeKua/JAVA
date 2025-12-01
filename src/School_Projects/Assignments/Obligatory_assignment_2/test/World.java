package School_Projects.Assignments.Obligatory_assignment_2.test;

public class World {
    private boolean isRaining;
    private boolean isWindy;
    private int day;// 1 er Mandag, 2 er Tirsdag, ..., 7 for Søndag, 8 er Mandag...

    public World(int day, boolean isRaining, boolean isWindy) {
        this.day = day;
        this.isRaining = isRaining;
        this.isWindy = isWindy;

    }

    public boolean isSunday() {
         return day % 7 == 0;
    }
    public boolean isMonday(){
        return false;
    }

    public boolean getIsRaining() {return this.isRaining;}

    public boolean getIsWindy() {return this.isWindy;}

    public int getDay() {return this.day;}

}

//import java.time.LocalDate;
//import java.time.DayOfWeek;
//
//public boolean isSunday() {
//    DayOfWeek today = LocalDate.now().getDayOfWeek();
//    return today == DayOfWeek.SUNDAY;
//}

//dette er for å finne ut hvilken dag det er idag