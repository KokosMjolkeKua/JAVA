package School_Projects.Exam_practice.Repetittion.Rep_2_Oppg5;

public class Car implements Moveable{

    double dekkSlitasje = 0;
    boolean winterTires = true;

    public void winterTire(boolean t, double slitasje){
        if(slitasje >= 0 && slitasje <= 100){
            this.dekkSlitasje = slitasje;
            this.winterTires = t;
            if(winterTires){
                System.out.println("You have Winter tires." +
                        "\nThey have " + dekkSlitasje + "% slitasje.");
            }
            if(!winterTires){
                System.out.println("You have Summer tires." +
                        "\nThey have " + dekkSlitasje + "% slitasje.");
            }
        }
    }

    public double getDekkSlitasje() {
        return dekkSlitasje;
    }

    public void setDekkSlitasje(double dekkSlitasje) {
        this.dekkSlitasje = dekkSlitasje;
    }

    public boolean isWinterTires() {
        return winterTires;
    }

    public void setWinterTires(boolean winterTires) {
        this.winterTires = winterTires;
    }

    @Override
    public void move(double[] position) {

    }
}
