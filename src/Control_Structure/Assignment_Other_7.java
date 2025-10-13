package Control_Structure;
import static javax.swing.JOptionPane.*;
public class Assignment_Other_7 {
    public static void main(String[]args){
        int inputNumber = Integer.parseInt(showInputDialog(null, "Write a whole number between 1 and 10"));
        String out = "";
        if (inputNumber <= 10 && inputNumber >= 1){
            for (int i = 0; i <= inputNumber; i ++){
                for (int j = 0; j < i; j ++){
                    out += "*";
                }
                out += "\n";
            }
            showMessageDialog(null, out);
        }
        else {
            showMessageDialog(null, "Write a number between 1 and 10!");
        }
    }
}
