package Control_Structure;
import static javax.swing.JOptionPane.*;
public class Assignment_Other_3 {
    public static void main(String[]args){
        String inputIncome;
        double income;
        double tax;
        String out = "";
        for (int i = 1; i < 4; i++){
            inputIncome = showInputDialog(null, "Write in the income of the person:");
            income = Double.parseDouble(inputIncome);
            if (income > 500_000){
                tax = (income - 500_000) * 0.5;
                tax += 500_000 *0.3;
            }
            else{
                tax = income * 0.3;
            }
            out += "With an income of " + inputIncome + " kr." + "\nYou get a tax of " + tax + " kr.\n \n";
        }
        showMessageDialog(null, out);
    }
}
