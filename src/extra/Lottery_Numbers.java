package extra;

import java.util.Random;

import javax.swing.JOptionPane;

public class Lottery_Numbers {
public static void main(String[] args) {
	

//1: Get 5 random numbers to put on your lottery ticket
	String lottery = "";
	for(int i=0;i<5;i++) {
	int x = new Random().nextInt(9);
	
	
		
	lottery = lottery + " " + Integer.toString(x) ;
	}
//2: Display the selected numbers to the user in a pop-up
	JOptionPane.showMessageDialog(null,"The numbers are " + lottery);

}
}