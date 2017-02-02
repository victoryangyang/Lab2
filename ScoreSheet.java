
public class ScoreSheet {
	private Player playerOne;
	
	public ScoreSheet(){
		this.playerOne = new Player("VJ2");
	}
}

class Frame{
	private int [] frame;
	
	public Frame(){
		this.frame = new int[2];
	}
	public int getLeftThrow(int frameInt){
		return frame[0];
	}
	public int getRightThrow(int frameInt){
		return frame[1];
	}
}

class Player{
	int index = 0;
	private int score;
	private String name;
	private Frame [] playerFrame;
	
	public Player(String name){
		score = 0;
		this.name = name;
		playerFrame = new Frame [10];
	}
	public int getScore(){
		return this.score;
	}
	public String getName(){
		return this.name;
	}
	public int checkFrame(){
		
		//returns if strike
		if (playerFrame[index-1].getLeftThrow(index - 1) == 10){
			return 1;
		}
		//returns if spare
		else if (playerFrame[index-1].getLeftThrow(index-1) + playerFrame[index-1].getRightThrow(index-1) == 10){
			return 2;
		}
		//returns regular score
		return 3;
		
	}
	public void throwBBall(){
		
	}
}

