package School_Projects.Exam_practice.Module_six.O_1;

public class Countdown {
    private int time;
    public Countdown(int time){
        while(time >= 0){
            System.out.println(time);
            time--;
        }
    }
}
