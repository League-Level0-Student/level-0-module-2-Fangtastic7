package conditionals;

import javax.swing.JOptionPane;

public class VotingBooth {
	public static void main(String[] args) {
		String age = JOptionPane.showInputDialog("How old are you?");
		int age1 = Integer.parseInt(age);
		if(age1>18) {
			JOptionPane.showInputDialog("Who should be the next president?");
		}
		else {
			JOptionPane.showMessageDialog(null,"You are not very important, sorry!");
			}
			
		
	}
}
