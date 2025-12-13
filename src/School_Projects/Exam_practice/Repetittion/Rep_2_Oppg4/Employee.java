package School_Projects.Exam_practice.Repetittion.Rep_2_Oppg4;

public class Employee {
    private int age;
    private int salary;
    private String name;

    public Employee(int age, int salary, String name){
        this.age = age;
        this.salary = salary;
        this.name = name;
    }

    public int getSalary(){
        return salary;
    }

    public String toString(){
        return "Employee: " +
                "\nName : " + name +
                "\nAge : " + age +
                "\nSalary : " + salary;
    }
}
