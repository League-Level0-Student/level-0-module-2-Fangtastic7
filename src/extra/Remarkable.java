package extra;

import javax.swing.JOptionPane;

public class Remarkable {
	public static void main(String[] args) {
		String names = JOptionPane.showInputDialog("Give me your name so I can tell you how remarkable you are?");
		if(names.equalsIgnoreCase( "Kyle")) {
			JOptionPane.showMessageDialog(null, "You are very intelligent, very curious, and very swift.");
		}
		else if(names.equalsIgnoreCase( "Phillip")) {
			JOptionPane.showMessageDialog(null, "You are a master coder, you can make the next AI!");
		}
		else if(names.equalsIgnoreCase("Ryan")) {
			JOptionPane.showMessageDialog(null, "You are very swift, you are the master coder in the future!");
		}
		else {
			JOptionPane.showMessageDialog(null, "You are the future master coder of the world! You have integrity and the brains to do it.");
		}
		System.exit(0);
	}
}
