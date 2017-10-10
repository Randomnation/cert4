package m3topic4activities;
import java.util.*;
import javax.swing.JOptionPane;

public class ColoursArrayList {

	public static void main(String[] args) {
		char response;
		ArrayList<String> myColours = new ArrayList<String>();
		myColours.add("Red");
		myColours.add("Green");
		myColours.add("Blue");
		myColours.add("Yellow");
		
		do
		{
			String answer = JOptionPane.showInputDialog(null,
					"Enter A to add an element \n" +
					"R to remove an element \n" +
					"S to search for an element in the array \n" +
					"D to display all elements in an array \n" +
					"Q to quit this program");
			response = answer.charAt(0);
			if(response == 'A')
				addToArray(myColours);
			else
				if (response == 'R')
					removeFromArray(myColours);
				else
					if(response == 'D')
						displayArray(myColours);
					else
						if(response == 'S')
							searchArray(myColours);
		} while(response != 'Q');
	}
	
	private static void addToArray(ArrayList<String> myColours) 
	{
		String answer = JOptionPane.showInputDialog(null,
				"Enter colour to add to the array.");
		myColours.add(myColours.size(), answer);
		displayArray(myColours);
	}
	
	private static void removeFromArray(ArrayList<String> myColours)
	{
		int i;
		Boolean found = false;
		String answer = JOptionPane.showInputDialog(null,
				"Enter colour to remove from the array.");
		for(i = 0; i < myColours.size(); ++i)
			if(answer.equals(myColours.get(i)))
			{
				found = true;
				myColours.remove(i);
				displayArray(myColours);
			}
			if(found == false)
				JOptionPane.showMessageDialog(null, "Colour not found!");
	}
	
	private static void searchArray(ArrayList<String> myColours)
	{
		int low, mid, high;
		int returnValue = -1;
		boolean found = false;
		String searchValue = JOptionPane.showInputDialog(null,
				"Enter colour to find.");
		
		Collections.sort(myColours);
		
		low = 0;
		high = myColours.size();
		
		while(!found)
		{
			mid = (high + low)/2;
			if(searchValue.compareTo(myColours.get(mid)) == 0)
			{
				returnValue = mid;
				found = true;
			}
			else
				if(high - low < 2)
				{
					returnValue = -1;
					found = true;
				}
				else
					if(searchValue.compareTo(myColours.get(mid)) > 0)
						low = mid;
					else
						high = mid;
		}
		
		if(returnValue == -1)
			JOptionPane.showMessageDialog(null, "Colour not found.");
		else
			JOptionPane.showMessageDialog(null, "Colour found at index " + returnValue + ".");
	}
	
	private static void displayArray(ArrayList<String> myColours)
	{
		int i;
		for(i = 0; i < myColours.size(); ++i)
			System.out.println(myColours.get(i));
	}

}
