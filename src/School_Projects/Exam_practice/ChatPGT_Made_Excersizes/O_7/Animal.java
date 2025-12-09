package School_Projects.Exam_practice.ChatPGT_Made_Excersizes.O_7;

public class Animal {
    private String type;
    private String name;
    private double weight;
    private double height;

    public Animal(String type, String name, double weight, double height) {
        this.type = type;
        this.name = name;
        this.weight = weight;
        this.height = height;
    }

    public String makeSound(){
        return "Sound...";
    }

    @Override
    public String toString() {
        return "Animal Library: " +
                "\nType: " + type +
                "\nName: " + name +
                "\nWeight: " + weight +
                "\nHeight: " + height;
    }
}
