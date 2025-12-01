package School_Projects.Exam_practice.Module_one;

public class Pizza_recipe {
    public static void main(String[]args){
        int time = 14;
        int degrees = 230;
        String text;

        text = "\nPreheat the oven to " + degrees + " degrees." +
                "\nTake the pizza out of the foil." +
                "\nPut the Pizza in the oven." +
                "\nWait " + time + " minutes..." +
                "\nTake the Pizza out of the oven." +
                "\nEat the Pizza!";

        System.out.println(text);
    }
}
