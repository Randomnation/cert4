package m4topic1activities;
import javax.swing.JOptionPane;

public class UseDinnerParty {

	public static void main(String[] args) {
		int guests;
		int choice;
		Party aParty = new Party();
		DinnerParty aDinnerParty = new DinnerParty();
		
		String numberofguest = JOptionPane.showInputDialog(null, 
							 "Enter a number of guests for the party;");
		guests = Integer.parseInt(numberofguest);
		aParty.setGuests(guests);
		
		System.out.println("The party has " + aParty.getGuests() + " guests");
		aParty.displayInvitation();
		
		String numberofdinnerguests = JOptionPane.showInputDialog(null, 
									"Enter number of guests for the dinner party");
		guests = Integer.parseInt(numberofdinnerguests);
		aDinnerParty.setGuests(guests);
		
		String dinnerchoice = JOptionPane.showInputDialog(null,
							"Enter the menu option" + 
							"\n 1- for chicken" + "\n 2- for beef");
		choice = Integer.parseInt(dinnerchoice);
		aDinnerParty.setDinnerChoice(choice);
		System.out.println("The dinner party has " + aDinnerParty.getGuests() + " guests");
		System.out.println("Menu option " + aDinnerParty.getDinnerChoice() + " will be served");
		
		aDinnerParty.displayInvitation();
	}

}
