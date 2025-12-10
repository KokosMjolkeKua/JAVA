package School_Projects.Exam_practice.Previous_Exams.Trial_Exam_24.Oppg_4;

public class SmartLight {
    public int brightnessPercentage;
    public boolean isOn;

    public SmartLight(int brightnessPercentage, boolean isOn) {
        this.brightnessPercentage = brightnessPercentage;
        this.isOn = isOn;
    }

    public int getBrightnessPercentage() {
        return brightnessPercentage;
    }

    public void setBrightnessPercentage(int brightnessPercentage) {
        if(brightnessPercentage < 0 || brightnessPercentage > 100){
            System.out.println("Invalid Input" + "\nThe percentage has to be beetween 1 and 100.");
        }
        else{
            this.brightnessPercentage = brightnessPercentage;
        }
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }
}