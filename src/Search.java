import java.util.ArrayList;

public class Search {
	private static ArrayList<Voter> voterList = MainMenu.voterList;
	
	//Search by VoterID
	//returns null if not found
	public static Voter byID(int ID) {
		for(Voter voter:voterList) {
			if(voter.getVoterID() == ID) return voter;
		}
		return null;
	}
}
