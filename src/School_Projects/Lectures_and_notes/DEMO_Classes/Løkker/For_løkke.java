package School_Projects.Lectures_and_notes.DEMO_Classes.Løkker;

public class For_løkke {
    public static void main(String[]args){
        for(int i = 10; i >= 0; i--){ //Hvis man ikke har større eller = 0 så teller den bare til 1, men hvis man har = og > så teller den med 0
            //kan telle ned med -- og opp med ++,
            // må derimot endre slik at i er større enn slutttallet, og omvendt om det er oppover
            System.out.println("Hello" + " " + i); //øker for hver gang, pga ++ og den starter på
        }
    }
}
