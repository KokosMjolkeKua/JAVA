package School_Projects.Assignments.Obligatory_assignment_2.Result;

public class World {
    private boolean isRaining;
    private int day;

    public World(int day, boolean isRaining) {
        this.day = day;
        this.isRaining = isRaining;

        System.out.println("In this world, it is " + getDayName(this.day) + " today and the weather is " + (isRaining ? " raining." : " clear."));
    }

    public boolean isSunday() {
        return this.day % 7 == 0;
    }

    public boolean getIsRaining() {
        return this.isRaining;}

    public int getDay() {
        return this.day;}

    public String getDayName(int day) {
        int d = day % 7;

        switch (d) {
            case 0 -> {
                return "Monday";
            }
            case 1 -> {
                return "Tuesday";
            }
            case 2 -> {
                return "Wednesday";
            }
            case 3 -> {
                return "Thursday";
            }
            case 4 -> {
                return "Friday";
            }
            case 5 -> {
                return "Saturday";
            }
            case 6 -> {
                return "Sunday";
            }
        }
    return "";}
}
