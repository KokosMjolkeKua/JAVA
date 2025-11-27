package School_Projects.Lectures_and_notes.DEMO_Classes.Løkker;

public class Oppgave {
    public static void main(String[]args){

        //printe ut alle tall fra 0 - 100
        //hvis tallet er delelig på 3 og 5, print ut fizz buzz
        //Hvis taller er delelig på 3; print ut fizz
        //hvis tallet er delelig på 5; print ut buzz
        for (int i = 1; i <= 100; i ++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("Fizz Buzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            }
            System.out.println(i);
        }

        int tall = 0;
        while (tall == 0){
            System.out.println(tall);
        }
    }
}
