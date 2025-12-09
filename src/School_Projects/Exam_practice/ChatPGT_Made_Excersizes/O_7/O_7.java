package School_Projects.Exam_practice.ChatPGT_Made_Excersizes.O_7;

public class O_7 {
    public static void main(String[]args){

        Animal rudy = new Animal("Bird", "Rudy", 12.3, 10.8);
        Dog boxy = new Dog("Dog", "Boxy", 8.3, 50.1);
        Cat dixie = new Cat("Cat", "Dixie", 4.3, 25.2);

        System.out.println("\n" + rudy);
        System.out.println("\n" + boxy);
        System.out.println("\n" + dixie);

        System.out.println("\n" + rudy.makeSound());
        System.out.println(boxy.makeSound());
        System.out.println(dixie.makeSound());
    }
}
