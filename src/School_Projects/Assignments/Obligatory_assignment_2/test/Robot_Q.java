package School_Projects.Assignments.Obligatory_assignment_2.test;

public class Robot_Q {
    private String nameQ = "QUARTS";
    private double batteryLevelQ = 80.0;
    private double distanceToParkQ = 1500.0;
    private double distanceToDanceClub = 500.0;
    private String botTypeQ = "Sprinter-BOT"; //er rask men, bruker fortere opp batteri


    public String reportStatusQ(String nameQ, Double batteryLevelQ, Double distanceToParkQ, String botTypeQ, Double distanceToDanceClub) {
        this.nameQ = nameQ;
        this.batteryLevelQ = batteryLevelQ;
        this.distanceToParkQ = distanceToParkQ;
        this.botTypeQ = botTypeQ;
        this.distanceToDanceClub = distanceToDanceClub;


        System.out.println("\nROBOT STATUS: "
        + "\nName: " + nameQ + "\nBattery-Level: " + batteryLevelQ + "\nBot-Type: " + botTypeQ);
        System.out.println("\n" + nameQ + " er en " + botTypeQ + "."
                + "\nDen har for øyeblikket " + batteryLevelQ + " batterikapasitet, og bor " +
                distanceToParkQ + " meter fra parken." +
                "\nThe robot is also " + distanceToDanceClub + " meters away from the Dance Club.");

        return "";}

    public boolean canWalkToThePark(World world) {
        if (world.isSunday()) {
            System.out.println("\nSince its Sunday, " + nameQ + " is checking if its possible to go to the park!");

            if (world.getIsRaining()) {
                System.out.println("\nYou cannot access the park today." +
                        "\nWhen it rains the robot cannot venture outside." +
                        "\nThis is due to the lack of rain protection.");

                return false;
            } else if (world.getIsWindy()) {
                System.out.println("\nYou cannot access the park today." +
                        "\nWhen it is too windy this robot flies away" +
                        "\nIt is too light.");

                return false;
            } else if () {
                double robotDistance = this.batteryLevelQ * 100;
                double parkBackAndForth = this.distanceToParkQ * 2;
                if (robotDistance >= this.distanceToParkQ){
                    System.out.println("\nThe Robot, " + nameQ + " has enough battery to go to the park!");
                } else if (robotDistance >= parkBackAndForth) {
                    System.out.println("\nThe Robot has enough battery to go back and forth to the park.");
                } else {
                    System.out.println("\nThe Robot " + nameQ + " does not have enough battery to go to the park.");
                }
            } else {
                System.out.println("\nIt is not raining nor is it windy today!");
            }

            return true;
        }

    }
    public boolean canDanceAtClub(World world){
        if (!world.isMonday()) {
            System.out.println("\nSince it is not Monday, the Dance-Club is open!" +
                                nameQ + "\n is checking if it is possible to go dancing today.");

            if (world.getIsRaining()) {
                System.out.println("\nYou cannot access the Dance-park today." +
                        "\nWhen it rains the robot cannot venture outside." +
                        "\nThis is due to the lack of rain protection.");

                return false;
            } else if (world.getIsWindy()) {
                System.out.println("\nYou cannot access the Dance-club today." +
                        "\nWhen it is too windy this robot flies away" +
                        "\nIt is too light.");

                return false;
            } else if () {
                double robotDistance = this.batteryLevelQ * 100;
                double robotDanceTime = this.batteryLevelQ / 60.0;

                if (robotDistance >= this.distanceToDanceClub){
                    System.out.println("\nThe Robot, " + nameQ + " has enough battery to go to the Dance Club!"
                                        + "\nThe Robot can go to the Dance Club for " + robotDanceTime +
                                            " minutes before it rund out of battery");
                } else {
                    System.out.println("\nThe Robot " + nameQ + " does not have enough battery to go to the Dance Club.");
                }
            } else {
                System.out.println("\nIt is not raining nor is it windy today!");
                System.out.println("\nYou can go to the Dance-Club Today!");
            }

            return true;
        }

    }
    }
    // lag en metode som heter canDanceAtClub, som sjekker om boten kan være med på danseklubben
       // bottypen må være av type B-Bot (hint .equals)
       // En bot trenger minimum 50% batterikapasitet for å være med
       // Det kan ikke være mandag. Da er danseklubben stengt.
}
