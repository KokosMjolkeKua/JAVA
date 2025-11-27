package School_Projects.Lectures_and_notes.Forelesning3;

import static javax.swing.JOptionPane.showInputDialog;

public class tall {
    public static void main(String[]args){
        String innStreng1 = showInputDialog("Skriv inn et heltall");
        String innStreng2 = showInputDialog("Skriv inn et heltall til");
        int tall1 = Integer.parseInt(innStreng1);
        int tall2 = Integer.parseInt(innStreng2);
        int sum = tall1 + tall2;
        System.out.println("Summen av de to tallene blir : " + sum);

        String innStreng3 = showInputDialog("Skriv inn et heltall");
        String innStreng4 = showInputDialog("Skriv inn et heltall");
        int tall3 = Integer.parseInt(innStreng3);
        int tall4 = Integer.parseInt(innStreng4);
        int divisjon = tall3 / tall4;
        System.out.println("Divisjonen av de to tallene blir : " + divisjon);
    }
}
