package School_Projects.Lectures_and_notes.OppgaverKlasserOgObjekter;

class Person{
    public String navn;
    public String adresse;
    public String telefonnr;
    public String fødselsår;

    public void enPerson(){
        System.out.println("\nNavn: " + navn + ".");
        System.out.println("Adresse: " + adresse + ".");
        System.out.println("Telefon-nummer: " + telefonnr + ".");
        System.out.println("Fødselsår: " + fødselsår + ".");
    }
}

public class Oppgave3 {
    public static void main(String[]args){
        int fødselsÅr = 2025 - 21;
        String År = Integer.toString(fødselsÅr);

        Person nyPerson = new Person();
        nyPerson.navn = "Per Hansen";
        nyPerson.adresse = "Osloveien 82  ";
        nyPerson.telefonnr = "22124512";
        nyPerson.fødselsår = År;
        nyPerson.enPerson();
    }

}
