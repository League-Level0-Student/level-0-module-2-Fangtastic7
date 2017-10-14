//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0
package extra;

import javax.swing.JOptionPane;

public class BirthdayReminder {
	public static void main(String[] args) {
		
		// 1. OPTION: correct the birthdays for your family below
		String momsBirthday = "January 24th";
		String dadsBirthday = "June 9th";
		String myBirthday = "April 16th";

		// 2. Find out whose birthday the user wants and and store their response in a variable
		String answer = JOptionPane.showInputDialog("Whose birthday do you want to know?");
		// 3. Print out what the user typed
		if(answer.equalsIgnoreCase("yours")) {
			JOptionPane.showMessageDialog(null, "You want to know my birthday?");
		}
		else {
		JOptionPane.showMessageDialog(null, "So.... you want to know " + answer + "'s birthday?");
		}
		// 4. if user asked for "mom"
			//print mom's birthday
			if(answer.equalsIgnoreCase("mom's")){
				JOptionPane.showMessageDialog(null, momsBirthday);
				
			}
		// 5. if user asked for "dad"
			// print dad's birthday
			else if (answer.equalsIgnoreCase("father's")) {
				JOptionPane.showMessageDialog(null, dadsBirthday);
				
			}
		// 6. if user asked for you
			// print myBirthday
			else if(answer.equalsIgnoreCase("yours")) {
				JOptionPane.showMessageDialog(null, myBirthday);
				
				
			}
		//7. otherwise print "Sorry, i don't remember that person's birthday!"
			else {
				JOptionPane.showMessageDialog(null, "Sorry, I forgot that person's birthday.");
				System.exit(0);
			}
	} 

}
