package School_Projects.Exam_practice.Repetittion;

import static javax.swing.JOptionPane.*;

public class Oppg_2 {
    private int number;

    public Oppg_2(int number){
        this.number = number;
    }

    public void getMonth(){
        String month = "";
        if(number % 12 == 0){
            month = "January";
        }
        if(number % 12 == 1){
            month = "February";
        }
        if(number % 12 == 2){
            month = "March";
        }
        if(number % 12 == 3){
            month = "April";
        }
        if(number % 12 == 4){
            month = "May";
        }
        if(number % 12 == 5){
            month = "June";
        }
        if(number % 12 == 6){
            month = "July";
        }
        if(number % 12 == 7){
            month = "August";
        }
        if(number % 12 == 8){
            month = "September";
        }
        if(number % 12 == 9){
            month = "October";
        }
        if(number % 12 == 10){
            month = "November";
        }
        if(number % 12 == 11){
            month = "December";
        }

        System.out.println("Based on the input number: " + number +
                "\nThe month is " + month);
    }


    public static void main(String[]args){

        Oppg_2 testNr = new Oppg_2(3);
        testNr.getMonth();

        int[] monthArray = {0,1,2,3,4,5,6,7,8,9,10,11};
        int inputNr = Integer.parseInt(showInputDialog("Write your "));


    }
}
