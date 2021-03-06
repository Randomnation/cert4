package m3topic2activities;
import javax.swing.JOptionPane;

public class AssignVolunteer5 {

	public static void main(String[] args) {

		int donationType;
		String volunteer;
		
		final int CLOTHING_CODE = 1;
		final int FURNITURE_CODE = 2;
		final int ELECTRONICS_CODE = 3;
		final int OTHER_CODE = 4;
		final String CLOTHING_PRICER = "Regina";
		final String OTHER_PRICER = "Marco";
		final String FURNITURE_PRICER = "Walter";
		final String ELECTRONICS_PRICER = "Lydia";
		String message;
		
		String donType = JOptionPane.showInputDialog(null, "What type of donation is this?"+"\n Enter an integer.", "Donation Type",
													JOptionPane.INFORMATION_MESSAGE);
		
		donationType = Integer.parseInt(donType);
		
		while(donationType < CLOTHING_CODE || donationType > OTHER_CODE)
		{
			System.out.println("You entered " + donationType + " which is not a valid donation type");
			String input = JOptionPane.showInputDialog(null, "Please enter a value between " + CLOTHING_CODE + " and " + OTHER_CODE + 
					"\n Enter an integer", "Donation Type", JOptionPane.INFORMATION_MESSAGE);
			donationType = Integer.parseInt(input);
		}
		
		switch(donationType)
		{
			case(CLOTHING_CODE):
				volunteer = CLOTHING_PRICER;
				message = "a clothing donation";
				break;
			case(FURNITURE_CODE):
				volunteer = FURNITURE_PRICER;
				message = "a furniture donation";
				break;
			case(ELECTRONICS_CODE):
				volunteer = ELECTRONICS_PRICER;
				message = "an electronics donation";
				break;
			case(OTHER_CODE):
				volunteer = OTHER_PRICER;
				message = "another donation type";
				break;
			default:
				volunteer = "invalid";
				message = "an invalid donation type";
		}
		
		System.out.println("You entered " + donationType);
		System.out.println("This is " + message);
		System.out.println("The volunteer who will price this item is " + volunteer);
		

	}

}
