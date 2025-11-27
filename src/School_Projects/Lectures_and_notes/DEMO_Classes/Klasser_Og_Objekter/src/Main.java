package School_Projects.Lectures_and_notes.DEMO_Classes.Klasser_Og_Objekter.src;

import static javax.swing.JOptionPane.showMessageDialog;

class Account{
    private String bank;

    public void showBank(){
        showMessageDialog(null, "Your bank is " + bank + ".");
    }

    public String infoBank(){
        return "Your bank is " + bank + "." ;
    }

    public String getBank(){ //String fordi jeg får informasjon!
        return bank;
    }

    public void setBank(String newBankName){ //void fordi jeg gir den informasjon
        bank = newBankName;
    }

    public void setBankTwo(String bank){
        this.bank = bank;
    }
}

public class Main {
    public static void main(String[]args){

        Account user = new Account();
        showMessageDialog(null, user.getBank()); // = "Sparebank 1"; //showInputDialog(null, "What is your Bank?");

        user.setBank("Sparebank 1");

        showMessageDialog(null, user.infoBank()); //hvis vi skal skrive ut en return verdi
        user.showBank();

        user.setBankTwo("HandelsBanken");
        showMessageDialog(null, user.infoBank()); //hvis vi skal skrive ut en return verdi
        user.showBank();
    }
}
