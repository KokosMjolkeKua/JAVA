package School_Projects.Lectures_and_notes.Collections_Rammeverket_Module_8;

public class Plane {
    private boolean[] seatsTaken;

    public Plane(int nrOfSeats){
        this.seatsTaken = new boolean[nrOfSeats];
    }

    public boolean setSeatToTaken(int seatIndex){
        if (this.seatsTaken[seatIndex] == false){
            this.seatsTaken[seatIndex] = true;
            return true;
        } else {
            //System.out.println("Sorry the seat is taken!");
            return false;
        }

    }

    public int getNrOfSeats (){
        return this.seatsTaken.length;
    }
}
