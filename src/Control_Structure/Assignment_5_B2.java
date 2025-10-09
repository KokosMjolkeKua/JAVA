package Control_Structure;
import static javax.swing.JOptionPane.*;
public class Assignment_5_B2 {
    public static void main(String[]args){
        String month = showInputDialog(null,
                "Write the month, (for example march)").toLowerCase();

        switch(month){
            case "december", "january", "february" -> {
                showMessageDialog(null, "The month: "  + month +
                        " is a summer month.");
                break;
            }
            case "march", "april", "may" -> {
                showMessageDialog(null, "The month: " + month +
                        " is a Spring month.");
                break;
            }
            case "august", "july", "june" -> {
                showMessageDialog(null, "The month: " + month +
                        " is a Summer month");
                break;
            }
            case "september", "october", "november" -> {
                showMessageDialog(null, "The month: " + month +
                        " is a Autumn month.");
                break;
            }
            default -> {
                showMessageDialog(null, "Wrong input, write a month please.");
                break;
            }
        }
    }
}
