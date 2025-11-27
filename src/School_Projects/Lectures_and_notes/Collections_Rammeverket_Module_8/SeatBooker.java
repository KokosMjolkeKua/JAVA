package School_Projects.Lectures_and_notes.Collections_Rammeverket_Module_8;

public class SeatBooker {


    public static boolean bookSeatInPlane(Plane plane){
        for (int seatNr = 0; seatNr < plane.getNrOfSeats(); seatNr ++){
            if (plane.setSeatToTaken(seatNr)){
                return true; //eller skrive break
            }
        }
        return false;
    }
}
