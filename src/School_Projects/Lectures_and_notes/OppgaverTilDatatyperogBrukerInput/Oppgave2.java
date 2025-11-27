package School_Projects.Lectures_and_notes.OppgaverTilDatatyperogBrukerInput;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;
public class  Oppgave2 {
    public static void main(String[]args){
        double voksenPris = 150;
        double barnePris = 150 - (150 * 0.1);

        showMessageDialog(null, "Hei, Velkommen til Kinoen!" + "\n" + "Her er prisene: " + "\n" + "Voksen: " + voksenPris + " kr" + "\n" + "Barn: " + barnePris + " kr");
        double antallVoksen = Double.parseDouble(showInputDialog("Hvor mange voksen biletter trenger dere?"));
        double antallBarn = Double.parseDouble(showInputDialog("Hvor mange barn biletter trenger dere?"));
        double totalPris = (antallVoksen * voksenPris) + (antallBarn) * barnePris;
        showMessageDialog(null, "Totalt blir det: " + totalPris + " kr" + "\n" + "For " + antallVoksen + " voksne og " + antallBarn + " barn.");
        showMessageDialog(null, "Ha en fin dag videre!");

    }
}
