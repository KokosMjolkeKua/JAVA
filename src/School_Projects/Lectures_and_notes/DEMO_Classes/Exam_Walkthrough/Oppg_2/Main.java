package School_Projects.Lectures_and_notes.DEMO_Classes.Exam_Walkthrough.Oppg_2;

public class Main {
    public static void main(String[]args){


        Investigate_Two test = new Investigate_Two();
        test.checkNumber("3", "2");

        Investigate_Two testTwo = new Investigate_Two();

        System.out.println("\n" + testTwo.divideBy("3", "2"));
        System.out.println(testTwo.divideBy("3", "tre"));

        test.name = "Sofia";
        testTwo.name = "Ida";

        System.out.println("\n" + test.name);
        System.out.println(testTwo.name);

        test.nameTest = "Sofia";
        testTwo.nameTest = "Ida";

        System.out.println("\n" + test.nameTest);
        System.out.println(testTwo.nameTest);
    }
}
