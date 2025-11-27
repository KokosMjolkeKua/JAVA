package School_Projects.Lectures_and_notes.Forelesning_10_11_25.Oppgave_4;

public abstract class Employee {
    private int age;
    private double salary;
    private String name;

    public Employee(int age, double salary, String name) {
        if (!name.equals("")){
            this.name = name;
        } else {
            System.out.println("Warning: Name not valid!");
        }

        if (age >= 18){
            this.age = age;
        } else {
            System.out.println("Warning: Age too low!");
        }

        if (salary > 0){
            this.salary = salary;
        } else {
            System.out.println("Warning: Employees must be paid!");
        }
    }

    public double getSalary(){
        return this.salary;
    }

    public String toString(){
        return "Employee: " + "\nName: " + name +
                "\nAge: " + age +
                "\nSalary: " + salary;
    }
}
