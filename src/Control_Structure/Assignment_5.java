package Control_Structure;
import static javax.swing.JOptionPane.*;
public class Assignment_5 {
    public static void main(String[]args){
        String month = (showInputDialog(null,
                "What is the current month")).toLowerCase();
        if(month.equals("january") || month.equals("february") || month.equals("december")){
            showMessageDialog(null, month + " is a winter month.");
        }
        else if(month.equals("march") || month.equals("april") || month.equals("may")){
            showMessageDialog(null, month + " is a spring month.");
        }
        else if(month.equals("august") || month.equals("july") || month.equals("june")){
            showMessageDialog(null, month + " is a summer month.");
        }
        else if(month.equals("september") || month.equals("october") || month.equals("november")){
            showMessageDialog(null, month + " is a autumn month.");
        }
        else {
            showMessageDialog(null, "Please write a valid month.");
        }


    }
}
