package School_Projects.Lectures_and_notes.KlasserOgObkekterModul4Gjennomgang;

class Bil{
    public String farge;

    public void settFarge(String fargen){
        farge = fargen;
        //System.out.println("Fargen til bilen er " + farge);
    }
    public String hentFarge(){
        return farge;
    }
}

public class Objekter1 {
    public static void main(String[]args){
        Bil nyBil = new Bil();
        nyBil.settFarge("Blå");

        String bilFargen = nyBil.hentFarge();
        System.out.println("Fargen til bilen er " + bilFargen);
    }
}
