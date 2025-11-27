package School_Projects.Lectures_and_notes.Forelesning2;

import static javax.swing.JOptionPane.showInputDialog;

public class vinmonopolkalkulatorish {
    public static void main(String[] args){
        int age;
        String ageInput = showInputDialog("Hvor gammel er du?");
        try {
            age = Integer.parseInt(ageInput);
        } catch (Exception e){
            age = 0;
            showInputDialog(null, "Du gav ikke et heltall, vennligst prøv igjen!");
        }
        if (age < 18){ //blir feilmelding på age fordi den ikke er definert som en int  en gruppe
            showInputDialog(null,"Du er ikke gammel nok til å handle på polet!");
        }else if (age < 20) {
            showInputDialog(null,"Du kan handle på polet for under 20% alkohol.");
        }else{
            showInputDialog(null,"Du kan handle på polet for all alkohol.");
        }
    }

}
