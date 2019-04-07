/*
	Program: MorraGameApp.java
	Authors: Craig Bell
	Date Updated: 25-03-2019
	Class: Software Development (Java)
*/
import javax.swing.JOptionPane;

public class MorraGameApp{
	public static void main(String args[]){
		//Declare data members
		int p1Fingers;//input - For Human player
		int p2Fingers;//output - Math random input - Computer player
		int p1Score;//output - for the round scores (p1)
		int p2Score;//output - for the round scores (p2)
		int p1BonusScore;
		int p2BonusScore;
		int p1TotalScore;
		int p2TotalScore;
		int total; //total number of fingers shown between the two players
		int winningScore;
		String p1Option;//input - Odds or Evens
		String p2Option;//input - Odds or Evens
		String roundWinner;//output - The round victor!

		//Objects
		MorraGame myGame=new MorraGame();

		//Input
		winningScore = myGame.getWinningScore();
		p1TotalScore = myGame.getP1TotalScore();
		p2TotalScore = myGame.getP2TotalScore();

   		p1Option=JOptionPane.showInputDialog(null, "Would you like to be the option for Odd or Even?").toLowerCase();
				while(!p1Option.equalsIgnoreCase("Odd") || !p1Option.equalsIgnoreCase("Even")){
					JOptionPane.showMessageDialog(null,"Player1 - Please enter odd or even!");

					p1Option=JOptionPane.showInputDialog(null, "Would you like to be the option for Odd or Even?").toLowerCase();
				if(p1Option.equalsIgnoreCase("Odd") || p1Option.equalsIgnoreCase("Even")){
					myGame.setP1Option(p1Option);
					break;
				}
				while(p1TotalScore == winningScore || p2TotalScore == winningScore){
					p1Option=JOptionPane.showInputDialog(null, "Would you like to be the option for Odd or Even?").toLowerCase();
				if(p1Option.equalsIgnoreCase("Odd") || p1Option.equalsIgnoreCase("Even")){
						myGame.setP1Option(p1Option);
					break;
				}
			}
		}
		p1Fingers=Integer.parseInt(JOptionPane.showInputDialog(null, "Enter how many fingers you will show to Player 2: "));
		myGame.setP1Fingers(p1Fingers);

		//Processes
		myGame.compute();

		//Output
		p1Fingers = myGame.getP1Fingers();
		if(p1Fingers==99){
			JOptionPane.showMessageDialog(null,"Player1. The number you entered is outside of the range!");
		}

		else{
			JOptionPane.showMessageDialog(null,"Player One ("+p1Option+") shows "+p1Fingers+" fingers!");
			p2Fingers = myGame.getP2Fingers();
			p2Option = myGame.getP2Option();
			JOptionPane.showMessageDialog(null,"Player Two ("+p2Option+") shows "+p2Fingers+" fingers!");
			total = myGame.getTotal();
			JOptionPane.showMessageDialog(null,"Total fingers shown is "+total); //should show the total number of finger between P1 & P2
			p1Score = myGame.getP1Score();
			p2Score = myGame.getP2Score();
			JOptionPane.showMessageDialog(null,"Player One has "+p1Score+" points and Player Two has "+p2Score+" points.");
			p1BonusScore = myGame.getP1BonusScore();
			p2BonusScore = myGame.getP2BonusScore();
			JOptionPane.showMessageDialog(null,"Player One has "+p1BonusScore+" bonus points and Player Two has "+p2BonusScore+" bonus points.");
			p1TotalScore = myGame.getP1TotalScore();
			p2TotalScore = myGame.getP2TotalScore();
			JOptionPane.showMessageDialog(null,"Player One has "+p1TotalScore+" total points and Player Two has "+p2TotalScore+" total points.");
		}
	}
}
