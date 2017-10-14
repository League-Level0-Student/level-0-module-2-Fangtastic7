//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package conditionals;

import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
			int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
			String riddle = JOptionPane.showInputDialog("What do you call a sick eagle?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
			if(riddle.equalsIgnoreCase("illegal")) {
			JOptionPane.showMessageDialog(null, "You are correct!");
			score = score+1;
			}
		// 5. Otherwise, say "wrong" and tell them the answer
			else {
				JOptionPane.showMessageDialog(null, "wrong!");
			}
		// 6. Add some more riddles
			String riddle2 = JOptionPane.showInputDialog("What do you call an eagle flying over a bay?");
			
			if(riddle2.equalsIgnoreCase("bagle")){
				JOptionPane.showMessageDialog(null, "Right!");
				score = score+1;
			}
			
		// 2. Make a pop up to show the score.
			JOptionPane.showMessageDialog(null, "Your score is " + score);
	}
}

