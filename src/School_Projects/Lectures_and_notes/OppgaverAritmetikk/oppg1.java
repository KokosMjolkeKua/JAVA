package School_Projects.Lectures_and_notes.OppgaverAritmetikk;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;
public class oppg1 {
    public static void main(String[]args){
        showMessageDialog(null, "Hei, velkommen til denne pensjonist oppgaven!");
        String name;
        int age;

        try {
            name = showInputDialog("Hva er navnet ditt?");
            age = Integer.parseInt(showInputDialog("Hvilket årstall ble du født?"));
            int pensjonist = age + 67;
            int alder = 2025 - age;
            showMessageDialog(null, name + " " + "er idag " + alder + " år gammel." + "Ble født i " + age + " og i " + pensjonist + " er hun/han 67 år og da vil hun/han være pensjonist");

        }
        catch (Exception e) {
            age = 0;
            showMessageDialog(null,"Skriv inn heltall vær så snill!");
        }
       }
}
