package School_Projects.Lectures_and_notes.OppgaverKlasserOgObjekter;
import java.util.Scanner;
public class LoopExample {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            boolean continueProgram = true;

            while (continueProgram) {
                System.out.println("This is a part of the program that will loop.");
                System.out.print("Do you want to run it again? (yes/no): ");
                String input = scanner.nextLine();

                if (input.equalsIgnoreCase("no")) {
                    continueProgram = false;
                }
            }
            System.out.println("Program finished.");
            scanner.close();
        }
    }

