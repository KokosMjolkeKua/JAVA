package Control_Structure;
import static javax.swing.JOptionPane.*;
public class Assignment_1 {
    public static void main(String[]args){
        int alder = Integer.parseInt(showInputDialog("What is your age?"));

        if (alder < 18){
            showMessageDialog(null,
                    "You are not old enough to take your drivers-liscense.");
        }
        else {
            showMessageDialog(null,
                    "You are old enough to take your drivers-liscense.");
        }
    }
}
