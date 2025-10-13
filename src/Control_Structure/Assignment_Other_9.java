package Control_Structure;

import static javax.swing.JOptionPane.*;

public class Assignment_Other_9 {
    public static void main(String[]args){
        int number = Integer.parseInt(showInputDialog(null,
                "Write a number to perform a factorial: "));
        int outNumber = number;
        int result = number;
        for (int n = number; n > 0; n--){
            result *= n;
        }
        showMessageDialog(null, outNumber + "!  (factorial), is:  " + result);
    }
}
