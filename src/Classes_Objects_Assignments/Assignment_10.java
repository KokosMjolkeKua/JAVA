package Classes_Objects_Assignments;
import static javax.swing.JOptionPane.*;
class Vind {
    private double vindHastighet = 0.0;

    public Vind(double vindHastighet){
        this.vindHastighet = vindHastighet;
    }

    public double setVindHastighet(){
        double newVind = Double.parseDouble(showInputDialog(null, "What is the wind speed in km?"));
        vindHastighet = newVind;
        return vindHastighet;
    }// her skal det inn en konstruktør for å sette vindhastigheten

    public double getVindHastighet() {
        showMessageDialog(null, "The Wind speed is at " + vindHastighet + " km per hour.");
        return vindHastighet;// sett inn kode her
    }

    public boolean erOrkan() {
        if (vindHastighet >= 120){
            showMessageDialog(null, "Det er ORKAN! LØP!");
            return true;// sett inn kode her
        }
        showMessageDialog(null, "Det er ikke Orkan.");
        return false;
    }

    public boolean erVindstille() {
        if(vindHastighet <= 2){
            showMessageDialog(null, "Det er vindstille..");
            return true;// sett inn kode her
        }
        showMessageDialog(null, "Det er ikke vindstille!");
        return false;
    }

    public String getKnop() {
        double knop; // en knop er 1852 meter, så 1.852 km
        knop = vindHastighet / 1.852;
         showMessageDialog(null, "The wind speed of "
                 + vindHastighet + " km an hour, and the knop of that speed is " + knop + ".");
         return "";
    }

    //public double getBeaufort() {
      //  double beaufort;
        //Math.pow((vindHastighet) / 3.01 ^ 0.6666 + 0.5);

        //return 0;
   // }
}

public class Assignment_10 {
    public static void main(String[]args){
        Vind newVind = new Vind(23);
        newVind.setVindHastighet();
        newVind.getVindHastighet();
        newVind.erOrkan();
        newVind.erVindstille();
        newVind.getKnop();
    }
}
