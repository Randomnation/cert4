package m4topic2activities;
import javax.swing.*;

public class BadSubscriptCaught {

	public static void main(String[] args) {
		int input = 0;
		String[] names = {"Jason", "Bob", "Mark", "Sarah", "Melissa", "Keith", "John", "Louise", "Kelly", "Aaron"}; 
		String inputString;
		boolean loopStart = true;
		
		while(loopStart)
			try
			{
				inputString = JOptionPane.showInputDialog(null, "Enter a number to see the name at that location");
				input = Integer.parseInt(inputString);
				if(inputString.equals("exit"))
					loopStart = false;
				JOptionPane.showMessageDialog(null, names[input]);
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				JOptionPane.showMessageDialog(null, "The Index that was entered is out of range.");
			}
			catch(NumberFormatException er)
			{
				JOptionPane.showMessageDialog(null, 
						"That was not a number. Suspect that 'exit' was typed. Exiting application...");
				loopStart = false;
			}
	}

}
