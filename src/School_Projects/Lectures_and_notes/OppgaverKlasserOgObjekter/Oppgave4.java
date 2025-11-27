package School_Projects.Lectures_and_notes.OppgaverKlasserOgObjekter;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

class Person2{
    public String navn;
    public String adresse;
    public String telefonnr;
    public String år;
    public String fødselsår;

    public void enPerson2(){
        this.navn = navn;
        this.adresse = adresse;
        this.telefonnr = telefonnr;
        this.år = år;
        this.fødselsår = fødselsår;

        navn = showInputDialog("Hva er navnet ditt? ");
        adresse = showInputDialog("Hva er din adresse?");
        telefonnr = showInputDialog("Hva er telefonnummeret ditt?");
        fødselsår = showInputDialog("Hvor gammel er du? (I hele tall)");
        år = Integer.toString(2025 - Integer.parseInt(fødselsår));
    }
    public void printPerson(){
        showMessageDialog(null,"\nPerson" + "\nNavn: " + this.navn + "." + "\nAdresse: " + this.adresse + "." + "\nTelefon-Nummer: " + this.telefonnr + "." + "\nFødselsår: " + this.år + ".");

    }
}

public class  Oppgave4 {
    public static void main(String[]args){
        Person2 nyPerson2 = new Person2();
        nyPerson2.enPerson2();
        nyPerson2.printPerson();
    }
}
