package School_Projects.Exam_practice.Module_three;

public class Summation {
    public static void main(String[]args){

        double Nr1;
        double Nr2;
        double result;

        Nr1 = 3;
        Nr2 = 2;

        result = Nr1 + Nr2;
        System.out.println(result);

        result = Nr1 - Nr2;
        System.out.println(result);

        result = Nr1 / Nr2;
        System.out.println(result);

        result = Nr1 * Nr2;
        System.out.println(result);

        result = Nr1 % Nr2;
        System.out.println(result);

        result = 4 * (3 * Nr1) - Nr2;
        System.out.println(result);

        result = (int) Nr1 + (int) Nr2;
        System.out.println(String.format("%.0f", result));

    }
}
