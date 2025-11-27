package School_Projects.Lectures_and_notes.Plane;

public class Plane {
    private Seat[][] seatsTaken;

    public Plane(int nrOfRows, int nrOfSeatsPerRow){
        this.seatsTaken = new Seat[nrOfRows][nrOfSeatsPerRow];
    }

    public void findFreeSeat(String name){
        boolean seatFound = false;

        rowLoop :
        for (int rowIndex = 0; rowIndex  < seatsTaken.length; rowIndex ++){
            for (int seatIndex = 0; seatIndex < seatsTaken[rowIndex].length; seatIndex ++){
                if (seatsTaken[rowIndex][seatIndex] == null & !seatFound) {
                    seatsTaken[rowIndex][seatIndex] = new Seat(name);
                    seatFound = true;
                    System.out.println("Congratulations " + name + "!");
                    System.out.println("The seat on row: " + rowIndex + " seat-number: " + seatIndex + " is available!");
                    break rowLoop;
                }
            }

        }
        if (!seatFound){
            System.out.println("I am sorry " + name + ", we were not able to find an available seat.");

        }
    }
}
