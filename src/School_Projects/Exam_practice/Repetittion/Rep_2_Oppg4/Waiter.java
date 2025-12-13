package School_Projects.Exam_practice.Repetittion.Rep_2_Oppg4;

public class Waiter extends Employee{
    private int age;
    private int salary;
    private String name;
    static int tipPot = 0;

    public Waiter(int age, int salary, String name){
        super(age, salary, name);
        this.age = age;
        this.salary = salary;
        this.name = name;
    }

    public int takeTips(int tips){
        tipPot = tipPot + tips;
        return tips;
    }

    public int getTips(){
        int tipReturn = tipPot;
        tipPot = 0;
        return tipReturn;
    }

    public String toString(){
        return "Employee: " +
                "\nName : " + name +
                "\nAge : " + age +
                "\nSalary : " + salary;
    }

}
