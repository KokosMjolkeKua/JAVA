package Control_Structure;
import static javax.swing.JOptionPane.*;
public class Assignment_Other_8 {
    public static void main(String[]args){
        int number, nr1, nr2;
        int inputNumber = Integer.parseInt(showInputDialog(null, "Write a 5 digit number:"));

        if (inputNumber > 10_000 && inputNumber < 100_000){

            do{
                number = inputNumber;
            }

            while (number < 10_000 || number > 100_000);
            boolean palindrom1 = false;
            boolean palindrom2 = false;

            nr1 = number / 10_000;
            nr2 = number % 10;
            if (nr1 == nr2){
                palindrom1 = true;
            }

            number = (number - (nr1 * 10_000)) / 10;
            nr1 = number / 100;
            nr2 = number % 10;
            if (nr1 == nr2){
                palindrom2 = true;
            }

            if (palindrom1 && palindrom2){
                showMessageDialog(null, "PALINDROM!");
            }
            else {
                showMessageDialog(null, "IKKE PALINDROM!");
            }
        }
        else{
            showMessageDialog(null, "Write a 5 digit number!");
        }

    }
}
