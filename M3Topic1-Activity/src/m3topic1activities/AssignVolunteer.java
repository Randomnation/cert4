package m3topic1activities;
import javax.swing.JOptionPane;

public class AssignVolunteer {

	public static void main(String[] args) {

		int donationType;
		String volunteer;
		
		final int CLOTHING_CODE = 1;
		final int OTHER_CODE = 2;
		final String CLOTHING_PRICER = "Regina";
		final String OTHER_PRICER = "Marco";
		
		String donType = JOptionPane.showInputDialog(null, "Enter " + CLOTHING_CODE + 
													" for clothing. " + OTHER_CODE + " for anything else." + 
													"\n What type of donation is this?","Donation Type",
													JOptionPane.INFORMATION_MESSAGE);
		
		donationType = Integer.parseInt(donType);
		
		if(donationType == CLOTHING_CODE)
			volunteer = CLOTHING_PRICER;
		else
			volunteer = OTHER_PRICER;
		
		
		System.out.println("You entered " + donationType);
		System.out.println("The volunteer who will price this item is " + volunteer);
		

	}

}
