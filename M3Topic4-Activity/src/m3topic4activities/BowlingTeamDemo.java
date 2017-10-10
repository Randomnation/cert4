package m3topic4activities;
import javax.swing.JOptionPane;

public class BowlingTeamDemo {

	public static void main(String[] args) {
		String name;
		BowlingTeam bowlTeam = new BowlingTeam();
		int x;
		final int NUM_TEAM_MEMBERS = 4;
		
		name = JOptionPane.showInputDialog(null, "Enter team name");
		bowlTeam.setTeamName(name);
		
		for(x = 0; x < NUM_TEAM_MEMBERS; ++x){
			name = JOptionPane.showInputDialog(null, "Enter team member's name");
			bowlTeam.setMember(x, name);
		}
		
		System.out.println("\nMembers of team " + bowlTeam.getTeamName());
		for(x = 0; x < NUM_TEAM_MEMBERS; ++x)
			System.out.print(bowlTeam.getMember(x) + " ");
		System.out.println();
	}

}
