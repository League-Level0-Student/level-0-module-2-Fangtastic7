package conditionals;

import javax.swing.JOptionPane;

public class RollerCoaster {
	public static void main(String[] args) {
		String height = JOptionPane.showInputDialog("How tall are you?");
		int theirheight = Integer.parseInt(height);
		if(theirheight>48) {
			JOptionPane.showMessageDialog(null, "You can go on the roller coaster!");
		}
		else {
			JOptionPane.showMessageDialog(null, "You cannot got on the roller coaster because you are too short! Please grow before coming back. :)");
		}
	}
}
