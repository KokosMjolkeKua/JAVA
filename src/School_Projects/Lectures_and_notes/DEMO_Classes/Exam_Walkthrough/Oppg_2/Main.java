package School_Projects.Lectures_and_notes.DEMO_Classes.Exam_Walkthrough.Oppg_2;

public class Main {
    public static void main(String[]args){


        Investigate_Two test = new Investigate_Two();
        test.checkNumber("3", "2");

        Investigate_Two testTwo = new Investigate_Two();

        System.out.println(testTwo.divideBy("3", "2"));
        System.out.println(testTwo.divideBy("3", "tre"));

    }
}
