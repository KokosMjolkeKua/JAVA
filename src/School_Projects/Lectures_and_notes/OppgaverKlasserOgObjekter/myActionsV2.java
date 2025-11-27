package School_Projects.Lectures_and_notes.OppgaverKlasserOgObjekter;

import static javax.swing.JOptionPane.*;

public class myActionsV2 {
    public static void main(String[] args) {
        myActionsV2 nyAction = new myActionsV2();

        Object[] options = {"Addere", "Subtrahere", "Multiplisere", "Dividere", "Alle Metoder"};

        int choice = showOptionDialog(null, "Velg en metode: ", "Metode Velger: ",
                YES_NO_CANCEL_OPTION, QUESTION_MESSAGE, null, options, options[0]);

        switch (choice) {
            case 0:
                nyAction.metodeA();
                break;
            case 1:
                nyAction.metodeB();
                break;
            case 2:
                nyAction.metodeC();
                break;
            case 3:
                nyAction.metodeD();
                break;
            case 4:
                nyAction.metodeE();
                break;

            case CLOSED_OPTION:
                showMessageDialog(null, "Ingen metode valgt!");
                break;
        }

        boolean continueProgram = true;

        while (continueProgram) {
            showMessageDialog(null, "Det var egentlig alt");

            String input = showInputDialog(null, "Vil du prøve igjen? (Ja/Nei)");

            if (input == null) {
                continueProgram = false;
            } else if (input.equalsIgnoreCase("nei")) {
                continueProgram = false;
            } else if (!input.equalsIgnoreCase("ja")) {
                showMessageDialog(null, "Ikke gylidg, tast enten 'ja' eller 'nei'!.");
            }
        }

        showMessageDialog(null, "Takk for denne gang!");
    }


    public void metodeA() {
        showMessageDialog(null, "Addere har blitt valgt!");
        double tall1 = Double.parseDouble(showInputDialog(null, "Skriv inn et tall:"));
        double tall2 = Double.parseDouble(showInputDialog(null, "Skriv inn et tall til:"));
        double sum = tall1 + tall2;
        String sumToDesimaler = String.format("%.2f", sum);

        showMessageDialog(null, "Når man adderer " + tall1 + " og " + tall2 + " får vi: " + sumToDesimaler + ".");
    }

    public void metodeB() {
        showMessageDialog(null, "Subtrahere har blitt valgt!");
        double tall1 = Double.parseDouble(showInputDialog(null, "Skriv inn et tall:"));
        double tall2 = Double.parseDouble(showInputDialog(null, "Skriv inn et tall til:"));
        double sum = tall1 - tall2;
        String sumToDesimaler = String.format("%.2f", sum);

        showMessageDialog(null, "Når man subtraherer " + tall1 + " og " + tall2 + " får vi: " + sumToDesimaler + ".");
    }

    public void metodeC() {
        showMessageDialog(null, "Multiplisere har blitt valgt!");
        double tall1 = Double.parseDouble(showInputDialog(null, "Skriv inn et tall:"));
        double tall2 = Double.parseDouble(showInputDialog(null, "Skriv inn et tall til:"));
        double sum = tall1 * tall2;
        String sumToDesimaler = String.format("%.2f", sum);

        showMessageDialog(null, "Når man multipliserer " + tall1 + " og " + tall2 + " får vi: " + sumToDesimaler + ".");
    }

    public void metodeD() {
        showMessageDialog(null, "Dividere har blitt valgt!");
        double tall1 = Double.parseDouble(showInputDialog(null, "Skriv inn et tall:"));
        double tall2 = Double.parseDouble(showInputDialog(null, "Skriv inn et tall til:"));
        double sum = tall1 / tall2;
        String sumToDesimaler = String.format("%.2f", sum);

        showMessageDialog(null, "Når man dividerer " + tall1 + " og " + tall2 + " får vi: " + sumToDesimaler + ".");
    }

    public void metodeE() {
        showMessageDialog(null, "Alle metoder har blitt valgt!");
        double tall1 = Double.parseDouble(showInputDialog(null, "Skriv inn et tall:"));
        double tall2 = Double.parseDouble(showInputDialog(null, "Skriv inn et tall til:"));
        double sum1 = tall1 + tall2;
        double sum2 = tall1 - tall2;
        double sum3 = tall1 * tall2;
        double sum4 = tall1 / tall2;

        String sumToDesimaler1 = String.format("%.2f", sum1);
        String sumToDesimaler2 = String.format("%.2f", sum2);
        String sumToDesimaler3 = String.format("%.2f", sum3);
        String sumToDesimaler4 = String.format("%.2f", sum4);

        showMessageDialog(null, "Når man adderer " + tall1 + " og " + tall2 + " får vi: " + sumToDesimaler1 + "."
                + "\nNår man subtraherer " + tall1 + " og " + tall2 + " får vi: " + sumToDesimaler2 + "."
                + "\nNår man multipliserer " + tall1 + " og " + tall2 + " får vi: " + sumToDesimaler3 + "."
                + "\nNår man dividerer " + tall1 + " og " + tall2 + " får vi: " + sumToDesimaler4 + ".");
    }

}

