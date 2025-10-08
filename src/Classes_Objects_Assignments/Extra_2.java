package Classes_Objects_Assignments;
import static javax.swing.JOptionPane.*;

class Tax2 {
    double income;
    double groundTax;
    double trinnTax;


    public Tax2() {
        this.income = income;
        this.groundTax = groundTax;
        this.trinnTax = trinnTax;
    }

    public boolean groundTax() {
        double i = Double.parseDouble(showInputDialog(null, "What is your annual income?"));
        if (i < 100_00) {
            showMessageDialog(null, "You do not have to pay tax this year!");
            income = i;
            return true;
        } else {
            double tax = (i - 100_000) * 0.22;
            showMessageDialog(null, "You wrote your income as " + i + ", you then have " + tax + " in tax!");
            groundTax = tax;
            income = i;
        }
        return false;
    }

    public boolean trinnTax(){
        double t;
        if (income > 217_401){
            if (income > 217_401 && income < 306_050){
                t = income * 0.017;
                showMessageDialog(null, "Your Trinn-Tax is at 1.7% and is " + t);
                trinnTax = t;
                return true;
            }
            if (income > 306_051 && income < 697_150){
                t = (income - 100_000) * 0.04;
                showMessageDialog(null, "Your Trinn-Tax is at 4.0% and is " + t);
                trinnTax = t;
                return true;
            }
            if (income > 697_150 && income < 942_400){
                t = (income - 100_000) * 0.137;
                showMessageDialog(null, "Your Trinn-Tax is at 13.7% and is " + t);
                trinnTax = t;
                return true;
            }
            if (income > 942_400 && income < 1_410_750){
                t = (income - 100_000) * 0.167;
                showMessageDialog(null, "Your Trinn-Tax is at 16.7% and is " + t);
                trinnTax = t;
                return true;
            }
            if (income > 1_410_750){
                t = (income - 100_000) * 0.177;
                showMessageDialog(null, "Your Trinn-Tax is at 17.7% and is " + t);
                trinnTax = t;
                return true;
            }
            return false;
        } else {
            showMessageDialog(null, "You do not have enough income to pay trinn-tax.");
        }
        return false;
    }

    public void printTax() {
        showMessageDialog(null, "Income: " + income + "\nGround-Tax: " + groundTax + "\nTrinn-Tax: " + trinnTax);
    }

    public void totaleTax(){
        double total = groundTax + trinnTax;
        showMessageDialog(null, "Based on your income of: " + income +
                "\nYou have to pay a total of: " + total + " in taxes.");
    }
}

public class Extra_2 {
    public static void main(String[]args){
        Tax2 tax = new Tax2();
        tax.groundTax();
        tax.trinnTax();

        tax.printTax();
        tax.totaleTax();
    }
}
