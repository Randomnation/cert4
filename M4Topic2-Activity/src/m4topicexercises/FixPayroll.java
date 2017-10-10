package m4topicexercises;
import javax.swing.JOptionPane;

public class FixPayroll 
{
   public static void main(String[] args)
   {
      double rate;
      double hoursWorked; double regularPay; double overtimePay;
      final int FULL_WEEK = 40;
      final double OT_RATE = 1.5;
      String hours = JOptionPane.showInputDialog(null, 
    		  "How many hours did you work this week? ", "Work Hours", JOptionPane.QUESTION_MESSAGE);
      hoursWorked = Double.parseDouble(hours);
      String payrate = JOptionPane.showInputDialog(null, 
    		  "What is your regular pay rate? ", "Pay Rate", JOptionPane.QUESTION_MESSAGE);
      rate = Double.parseDouble(payrate);
      if(hoursWorked > FULL_WEEK)
      {
         regularPay = FULL_WEEK * rate;
         overtimePay = (hoursWorked - FULL_WEEK) * OT_RATE * rate;
      }
      else
      {
         regularPay = hoursWorked * rate; overtimePay = 0.0;
      }
      System.out.println("Regular pay is " + regularPay + "\nOvertime pay is " + overtimePay + "\nTotal gross income is " + (regularPay + overtimePay));
   }
}
