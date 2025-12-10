package School_Projects.Exam_practice.ChatPGT_Made_Excersizes.Excersises.O_9;

public class Car implements Drivable{
    private String type;
    private int speed;

    public Car(String type, int speed){
        this.type = type;
        this.speed = speed;
    }

    @Override
    public void Drive() {
        System.out.println("The Car is Driving!");
    }

    @Override
    public void Sverve() {
        System.out.println("The Car is Sverving..");
    }

    @Override
    public void Crash() {
        if(speed < 80){
            System.out.println("The car sverved a little but didnt loose control! ");
        }
        if(speed > 80){
            System.out.println("The Car crashed...");
        }
    }


}
