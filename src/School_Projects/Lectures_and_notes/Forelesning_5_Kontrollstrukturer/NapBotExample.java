package School_Projects.Lectures_and_notes.Forelesning_5_Kontrollstrukturer;

class NapBot{
    private int hoursLeft;

    public void setHoursLeft(int hoursLeft){
        if(hoursLeft > 0 ){
            this.hoursLeft = hoursLeft;
        }else{
            System.out.println("Det må være mer enn 0 timer!");
        }
    }

}


public class NapBotExample {
    NapBot napBot600 = new NapBot();


}
