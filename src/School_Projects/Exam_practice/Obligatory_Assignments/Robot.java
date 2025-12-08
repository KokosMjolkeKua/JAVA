package School_Projects.Exam_practice.Obligatory_Assignments;

public class Robot {
    private String name;
    private double batteryLevel;
    private int distanceToPark;
    private String botType;

    public Robot(String name, double batteryLevel, int distanceToPark, String botType) {
        this.name = name;
        this.batteryLevel = batteryLevel;
        this.distanceToPark = distanceToPark;
        this.botType = botType;
    }

    public String reportStatus() {
        String text = "ROBOT STATUS: " +
                "\nThis is bot " + name + ", Bot-type " + botType +
                "\nThis unit has " + batteryLevel + "% battery-capacity left." +
                "\nThis unit currently resides " + distanceToPark + " meters from the park.";
        return text;}

    public boolean canWalkToThePark(World world) {
        System.out.println("\n" + name + " is currently checking if it can go to the park...");
        double batteryNeeded = batteryLevel * 100;

        if(world.isSunday()){
            System.out.println(name + " can go to the park today since it is sunday." +
                    "\nThe park can only be visited on a sunday.");
            if (!world.getIsRaining()) {
                System.out.println(name + " can currently go to the park." +
                        "\nSince it is not raining!");
            }
            if(batteryNeeded >= distanceToPark){
                System.out.println(name + " also has enough battery to go to the park!");
            }
            return true;
        }

        else{
            if(!world.isSunday()){
                System.out.println("It is not sunday, so you cannot visit the park.");
            }
            if(batteryNeeded < distanceToPark){
                System.out.println(name + " does not have enough battery to go to the park.");
            }
            if (world.getIsRaining()) {
                System.out.println(name + " can currently not go to the park." +
                        "\nThis is due to the rain.");
            }
            return false;
        }
    }

    public boolean canDanceAtClub(World world){
        if(botType.equals("B-bot")){
            System.out.println(name + " has the correct bot type.");
            if(batteryLevel >= 50){
                System.out.println(name + " has enough battery to go to the dance club!");
                if(!(world.getDay() == 1)){
                    System.out.println(name + " can go to the dance-club today because it is not a Monday!");
                    return true;
                }
            }
        }
        else{
            if(!botType.equals("B-bot")){
                //I want to have it instead of always printing that the
                // bot-type is incorrect to specify what the problem of
                // the bot is.
                System.out.println(name + " does not have the correct bot-type...");
            }
            if(batteryLevel < 50){
                System.out.println(name + " does not have enough battery to go to the dance club...");
            }
            if(world.getDay() == 1){
                System.out.println(name + " cannot go to the dance-club today because they are closed on mondays...");
            }
        }
        return false;
    }

}
