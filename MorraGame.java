/*
	Program: MorraGame.java
	Authors: Craig Bell
	Date Updated: 25-03-2019
	Class: Software Development (Java)
*/
// Import the Math class to use the random method (Computer player)
import java.lang.Math.*;
public class MorraGame{
	//data members - instance variables
	private int p1Fingers;//input - For Human player
	private int p2Fingers;//output - Math random input - Computer player
	private int score1;//output - for the round scores (p1)
	private int score2;//output - for the round scores (p2)
	private int total;//process
	private String option;//input - Odds or Evens
	private String roundWinner;//output - The round victor!


	//Constructor
	public MorraGame(){
		p1Fingers=0;
		p2Fingers = (int) (Math.random()*10); //no between 0 and 10
		score1=0;
		score2=0;
		option="";
	}

	//Setters
	public void setP1Fingers(int p1Fingers){
		this.p1Fingers=p1Fingers;
	}
	public void setOption(String option){
			this.option=option;
	}
	//Compute
	public void compute(){
		//_Total number of fingers between P1 and P2
		total=(p1Fingers+p2Fingers);
		//_Check if there is a remainder
		if(){
			//need to increment by 2 points
		}else{
			//need to increment by 2 points
		}
	}


	//Getters
	//_Return the number of fingers shown by player1
	public int getP1Fingers(){
				return p1Fingers;
	}
	//_Return the number of fingers shown by player2
	public int getP2Fingers(){
					return p2Fingers;
	}
	//_Return the Round Winner
	public String getRoundWinner(){
			return roundWinner;
	}
	//_Return the Scoreboard
	public int getScore1(){
				return score1;
	}
	public int getScore2(){
					return score2;
	}
}