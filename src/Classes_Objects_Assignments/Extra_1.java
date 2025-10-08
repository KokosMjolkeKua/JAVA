package Classes_Objects_Assignments;
import static javax.swing.JOptionPane.*;

class Tax{
    double income;
    public Tax(){
        this.income = income;
    }

    public boolean myTax(){
        double i = Double.parseDouble(showInputDialog(null, "What is your annual income?"));
        if (i < 100_00){
            showMessageDialog(null, "You do not have to pay tax this year!");
            return true;
        } else {
            double tax = i * 0.22;
            showMessageDialog(null, "You wrote your income as " + i + ", you then have " + tax + " in tax!");

        } return false;
    }

}

public class Extra_1 {
    public static void main(String[]args){
        Tax tax = new Tax();
        tax.myTax();
    }
}
