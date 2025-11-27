package School_Projects.Assignments.Obligatory_assignment_2.testtwo;

public class Main {
    public static void main(String[] args) {

        World todaysWorld = new World(6, false);

        Robot bot1 = new Robot("QUBERT", 35, 1500, "B-bot");
        Robot bot2 = new Robot("EVA", 65, 2307, "Z-bot");
        Robot bot3 = new Robot("DanceTron-4000", 75, 3300, "B-bot");

        Robot[] bots = {bot1, bot2, bot3};

        for (Robot bot : bots) {
            bot.reportStatus();
            bot.canWalkToThePark(todaysWorld);
            bot.canDanceAtClub(todaysWorld);
            bot.performTask("clean");
            bot.reportStatus();
            bot.chargeBattery();
            bot.reportStatus();
        }

        // Simuler dårlig vær
        todaysWorld.setIsRaining(true);
        System.out.println("\nWeather changed: Now it's raining.");

        for (Robot bot : bots) {
            bot.canWalkToThePark(todaysWorld);
        }
    }
}
