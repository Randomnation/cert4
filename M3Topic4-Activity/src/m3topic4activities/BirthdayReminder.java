package m3topic4activities;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JOptionPane;

public class BirthdayReminder {
	
	public static void main(String[] args) {
		ArrayList<String> friends = new ArrayList<String>();
		ArrayList<String> bdates = new ArrayList<String>();
		
		String friend;
		String date = null;
		String searchValue = null;
		int bDatesIndex = 0;
		boolean loopStart = true;
		
		while(loopStart) {
			friend = JOptionPane.showInputDialog(null,
					"Enter a friend's name or enter ZZZ to goto search \n");
			if(friend.equals("ZZZ") || friends.size() >= 9)
				break;
			else
				if(!friend.equals("ZZZ"))
					friends.add(friends.size(), friend);
					date = JOptionPane.showInputDialog(null, 
							"Enter That friend's birthdate in the format dd/mm/yy \n");
					bdates.add(bdates.size(), date);
		}
		
		displayArray(friends);
		displayArray(bdates);
		
		while(loopStart) {
			searchValue = JOptionPane.showInputDialog(null, 
				"Enter a friend's name to see their birthdate \n" + 
				"or enter ZZZ to quit \n");
			bDatesIndex = friends.indexOf(searchValue);
			if(!friends.contains(searchValue) && !searchValue.equals("ZZZ"))
				System.out.println("Sorry that friend is not in your list");
			else
				if(searchValue.equals("ZZZ"))
					break;
				else
					if(!searchValue.equals("ZZZ"))
						System.out.println(searchValue + "'s birthdate is " + 
											bdates.get(bDatesIndex));
		}
		
	}
	
	private static void displayArray(ArrayList<String> array)
	{
		int i;
		for(i = 0; i < array.size(); ++i)
			System.out.print(" " + array.get(i));
			System.out.println();
	}
	
}
