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
		int score1;//output - for the round scores (p1)
		int score2;//output - for the round scores (p2)
		String option;//input - Odds or Evens
		String roundWinner;//output - The round victor!

		//Objects
		MorraGame myGame=new MorraGame();

		//Input
		option=JOptionPane.showInputDialog(null, "Would you like to be Odds or Evens?");
		myGame.setOption(option);

		p1Fingers=Integer.parseInt(JOptionPane.showInputDialog(null, "Enter how many fingers you will show to Player 2: "));
		myGame.setP1Fingers(p1Fingers);

		//Processes
		myGame.compute();

		//Output
		p1Fingers = myGame.getP1Fingers();
		JOptionPane.showMessageDialog(null,"Player One shows "+p1Fingers+"fingers!");
		p2Fingers = myGame.getP2Fingers();
		JOptionPane.showMessageDialog(null,"Player One shows "+p2Fingers+"fingers!");

	}
}