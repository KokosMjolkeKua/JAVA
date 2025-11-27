package School_Projects.Lectures_and_notes.Live_Koding_Forelesning5_Loops;

public class DoubleLoop {
    public static void main(String[]args){

        for (int outer = 0; outer < 5; outer++){
            System.out.println("\nouter er: " + outer);

            for(int inner = 0; inner < 7; inner++){
                System.out.print(" inner er: " + inner + " ");
            }
        }
    }
}
