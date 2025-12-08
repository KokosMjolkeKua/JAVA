package School_Projects.Exam_practice.Obligatory_Assignments;

public class World {
    private boolean isRaining;
    private int day;

    public World(int day, boolean isRaining) {
        this.day = day;
        this.isRaining = isRaining;
    }

    public boolean isSunday() {
        return day % 7 == 0;
    }

    public boolean getIsRaining() {return this.isRaining;}

    public int getDay() {
        int getDay = day % 7;

        switch(getDay){
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                break;
        }

        return getDay;
    }
}
