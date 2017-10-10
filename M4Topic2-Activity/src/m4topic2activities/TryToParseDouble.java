package m4topic2activities;
import javax.swing.*;

public class TryToParseDouble {

	public static void main(String[] args) {
		String doubleInput;
		double stringToDouble = 0;
		boolean loopStart = true;

		while(loopStart)
			try
			{
				doubleInput = JOptionPane.showInputDialog(null, 
						"Enter a string to be converted to a double");
				stringToDouble = Double.parseDouble(doubleInput);
			}
			catch(NumberFormatException e)
			{
				JOptionPane.showMessageDialog(null, 
						"Input cannot be converted to a double. Setting to '0' then exiting application...");
				stringToDouble = 0;
				loopStart = false;
			}
			finally
			{
				JOptionPane.showMessageDialog(null, 
						"Your converted input is " + stringToDouble);
			}
	}

}
