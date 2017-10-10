package m4topic2activities;
import javax.swing.JOptionPane;
public class AssignVolunteer3 
{
   public static void main(String[] args) 
   {
      int donationType;
      String volunteer;
      final int CLOTHING_CODE = 1;
      final int OTHER_CODE = 2;
      final String CLOTHING_PRICER = "Regina."; 
      final String OTHER_PRICER = "Marco.";
      String message;
      String donType= JOptionPane.showInputDialog(null, "Enter " + CLOTHING_CODE + 
    		             " for clothing. "  +OTHER_CODE + " for anything else." +  
						 "\n What type of donation is this?", "Donation Type", 
						 JOptionPane.QUESTION_MESSAGE);
      donationType=Integer.parseInt(donType);
      if (donationType == OTHER_CODE)
      {
         volunteer = CLOTHING_PRICER; 
         message = "a clothing donation.";
      }
      else if (donationType == CLOTHING_CODE)
           {
              volunteer = OTHER_PRICER;
	          message = "a non-clothing donation.";
	       }
	       else
	       {
	          message="an invalid donation type";
	          volunteer="invalid";			
           }
      System.out.println("You entered " + donationType);
      System.out.println("This  is  "  +  message);
      System.out.println("The volunteer who will price this item is " +volunteer);
   }
}
