package Control_Structure;

public class Assignment_Other_6B {
    public static void main(String[]args){
        String out = "N\tN^2\tN^3\tN^4\n";
        for (int i = 1; i <= 5; i++){
            out += i + "\t" + Math.pow(i, 3) + "\t" + Math.pow(i, 3) + "\t" + Math.pow(i, 4) + "\t\n";
        }
        System.out.println(out);
    }
}
