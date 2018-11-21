
public class highScorePosition {

	public static void main(String[] args) {
		int position=calculateHighScorePosition(15000);
		displayHighScorePosition("Mike", position);
		position=calculateHighScorePosition(900);
		displayHighScorePosition("John", position);
		position=calculateHighScorePosition(400);
		displayHighScorePosition("Sam", position);
		position=calculateHighScorePosition(50);
		displayHighScorePosition("Anna", position);
		
		//displayHighScorePosition("Tedd", calculateHighScorePosition(100)); -better code
		

	}
	public static void displayHighScorePosition(String playerName,int position) {
		System.out.println(playerName +" managed to get into position " + position);
	}
	public static int calculateHighScorePosition(int playerScore) {
		if(playerScore>=1000) {
			return 1;
		}else if(playerScore>=500 && playerScore<1000) {
			return 2;
		}else if(playerScore>=100 && playerScore<500) {
			return 3;
		}else {
			return 4;
		}
	
		
	}

}
