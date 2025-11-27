package School_Projects.Assignments.Obligatory_assignment_2.testtwo;

public class Robot {
    private String name;
    private double batteryLevel;
    private int distanceToPark;
    private final String botType;  // Typen skal ikke endres

    // Konstruktør
    public Robot(String name, double batteryLevel, int distanceToPark, String botType) {
        setName(name);
        setBatteryLevel(batteryLevel);
        setDistanceToPark(distanceToPark);
        this.botType = botType;
    }

    // Getters
    public String getName() { return name; }
    public double getBatteryLevel() { return batteryLevel; }
    public int getDistanceToPark() { return distanceToPark; }
    public String getBotType() { return botType; }

    // Setters (med validering)
    public void setName(String name) {
        if (name != null && !name.isBlank()) {
            this.name = name;
        }
    }

    public void setBatteryLevel(double batteryLevel) {
        if (batteryLevel >= 0 && batteryLevel <= 100) {
            this.batteryLevel = batteryLevel;
        }
    }

    public void setDistanceToPark(int distanceToPark) {
        if (distanceToPark >= 0) {
            this.distanceToPark = distanceToPark;
        }
    }

    public void reportStatus() {
        System.out.println("\nBot Name: " + name +
                "\nBot-Type: " + botType +
                "\nBattery-level: " + batteryLevel + "%" +
                "\nDistance to the park: " + distanceToPark + " meters");
    }

    public boolean canWalkToThePark(World world) {
        if (world.getDay() != 6) {
            System.out.println("\n" + name + " cannot go to the park today.");
            return false;
        }
        if (world.getIsRaining()) {
            System.out.println("\n" + name + " cannot go to the park because it is raining.");
            return false;
        }


        int batteryNeeded = distanceToPark / 100;  // F.eks. 1500m = 15%
        if (batteryLevel < batteryNeeded) {
            System.out.println("\n" + name + " does not have enough battery to go to the park.");
            return false;
        }

        batteryLevel -= batteryNeeded;
        System.out.println("\n" + name + " went to the park and used " + batteryNeeded + "% battery.");
        return true;
    }

    public boolean canDanceAtClub(World world) {
        if (botType.equals("B-bot") && batteryLevel >= 10 && world.getDay() != 1) {
            batteryLevel -= 10;
            System.out.println(name + " danced at the club and used 10% battery.");
            return true;
        } else {
            System.out.println(name + " cannot dance at the club.");
            return false;
        }
    }

    public void chargeBattery() {
        System.out.println(name + " is charging...");
        batteryLevel = 100;
    }

    public void performTask(String task) {
        switch (task.toLowerCase()) {
            case "clean":
                if (batteryLevel >= 5) {
                    batteryLevel -= 5;
                    System.out.println(name + " cleaned and used 5% battery.");
                } else {
                    System.out.println(name + " does not have enough battery to clean.");
                }
                break;
            case "guard":
                if (batteryLevel >= 15) {
                    batteryLevel -= 15;
                    System.out.println(name + " performed guard duty and used 15% battery.");
                } else {
                    System.out.println(name + " cannot guard due to low battery.");
                }
                break;
            default:
                System.out.println(name + " does not recognize the task.");
        }
    }
}
