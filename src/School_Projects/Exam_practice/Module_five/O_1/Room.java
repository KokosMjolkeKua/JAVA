package School_Projects.Exam_practice.Module_five.O_1;

public class Room {
    private String name;
    private double length;
    private double width;
    double areal;

    public Room(String name, double length, double width) {
        this.name = name;
        this.length = length;
        this.width = width;

        double arealTwoDec = length * width;
        String areal = String.format("%.2f", arealTwoDec);

        this.areal = Double.parseDouble(areal);
    }

    @Override
    public String toString() {
        return "Room: " + name +
                "\nLength: " + length +
                "\nWidth: " + width +
                "\nAreal: " + areal;
    }
}
