package School_Projects.Lectures_and_notes.KlasserOgObkekterModul4Gjennomgang;

public class Introduksjon {
    public static void main(String[]args){
        int gjester = 3;
        int drikkerLaget = 2;
        boolean nokDrikker = drikkerLaget != gjester;

        System.out.println("Antall gjester: " + gjester);
        System.out.println("Antall drikker laget: " + drikkerLaget);

        if(nokDrikker){
            System.out.println("Robot: Nok drikker til alle gjestene!");
        }else {
            System.out.println("Robot: Ikke nok drikker, må lage flere!");
        }
    }
}
