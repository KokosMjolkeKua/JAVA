package School_Projects.Lectures_and_notes.KlasserogObjekter;

class Bil1{
    public String farge;

    public void visFarge(){
        System.out.println(" Fargen til bilen er " + farge);
    }
}

public class introtilKlasserOgObjekter {
    public static void main(String[]args) {
        Bil1 nyBil1 = new Bil1();
        nyBil1.farge = "blå";
        nyBil1.visFarge();
    }
}
