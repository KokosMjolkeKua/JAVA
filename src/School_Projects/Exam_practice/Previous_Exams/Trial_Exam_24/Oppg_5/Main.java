package School_Projects.Exam_practice.Previous_Exams.Trial_Exam_24.Oppg_5;

public class Main {
    public static void main(String[]args){

        Taxi rob = new Taxi();
        System.out.println("Costs: " + rob.calculateCosts(2300));
        rob.calculateTime(23, 30);

        Train rickie = new Train();
        System.out.println("Costs: " + rickie.calculateCosts(2300));
        rickie.calculateTime(23, 5);


        rob.calculateTime(1, 30);
        rob.calculateTime(5, 30);
        rob.calculateTime(50, 30);

        rickie.calculateTime(1, 5);
        rickie.calculateTime(5, 5);
        rickie.calculateTime(50, 5);
    }
}
