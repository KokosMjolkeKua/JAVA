package School_Projects.Exam_practice.Module_seven.Assignments_extra;

import static javax.swing.JOptionPane.*;
import java.util.Arrays;

public class Main {
    public static void main(String[]args){

        //Oppgave 1:
        int[] intOne = {1,2,3,4,5,6,7,8,9};
        System.out.println(intOne[3] + " " + intOne[6]);

        System.out.println();//Mellomrom

        //Oppgave 2:
        int sum = 0;
        int averageN = 0;

        int sumOFem = 0;
        int averageFem = 0;

        for (int i = 0; i < intOne.length; i++) {
            sum = sum + intOne[i];
            averageN++;
            if(intOne[i] > 5){
                sumOFem = sumOFem + intOne[i];
                averageFem ++;
            }
        }

        int average = sum / averageN;
        int average5 = sumOFem / averageFem;

        System.out.println("Summen for alle tallene i Arrayet er : " + sum);
        System.out.println("The Average for the Array is : " + average);

        System.out.println("Summen for alle talle høyere enn 5 er : " + sumOFem);
        System.out.println("The Average for alle tall over 5 er : " + average5);

        int sumAll = 0;
        for(int i: intOne){
            sumAll = sumAll + i;
        }

        System.out.println("Summen av alle tallene i en forenklet for løkke er : " + sumAll);
        System.out.println();//Mellomrom

        //Oppgave 3:
        String[] stringArray = {"Per", "Hansen", "Line", "Olsen", "Ola", "Pedersen", "Kari", "Finnsen"};
        int i = 1;
        for (int j = 0; j < stringArray.length; j++) {
            if(j%2==0){
                System.out.println(stringArray[j] + " " + stringArray[i]);
                i = i + 2;
            }
        }
        System.out.println();//Mellomrom

        //Oppgave 4;
        int[] ints = {45, 34, 5, 8, 10, 2, 13, 25};
        int n = ints.length - 1;
        while(n > 0){
            System.out.print(ints[n] + " ");
            n--;
        }
        System.out.println();//Mellomrom

        for (int j = ints.length - 1; j > 0; j--) {
            System.out.print(ints[j] + " ");
        }
        System.out.println();//Mellomrom
        System.out.println();//Mellomrom

        //Oppgave 5:
        int max = ints[0];
        int min = ints[0];
        for(int q: ints){
            if(max < q){
                max = q;
            }
            if(min > q){
                min = q;
            }
        }
        System.out.println("Den største verdien er: " + max);
        System.out.println("Den minste verdien er: " + min);


        //Oppgave 6:
        int[] intArrayOne = {45, 34, 5, 8, 10, 2, 13, 25};
        int[] intArrayTwo = {45, 34, 5, 8, 10, 2, 13, 25};

        if(Arrays.equals(intArrayOne, intArrayTwo)){
            System.out.println("De er like.");
        }
        else{
            System.out.println("De er ikke like!");
        }
        System.out.println();//Mellomrom

        //Oppgave 7:
        int[] intAO = {45, 34, 5, 8, 10, 2, 13, 25, 1, 2, 3, 4, 5};
        int partall = 0;
        int oddetall = 0;
        for(int y: intAO){
            if(y % 2 == 0){
                partall++;
            }
            else{
                oddetall++;
            }
        }
        System.out.println("Partall: " + partall);
        System.out.println("Oddetall: " + oddetall);

        System.out.println();//Mellomrom


        //Oppgave 8:
        showMessageDialog(null, "Det skal nå leses inn poengsummer:");
        int input = Integer.parseInt(showInputDialog("Hvor mange poengsummer skal leses inn?"));
        int gradeCount = 0;
        int[] grades = new int[input];
        int count = 0;

        //Grades:
        int A = 0;
        int B = 0;
        int C = 0;
        int D = 0;
        int E = 0;
        int F = 0;

        while(input > 0){
            String inputPoint = showInputDialog("Hva er poengsummen til eleven?" +
                    "\nMellom 1-100");
            int inputP;
            try{
                inputP = Integer.parseInt(inputPoint);
                if(inputP < 0 || inputP > 100){
                    showMessageDialog(null, "Nummeret må være mellom 1-100");
                }
                else{
                    grades[count] = inputP;
                    count++;
                    input--;
                    gradeCount++;
                    if(inputP < 40){
                        F++;
                    }
                    if(inputP < 50 && inputP >= 40){
                        E++;
                    }
                    if(inputP < 60 && inputP >= 50){
                        D++;
                    }
                    if(inputP < 80 && inputP >= 60){
                        C++;
                    }
                    if(inputP < 90 && inputP >= 80){
                        B++;
                    }
                    if(inputP < 100 && inputP >= 90){
                        A++;
                    }
                }
            } catch(Exception e){
                inputP = 0;
                showMessageDialog(null, "You have to write a number..");
            }
        }


        System.out.println();
        System.out.println("POENG:");
        int countStud = 0;
        for(int g: grades){
            countStud++;
            System.out.println("Elev nr: " + countStud + " : " + g);
        }

        System.out.println();
        System.out.println("Antall KARAKTERER: ");
        System.out.println("A : " + A);
        System.out.println("B : " + B);
        System.out.println("C : " + C);
        System.out.println("D : " + D);
        System.out.println("E : " + E);
        System.out.println("F : (Stryk) " + F);

        int karakterSnitt = (A + B + C + D + E + F)/6;
        System.out.println();
        System.out.println("Karakter Snitt: " + karakterSnitt);

        int sumGrades = 0;
        for(int l: grades){
            sumGrades = sumGrades + l;
        }
        int averageGrades = sumGrades / gradeCount;
        showMessageDialog(null, "Gjennomsnittet av alle karakterene er: " + averageGrades);

    }
}
