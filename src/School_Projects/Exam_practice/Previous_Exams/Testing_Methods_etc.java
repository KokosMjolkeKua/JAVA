package School_Projects.Exam_practice.Previous_Exams;

import static javax.swing.JOptionPane.*;

public class Testing_Methods_etc {

    public static void intArray(int[] ints, int number){
        int max = ints[0];
        int min = ints[0];
        int sum = 0;
        int amountOfNumbers = 0;
        int dividable = 0;

        for(int i: ints){
            if(i%number == 0){
                System.out.println(i + " is dividable by " + number);
                dividable++;
            }
            if(max < i){
                max = i;
            }
            if(min > i){
                min = i;
            }
            sum = sum + i;
            amountOfNumbers++;
        }

        System.out.println("Summen av alle tallene er: " + sum);
        System.out.println("Det er " + amountOfNumbers + " tall i denne arrayen.");
        System.out.println("Det største tallet er: " + max + ".");
        System.out.println("Det Minste tallet er: " + min + ".");
        System.out.println("Det er " + dividable + " heltall som er delelig med " + number + ".");
    }

    public static void calculator(){
        showMessageDialog(null, "Welcome to the calculator:");
        boolean yes = true;
        while(yes){
            String input = showInputDialog("Type 'm' to multiply." +
                    "\nType 'a' to add." +
                    "\nType 's' to subtract. " +
                    "\nType 'd' to divide." +
                    "\nType 'all' to do all options." +
                    "\nType 'q' to QUIT. ");

            if(input.equalsIgnoreCase("m")){
                String nr1 = showInputDialog("Write your first number:");
                String nr2 = showInputDialog("Write your second number:");
                double nrOne;
                double nrTwo;
                double sum;
                try{
                    nrOne = Double.parseDouble(nr1);
                    nrTwo = Double.parseDouble(nr2);
                    sum = nrOne * nrTwo;
                    showMessageDialog(null, "When Multiplying " + nrOne + " and " + nrTwo +
                            "\nYou get : " + sum);
                }
                catch(Exception e){
                    nrOne = 0;
                    nrTwo = 0;
                    showMessageDialog(null, "You have to write a number..");
                    showMessageDialog(null, "Try again?");
                }
            }
            if(input.equalsIgnoreCase("s")){
                String nr1 = showInputDialog("Write your first number:");
                String nr2 = showInputDialog("Write your second number:");
                double nrOne;
                double nrTwo;
                double sum;
                try{
                    nrOne = Double.parseDouble(nr1);
                    nrTwo = Double.parseDouble(nr2);
                    sum = nrOne - nrTwo;
                    showMessageDialog(null, "When Subtracting " + nrOne + " and " + nrTwo +
                            "\nYou get : " + sum);
                    showMessageDialog(null, "Try again?");
                }
                catch(Exception e){
                    nrOne = 0;
                    nrTwo = 0;
                    showMessageDialog(null, "You have to write a number..");
                    showMessageDialog(null, "Try again?");
                }
            }
            if(input.equalsIgnoreCase("d")){
                String nr1 = showInputDialog("Write your first number:");
                String nr2 = showInputDialog("Write your second number:");
                double nrOne;
                double nrTwo;
                double sum;
                try{
                    nrOne = Double.parseDouble(nr1);
                    nrTwo = Double.parseDouble(nr2);
                    if(nrOne < nrTwo){
                        sum = nrTwo / nrOne;
                    }
                    else{
                        sum = nrOne / nrTwo;
                    }
                    showMessageDialog(null, "When Dividing " + nrOne + " and " + nrTwo +
                            "\nYou get : " + sum);
                    showMessageDialog(null, "Try again?");
                }
                catch(Exception e){
                    nrOne = 0;
                    nrTwo = 0;
                    showMessageDialog(null, "You have to write a number..");
                    showMessageDialog(null, "Try again?");
                }
            }
            if(input.equalsIgnoreCase("a")){
                String nr1 = showInputDialog("Write your first number:");
                String nr2 = showInputDialog("Write your second number:");
                double nrOne;
                double nrTwo;
                double sum;
                try{
                    nrOne = Double.parseDouble(nr1);
                    nrTwo = Double.parseDouble(nr2);
                    sum = nrOne + nrTwo;
                    showMessageDialog(null, "When Adding " + nrOne + " and " + nrTwo +
                            "\nYou get : " + sum);
                    showMessageDialog(null, "Try again?");
                }
                catch(Exception e){
                    nrOne = 0;
                    nrTwo = 0;
                    showMessageDialog(null, "You have to write a number..");
                    showMessageDialog(null, "Try again?");
                }
            }
            if(input.equalsIgnoreCase("all")){
                String nr1 = showInputDialog("Write your first number:");
                String nr2 = showInputDialog("Write your second number:");
                double nrOne;
                double nrTwo;
                double sumOne;
                double sumTwo;
                double sumThree;
                double sumFour;

                try{
                    nrOne = Double.parseDouble(nr1);
                    nrTwo = Double.parseDouble(nr2);

                    sumOne = nrOne * nrTwo;
                    sumTwo = nrOne - nrTwo;
                    if(nrOne < nrTwo){
                        sumThree = nrTwo / nrOne;
                    }
                    else{
                        sumThree = nrOne / nrTwo;
                    }
                    sumFour = nrOne + nrTwo;

                    showMessageDialog(null, "When Multiplying " + nrOne + " and " + nrTwo +
                            "\nYou get : " + sumOne +
                            "\n" +
                            "\nWhen Subtracting " + nrOne + " and " + nrTwo +
                            "\nYou get : " + sumTwo +
                            "\n" +
                            "\nWhen Dividing  " + nrOne + " and " + nrTwo +
                            "\nYou get : " + sumThree +
                            "\n" +
                            "\nWhen Adding " + nrOne + " and " + nrTwo +
                            "\nYou get : " + sumFour);

                    showMessageDialog(null, "Try again?");
                }
                catch(Exception e){
                    nrOne = 0;
                    nrTwo = 0;
                    showMessageDialog(null, "You have to write a number..");
                    showMessageDialog(null, "Try again?");
                }
            }
            if(input.equalsIgnoreCase("q")){
                showMessageDialog(null, "Thank you for now!" +
                        "\nGoodbye.");
                yes = false;
            }
        }
    }
}
