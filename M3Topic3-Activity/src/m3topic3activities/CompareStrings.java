package m3topic3activities;
import javax.swing.JOptionPane;
public class CompareStrings 
{
   public static void main(String[] args) 
   {
      String aName = "Carmen"; 
      String anotherName= JOptionPane.showInputDialog(null, "Enter your name", "Details", JOptionPane.INFORMATION_MESSAGE);
      if(aName.equals(anotherName))
         System.out.println(aName + " equals " + anotherName);
      else
         System.out.println(aName + " does not equal " +  anotherName);
   }
}
