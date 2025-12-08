package School_Projects.Exam_practice.Obligatory_Assignments;

public class Main {
    public static void main(String[] args) {
        // Oppretter en Verden-objekt (omgivelsene)
        World todaysWorld = new World(122, false);
        todaysWorld.getDay();

        Robot Boxy = new Robot("Boxy", 53.4, 1100, "B-Bot");
        Boxy.reportStatus();
        Boxy.canWalkToThePark(todaysWorld);
        Boxy.canDanceAtClub(todaysWorld);

        Robot D = new Robot("Dancatron 4000", 35.3, 800, "B-bot");
        D.reportStatus();
        D.canWalkToThePark(todaysWorld);
        D.canDanceAtClub(todaysWorld);

        Robot S = new Robot("Spark-E", 65.8, 1030, "Toaster");
        S.reportStatus();
        S.canWalkToThePark(todaysWorld);
        S.canDanceAtClub(todaysWorld);

    }
}
