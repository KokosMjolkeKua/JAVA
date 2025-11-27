package School_Projects.Lectures_and_notes.ConditionalStatementsExamples;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;
public class IfElse {
    public static void main(String[]args){
        String month = showInputDialog("Skriv inn en måned: ").toLowerCase();


        if (month.equals("december") || month.equals("januar") || month.equals("februar")){
            showMessageDialog(null,month + " er en vintermåned!");
        } else if (month.equals("mars") || month.equals("april") || month.equals("mai")){
            showMessageDialog(null,month + " er en vårmåned!");
        } else if (month.equals("juni") || month.equals("juli") || month.equals("august")){
            showMessageDialog(null,month + " er en sommermåned!");
        } else if (month.equals("september") || month.equals("oktober") || month.equals("november")){
            showMessageDialog(null,month + " er en høstmåned!");
        } else {
            showMessageDialog(null,"Du må skrive en måned/feil input");
        }



        switch(month) {
            case "desember", "januar", "februar" -> {
                System.out.println(month + " er en vintermåned!");
            }
            case "mars", "april", "mai" -> {
                System.out.println(month + " er en vårmåned!");
            }
            case "juni", "juli", "august" -> {
                System.out.println(month + " er en sommermåned!");
            }
            case "september", "oktober", "november" -> {
                System.out.println(month + " er en høstmåned!");
            }
        }
    }
}
