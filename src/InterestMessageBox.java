/* 
   9/22/14
   Calculating interest and formatting as dollar amount using NumberFormat
   JDK 1.7
 */
import java.text.NumberFormat;
import javax.swing.JOptionPane;
public class InterestMessageBox {

    public static void main(String[] args) {
    
        String input1 = JOptionPane.showInputDialog(null,
                "How many dollars do you wish to borrow?");
        double dollars = Double.parseDouble(input1);
        String input2 = JOptionPane.showInputDialog(null,
                "What is the interest rate?");  
        double rate  = Double.parseDouble(input2);
        String input3= JOptionPane.showInputDialog(null,
                "How many years will you take the loan? (whole number)");
        int years  = Integer.parseInt(input3);
        double interest = dollars * years * rate/100;
        NumberFormat dollar = NumberFormat.getCurrencyInstance();
        JOptionPane.showMessageDialog(null,"If you borrow " 
                + dollar.format(dollars) + " at an interest rate of " + rate
                +"\nfor " + years +" years, you will pay " 
                + dollar.format(interest) +" in interest.");
    }
}