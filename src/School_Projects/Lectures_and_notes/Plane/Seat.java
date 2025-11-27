package School_Projects.Lectures_and_notes.Plane;

public class Seat {
    private String passengerName;
    private boolean taken;

    public Seat(String passengerName){
        this.passengerName = passengerName;
        this.taken = false;
    }

    public void setPassengerName(String passengerName){
        this.passengerName = passengerName;
    }
}
