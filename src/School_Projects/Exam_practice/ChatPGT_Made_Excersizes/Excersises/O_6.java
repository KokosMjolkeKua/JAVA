package School_Projects.Exam_practice.ChatPGT_Made_Excersizes.Excersises;

public class O_6 {

    String name;
    int age;

    public O_6(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String sayHi(){
        return "Hi " + name + "." +
                "\nI hope you are well.";
    }
    public String checkAge(){
        String text = "";
        int adultHood = 0;

        if(age > 18){
            text = "I see you are over 18 and therefore an adult!";
        }
        if(age == 18){
            text = "I see you just turned 18 and started your adult journey!";
        }
        if(age < 18){
            adultHood = 18 - age;
            text = "You are not yet of age, but in " + adultHood + " years you will be 18!";
        }

        return text;
    }


    public static void main(String[]args){
        O_6 ida = new O_6("Ida", 18);
        O_6 magnus = new O_6("Magnus", 32);
        O_6 lisa = new O_6("Lisa", 12);


        System.out.println(ida.sayHi());
        System.out.println(ida.checkAge());

        System.out.println(magnus.sayHi());
        System.out.println(magnus.checkAge());

        System.out.println(lisa.sayHi());
        System.out.println(lisa.checkAge());
    }
}
