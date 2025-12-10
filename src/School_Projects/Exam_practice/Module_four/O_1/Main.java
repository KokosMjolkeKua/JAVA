package School_Projects.Exam_practice.Module_four.O_1;

public class Main {
    public static void main(String[]args){
        Ticket ida = new Ticket("Ida",1223122312, "Svalbard");
        Ticket tord = new Ticket("Tord",922342893, "Svalbard");

        System.out.println(ida);
        System.out.println(tord);

        System.out.println();

        System.out.println(ida.amountOfPassengers());
    }
}
