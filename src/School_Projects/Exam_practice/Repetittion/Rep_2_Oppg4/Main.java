package School_Projects.Exam_practice.Repetittion.Rep_2_Oppg4;

import static javax.swing.JOptionPane.*;

public class Main {
    public static void main(String[]args){

        Chef oskar = new Chef(34, 120_000, "Oskar");

        Waiter lydia = new Waiter(26, 80_000, "Lydia");
        Waiter ida = new Waiter(23, 67_000, "Ida");

        Employee[] employees = {oskar, lydia, ida};
        int sum = 0;
        int EmployeeAmount = 0;
        int tipPot = 0;
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].toString());
            if(employees[i] instanceof Waiter){
                int inputTips = Integer.parseInt(showInputDialog("How much in tips?"));
                System.out.println("Tips: " + ((Waiter) employees[i]).takeTips(inputTips));
                tipPot = tipPot + ((Waiter)employees[i]).getTips();
            }
            if(employees[i] instanceof Chef){
                System.out.println(((Chef) employees[i]).makeDish("dish"));
            }
            sum = sum + employees[i].getSalary();
            System.out.println();
            EmployeeAmount++;
        }

        int tipDivided = tipPot / EmployeeAmount;
        System.out.println("Summen av aller Lønnene er : " + sum);
        System.out.println("Tipsen blir delt på " + EmployeeAmount + " stk." +
                "\nOg hver person får " + tipDivided + " hver.");
    }
}
