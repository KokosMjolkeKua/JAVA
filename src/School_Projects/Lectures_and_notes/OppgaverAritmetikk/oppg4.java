package School_Projects.Lectures_and_notes.OppgaverAritmetikk;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;
public class oppg4 {
    public static void main(String[]args){
        showMessageDialog(null, "Nå skal det regnes ut omkretsen av en sirkel");
        double radius;
        double omkrets;

        try {
            radius = Double.parseDouble(showInputDialog("Vennligst skriv radiusen av sirkelen:"));
            omkrets = 2 * 3.14 * radius;
            double omkretsMedToDecimaler = Double.parseDouble(String.format("%.2f",omkrets)) ;
            showMessageDialog(null, "Omkretsen av en sirkel med " + radius + " cm som radius blir " + omkretsMedToDecimaler + " cm.");

        } catch (Exception e) {
            radius = 0;
            showMessageDialog(null, "Skriv inn et decimaltall!");
        }
    }
}
