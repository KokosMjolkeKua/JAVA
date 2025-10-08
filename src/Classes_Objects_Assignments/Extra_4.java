package Classes_Objects_Assignments;
import java.util.Objects;

import static javax.swing.JOptionPane.*;

class Apartment{
    double length;
    double width;

    public Apartment(){
        this.length = length;
        this.width = width;
    }

    public boolean roomInput(){
        String room = showInputDialog("What room do you want to measure?");
        if (Objects.equals(room, "Kitchen")){
            double length = Double.parseDouble(showInputDialog(null, "What is the length of the room?"));
            double width = Double.parseDouble(showInputDialog(null, "What is the width of the room?"));
            double areal = length * width;
            String arealTwoDec = String.format("%.2f",areal);
            showMessageDialog(null, "The Areal is: " + arealTwoDec);
            return true;
        }
        if (Objects.equals(room, "Entre")){
            double length = Double.parseDouble(showInputDialog(null, "What is the length of the room?"));
            double width = Double.parseDouble(showInputDialog(null, "What is the width of the room?"));
            double areal = length * width;
            String arealTwoDec = String.format("%.2f",areal);
            showMessageDialog(null, "The Areal is: " + arealTwoDec);
            return true;
        }
        if (Objects.equals(room, "Living Room")){
            double length = Double.parseDouble(showInputDialog(null, "What is the length of the room?"));
            double width = Double.parseDouble(showInputDialog(null, "What is the width of the room?"));
            double areal = length * width;
            String arealTwoDec = String.format("%.2f",areal);
            showMessageDialog(null, "The Areal is: " + arealTwoDec);
            return true;
        }
        if (Objects.equals(room, "Bathroom")){
            double length = Double.parseDouble(showInputDialog(null, "What is the length of the room?"));
            double width = Double.parseDouble(showInputDialog(null, "What is the width of the room?"));
            double areal = length * width;
            String arealTwoDec = String.format("%.2f",areal);
            showMessageDialog(null, "The Areal is: " + arealTwoDec);
            return true;
        }
        if (Objects.equals(room, "Bedroom")){
            double length = Double.parseDouble(showInputDialog(null, "What is the length of the room?"));
            double width = Double.parseDouble(showInputDialog(null, "What is the width of the room?"));
            double areal = length * width;
            String arealTwoDec = String.format("%.2f",areal);
            showMessageDialog(null, "The Areal is: " + arealTwoDec);
            return true;
        } else {
            showMessageDialog(null, "That is not a room.");
            return false;
        }
    }

    public boolean roomMeasurements(){
        String room = showInputDialog("What room would you like the measurements for?");
        if (room.equals("Kitchen")){
            double l = 3.3;
            double w = 2.4;
            double areal = l * w;
            String arealTwoDec = String.format("%.2f",areal);
            showMessageDialog(null, "The room has a length of: " + l + " and it has a width of: " + w +
                    "\nThe room has an area of: " + arealTwoDec);
            return true;
        }
        if (room.equals("Entre")){
            double l = 3.8;
            double w = 1.6;
            double areal = l * w;
            String arealTwoDec = String.format("%.2f",areal);
            showMessageDialog(null, "The room has a length of: " + l + " and it has a width of: " + w +
                    "\nThe room has an area of: " + arealTwoDec);
            return true;
        }
        if (room.equals("Bedroom")){
            double l = 3.9;
            double w = 3.3;
            double areal = l * w;
            String arealTwoDec = String.format("%.2f",areal);
            showMessageDialog(null, "The room has a length of: " + l + " and it has a width of: " + w +
                    "\nThe room has an area of: " + arealTwoDec);
            return true;
        }
        if (room.equals("Living Room")){
            double l = 5.0;
            double w = 3.8;
            double areal = l * w;
            String arealTwoDec = String.format("%.2f",areal);
            showMessageDialog(null, "The room has a length of: " + l + " and it has a width of: " + w +
                    "\nThe room has an area of: " + arealTwoDec);
            return true;
        }
        if (room.equals("Bathroom")){
            double l = 2.2;
            double w = 1.6;
            double areal = l * w;
            String arealTwoDec = String.format("%.2f",areal);
            showMessageDialog(null, "The room has a length of: " + l + " and it has a width of: " + w +
                    "\nThe room has an area of: " + arealTwoDec);
            return true;
        } else {
            showMessageDialog(null, "That is not a valid room name.");
            return false;
        }

    }
}


public class Extra_4 {
    public static void main(String[]args){
        Apartment apartment = new Apartment();

        apartment.roomInput();
        apartment.roomMeasurements();

    }
}
