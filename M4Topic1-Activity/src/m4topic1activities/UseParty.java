package m4topic1activities;
import javax.swing.JOptionPane;

public class UseParty {

	public static void main(String[] args) {
		int guests;
		Party aParty = new Party();
		String numberofguest = JOptionPane.showInputDialog(null, 
				"Enter a number of guests for the party;");
		guests = Integer.parseInt(numberofguest);
		aParty.setGuests(guests);
		System.out.println("The party has " + aParty.getGuests() + " guests");
		aParty.displayInvitation();
	}

}
