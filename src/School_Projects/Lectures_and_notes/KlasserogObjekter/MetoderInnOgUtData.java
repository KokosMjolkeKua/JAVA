package School_Projects.Lectures_and_notes.KlasserogObjekter;

class Bil{
    private String farge;

    public void settFarge(String fargen){
        this.farge = fargen;
    }
    public String hentFarge(){
        return farge;
    }

}
public class MetoderInnOgUtData {
    public static void main(String[]args){
        Bil nyBil = new Bil();
        nyBil.settFarge("Blå");
        String bilFargen = nyBil.hentFarge();
        System.out.println("Fargen til bilen er  " + bilFargen);
    }
}
