package Classes_Objects_Assignments;
import static javax.swing.JOptionPane.*;

class apartment{
    String room;
    double length;
    double width;

    public apartment(){
        this.length = length;
        this.width = width;
        this.room = room;
    }

    public void inputRoom(){
        String inputRoom = showInputDialog(null, "What room would you like to measure?");

        length = Double.parseDouble(showInputDialog(null, "What is the length of the room?"));
        width = Double.parseDouble(showInputDialog(null, "What is the width of the room?"));
        room = inputRoom;

    }
    public void printRoom(){
        double area = length * width;
        String areaTD = String.format("%.2f", area);

        showMessageDialog(null,
                "With a length of: " + length +
                        "\nAnd a width of: " + width +
                        "\nThe room: " + room + " has an area of " + areaTD);
    }
}
public class Extra_4_andre_metoder {
    public static void main(String[]args){
        apartment apart = new apartment();

        apart.inputRoom();
        apart.printRoom();
    }
}
