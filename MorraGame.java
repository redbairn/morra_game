/*
	Program: MorraGame.java
	Authors: Craig Bell, David Flood, Jason Merrigan
	Jason Git Commit Test
	Date Updated: 25-03-2019
	Class: Software Development (Java)
*/
// Import the Math class to use the random method (Computer player)
import java.lang.Math.*;
public class MorraGame{
	//data members - instance variables
	private int p1Fingers;//input - For Human player
	private int p2Fingers;//output - Math random input - Computer player
	private int p1Score;//output - for the round scores (p1)
	private int p2Score;//output - for the round scores (p2)
	private int total;//process
	private int distance;// compute
	private int p1BonusScore;
	private int p2BonusScore;
	private int p1TotalScore;
	private int p2TotalScore;
	private int winningScore;
	private String evens;
	private String odds;
	private String p1Option;//input - Odds or Evens
	private String p2Option;//input - Odds or Evens
	private String roundWinner;//output - The round victor!
	//private String roundWinner;//output - The round victor!


	//Constructor
	public MorraGame(){
		p1Fingers=0;
		//p2Fingers = (int) (Math.random()*10); //no between 0 and 10
		p2Fingers = 1 + (int)(Math.random() * ((10 - 1) + 1));
		p1Score=0;
		p2Score=0;
		p1BonusScore=0;
		p2BonusScore=0;
		p1TotalScore=0;
		p2TotalScore=0;
		winningScore=6;
		distance=0;
		evens="";
		odds="";
		total=0;
		p1Option="";
		p2Option="";


	}

	//Setters
	public void setP1Fingers(int p1Fingers){
		this.p1Fingers=p1Fingers;
	}
	public void setP2Fingers(int p2Fingers){
		this.p2Fingers=p2Fingers;
	}
	public void setP1Option(String p1Option){
		this.p1Option=p1Option;
	}
	public void setP2Option(String p2Option){
		this.p2Option=p2Option;
	}
	public void setTotal(int total){
		this.total=total;
	}
	//Compute
	public void compute(){
		//_Check the number of fingers used by the Human
		if(p1Fingers<1 || p1Fingers>10){
			p1Fingers=99; // Error code
		}
		//_When the Human chooses one option we need to set the other option for the Computer
		if(p1Option.equalsIgnoreCase("odd")){
			p2Option="even";
		}else if(p1Option.equalsIgnoreCase("even")){
			p2Option="odd";
		}
		//_Total number of fingers between P1 and P2
		total=(p1Fingers+p2Fingers);


		//_Awarding the 2 points
		//_Check if there is a remainder
		if(total % 2==0){
			//need to increment by 2 points
			if(p1Option.equals("even"))
				p1Score = p1Score + 2;
			else
				p2Score = p2Score + 2;
		}else{
		 	if(p1Option.equals("odd"))
		 		p1Score = p1Score + 2;
		 	else
				p2Score = p2Score + 2;
		}

		//_Bonus Points

		if (Math.abs(p1Fingers-total) <= Math.abs(p2Fingers-total)){
			p1BonusScore = p1BonusScore + 1;
		}
		else if(p1Fingers==p2Fingers){ //edge case where both players show the same number of fingers
			p1BonusScore = p1BonusScore + 0;
			p2BonusScore = p2BonusScore + 0;
		}

		else{
		  p2BonusScore = p2BonusScore + 1;
		}
		// running total score
		p1TotalScore=p1Score+p1BonusScore;
		p2TotalScore=p2Score+p2BonusScore;



	}

	//Getters
	//_Return the Option for the Computer
	public String getP1Option(){
		return p1Option;
	}
	public String getP2Option(){
		return p2Option;
	}
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
	//return the total fingers
	public int getTotal(){
		return total;
	}
	//_Return the Scoreboard
	public int getP1Score(){
		return p1Score;
	}
	public int getP2Score(){
		return p2Score;
	}
	public int getP1BonusScore(){
		return p1BonusScore;
	}
	public int getP2BonusScore(){
		return p2BonusScore;
	}
	public int getP1TotalScore(){
		return p1TotalScore;
	}
	public int getP2TotalScore(){
		return p2TotalScore;
	}
	public int getWinningScore(){
		return winningScore;
	}
}