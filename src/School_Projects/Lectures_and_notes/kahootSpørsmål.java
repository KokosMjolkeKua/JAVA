package School_Projects.Lectures_and_notes;

public class kahootSpørsmål {
    public static void main(String[]args){

        int tall1 = 3;
        int tall2 = 4;
        double tall3  = (double)tall2;
        double tall4 = tall1/tall3;
        //System.out.print(tall4);
        //kan bli error fordi int er heltal ikke decimal, og det er null fordi det ikke er decimaltall

        int tall5 = 10;
        int tall6 = 7;
        int tall7 = tall5 % tall6;
        //System.out.println(tall7);

        int toll1 = 2;
        int toll2 = 3;
        int toll3 = toll2 + toll1 + (toll1 * toll2) - (toll1 * toll1) + toll1;
        //System.out.println(toll3);

        int latt1 = 2;
        int latt2 = 2;
        if(latt1 > latt2){
            System.out.println("tall1");
        }
        if (latt1 <= latt2) {
            System.out.println("tall2");
        }

    }
}
