package School_Projects.Exam_practice.Repetittion.Rep_2_Oppg5;

public class Drone implements Moveable{
    int antall;
    double diameter;


    public void Propeller(int antallPropell, double diameter){
        this.antall = antallPropell;
        this.diameter = diameter;
    }

    public int getAntall() {
        return antall;
    }

    public void setAntall(int antall) {
        this.antall = antall;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    @Override
    public void move(double[] position) {

    }
}
