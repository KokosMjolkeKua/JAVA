package Classes_Objects_Assignments;
import static javax.swing.JOptionPane.*;

class Konto {
    private String accountName;
    private int accountNumber;
    private double accountAmount;

    public Konto(String accountName, int accountNumber, double accountAmount) {
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.accountAmount = accountAmount;
    }

    public void printAccount() {
        showMessageDialog(null, "Name: " + accountName +
                "\nAccount-Number: " + accountNumber + "\nBalance: " + accountAmount);
    }

    public double setBalance() {
        double newBalance = Double.parseDouble(showInputDialog(null, "What amount are you adding to your balance?"));
        accountAmount += newBalance;
        return this.accountAmount;
    }

    public double getBalance() {
        return this.accountAmount;
    }

    public boolean canPay() {
        double payment = Double.parseDouble(showInputDialog(null, "How much would you like to take out?"));
        if (!(accountAmount >= payment)) {
            showMessageDialog(null, "You dont have enough money");
            return false;
        }
        showMessageDialog(null, "You withdraw " + payment + " NOK from your account.");
        double newBalance = accountAmount - payment;
        accountAmount -= newBalance;
        return true;
    }
}

public class Assignment_9 {
    public static void main(String[]args) {
        Konto konto = new Konto("Inga", 1452456156, 400);
        konto.printAccount();
        konto.setBalance();
        konto.canPay();
        konto.printAccount();

    }
}
