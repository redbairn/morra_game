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
	private int p1Score;//output - for the round scores (p1)
	private int p2Score;//output - for the round scores (p2)
	private int total;//process
	private int evens;
	private int odds;
	private String p1Option;//input - Odds or Evens
	private String p2Option;//input - Odds or Evens
	private String roundWinner;//output - The round victor!
	//private String roundWinner;//output - The round victor!


	//Constructor
	public MorraGame(){
		p1Fingers=0;
		p2Fingers = (int) (Math.random()*10); //no between 0 and 10
		p1Score=0;
		p2Score=0;
		evens=0;
		odds=0;
		p1Option="";
		p2Option="";
	}

	//Setters
	public void setP1Fingers(int p1Fingers){
		this.p1Fingers=p1Fingers;
	}
	public void setP1Option(String p1Option){
			this.p1Option=p1Option;
	}
	//Compute
	public void compute(){
		//_Check the number of fingers used by the Human
		if(p1Fingers<1 || p1Fingers>10){
			p1Fingers=99; // Error code
		}
		//_When the Human chooses one option we need to set the other option for the Computer
		if(p1Option=="odd" || p1Option=="Odd" || p1Option=="ODD"){
			p2Option="even";
		}else{
			p2Option="odd";
		}
		//_Total number of fingers between P1 and P2
		total=(p1Fingers+p2Fingers);



		//_Check if there is a remainder
		if(total % 2==0 && p1Option=="even"){
			//need to increment by 2 points
			p1Score = p1Score + 2;
		}else{
			//need to increment by 2 points
			p2Score = p2Score + 2;
		}
		if(total % 2==0 && p2Option=="even"){
			//need to increment by 2 points
			p2Score = p2Score + 2;
		}else{
			//need to increment by 2 points
			p1Score = p1Score + 2;
		}


	}


	//Getters
	//_Return the Option for the Computer
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
	//_Return the Scoreboard
	public int getP1Score(){
		return p1Score;
	}
	public int getP2Score(){
		return p2Score;
	}
}