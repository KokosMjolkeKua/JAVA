package School_Projects.Lectures_and_notes.Forelesning_10_11_25.Oppgave_4;

import java.util.ArrayList;
public class Oppgave4_repitisjon {
    public static void main(String[]args){
        ArrayList<Employee> employees = new ArrayList<Employee>();

        employees.add(new Chef(34, 600_000, "Erik"));
        employees.add(new Waiter(34, 480_000, "Trym"));
        employees.add(new Waiter(22, 470_000, "Harald"));

        double sumOfSalaries = 0;
        int nrOfEmployees = 0;

        for (Employee employee: employees){
            System.out.println(employee);

            if (employee instanceof Waiter){
                ((Waiter) employee).takeTips(400);
            }
            for (int i = 0; i <= employees.size(); i++){
                nrOfEmployees ++; //MÅ FIKSE DETTE!!
            }
            sumOfSalaries += employee.getSalary();
        }

        System.out.println("Total employee salary cost: " + sumOfSalaries);

        System.out.println("Each employee gets: " + Waiter.distributeTips(employees.size()));

    }
}
