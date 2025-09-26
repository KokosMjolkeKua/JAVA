package Variables_Assignmnets;
import java.util.Scanner;
public class Assignment_8 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int variablesRead = 0;

            System.out.print("Enter a Decimal-Number: ");
            double n1 = scanner.nextDouble();
            variablesRead++;

            System.out.print("Enter another Decimal-Number: ");
            double n2 = scanner.nextDouble();
            variablesRead++;

            System.out.println("Enter a third Decimal-Number: ");
            double n3 = scanner.nextDouble();
            variablesRead++;

            double average = (n1 + n2 + n3) / variablesRead;

            String toDecimalsAverage = String.format("%.2f", average);

            System.out.println("The average of: " + n1 + " and " + n2 + " and " + n3 + ", is: " + toDecimalsAverage);

            scanner.close();

    }
}
