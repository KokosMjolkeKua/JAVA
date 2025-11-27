package School_Projects.Lectures_and_notes.Forelesning2;

import java.util.Scanner;

public class KalkulatorTest {
    public static void main(String[] args) {

        int store1, store2, store3, store4, store5;
        String answer;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("This program will display a bar chart " +
                " comprised of astericks based on five different stores' " +
                "sales today. 1 asterick = $100 in sales.");

        System.out.println("Would you like to use the program? "
                + "type 'Y' for yes or 'N' to exit the program.");
        answer = keyboard.nextLine();

        if(answer.equalsIgnoreCase("Y"))
        {
            System.out.print("Enter today's sales for store 1: ");
            store1 = keyboard.nextInt();
            while(store1 < 0)
            {
                System.out.println("Error! Sales cannot be less than 0.");
                System.out.print("Enter today's sales for store 1: ");
                store1 = keyboard.nextInt();
            }

            System.out.print("Enter today's sales for store 2: ");
            store2 = keyboard.nextInt();
            while(store2 < 0)
            {
                System.out.println("Error! Sales cannot be less than 0.");
                System.out.print("Enter today's sales for store 2: ");
                store2 = keyboard.nextInt();
            }

            System.out.print("Enter today's sales for store 3: ");
            store3 = keyboard.nextInt();
            while(store3 < 0)
            {
                System.out.println("Error! Sales cannot be less than 0.");
                System.out.print("Enter today's sales for store 3: ");
                store3 = keyboard.nextInt();
            }

            System.out.print("Enter today's sales for store 4: ");
            store4 = keyboard.nextInt();
            while(store4 < 0)
            {
                System.out.println("Error! Sales cannot be less than 0.");
                System.out.print("Enter today's sales for store 4: ");
                store4 = keyboard.nextInt();
            }

            System.out.print("Enter today's sales for store 5: ");
            store5 = keyboard.nextInt();
            while(store5 < 0)
            {
                System.out.println("Error! Sales cannot be less than 0.");
                System.out.print("Enter today's sales for store 5: ");
                store5 = keyboard.nextInt();
            }

            System.out.println("Sales \t Bar Chart");
            System.out.println("----- \t --------------------------");

            System.out.print("Store 1: ");
            for (int num = 0; num < store1; num += 100)
            {
                System.out.print("*");
            }

            System.out.print("\nStore 2: ");
            for (int num = 0; num < store2; num += 100)
            {
                System.out.print("*");
            }

            System.out.print("\nStore 3: ");
            for (int num = 0; num < store3; num += 100)
            {
                System.out.print("*");
            }

            System.out.print("\nStore 4: ");
            for (int num = 0; num < store4; num += 100)
            {
                System.out.print("*");
            }

            System.out.print("\nStore 5: ");
            for (int num = 0; num < store5; num += 100)
            {
                System.out.print("*");
            }
        }

        if(answer.equalsIgnoreCase("N"))
            System.out.print("Program terminated. Have a nice day!");

    }
}
