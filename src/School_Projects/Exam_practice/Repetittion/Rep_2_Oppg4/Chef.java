package School_Projects.Exam_practice.Repetittion.Rep_2_Oppg4;

public class Chef extends Employee{
    private int age;
    private int salary;
    private String name;

    public Chef(int age, int salary, String name){
        super(age, salary, name);
        this.age = age;
        this.salary = salary;
        this.name = name;
    }

    public String makeDish(String dish){
        return "Kokkens spesial er ferdig laget.";
    }

    public String toString(){
        return "Employee: " +
                "\nName : " + name +
                "\nAge : " + age +
                "\nSalary : " + salary;
    }

}
