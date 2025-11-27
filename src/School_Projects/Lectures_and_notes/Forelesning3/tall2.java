package School_Projects.Lectures_and_notes.Forelesning3;

import static javax.swing.JOptionPane.showInputDialog;

public class tall2 {
    public static void main(String[] args){
        String innStreng = showInputDialog("Skriv inn et heltall!");
        int tall = Integer.parseInt(innStreng);
        try{
            tall = Integer.parseInt(innStreng);
        } catch (Exception e){
            tall = 0;
            System.out.println("Du må skrive inn et heltall!");
        }
        System.out.println("Tallet du skrev inn er : " + tall);
    }
}
