package School_Projects.Exam_practice.Module_five;

import static javax.swing.JOptionPane.*;

public class O_1 {
    public static void main(String[]args){

        showMessageDialog(null, "Tax-Calculator:");
        String incomeInput = showInputDialog("What is your income in kr?");
        double income;
        try{
            income = Double.parseDouble(incomeInput);

            if(income > 0){
                if(income <= 100_000){
                    showMessageDialog(null, "You have no tax, and will receive the "
                            + income + "kr in its entirety");
                }
                double taxedIncome = (income - 100_000) * 0.22;
                double incomeAfterTax = income - taxedIncome;
                if(income > 100_000){
                    showMessageDialog(null, "You will be taxed " + taxedIncome + "kr." +
                            "\nAnd after tax you will receive " + incomeAfterTax + "kr.");
                }
            }
        }
        catch(Exception e){
            income = 0;
            showMessageDialog(null, "You have to write a number..");
        }

    }
}
