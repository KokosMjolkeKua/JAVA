package Control_Structure;
import static javax.swing.JOptionPane.*;
class TryingSwitch{ ;

    public String TryingSwitch(){
        String month = showInputDialog(null, "What is the current month?");

        switch (month){
            case "january", "february", "december" ->{
                return "The month: " + month + " is a Winter month.";
            }
            case "march", "april", "may" -> {
                return "The month: " + month + " is a Spring month.";
            }
            case "august", "july", "june" -> {
                return "The month: " + month + " is a Summer month.";
            }
            case "september", "october", "november" -> {
                return "The month: " + month + " is a Autumn month.";
            }
        }
        return "";
    }
}


public class Assignment_5_B {
    public static void main(String[]args){
        TryingSwitch tryMe = new TryingSwitch();
        tryMe.TryingSwitch();
    }
}
