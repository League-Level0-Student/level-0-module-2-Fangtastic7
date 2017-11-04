package extra;

import java.util.Random;

import javax.swing.JOptionPane;

public class Lottery_Numbers {
public static void main(String[] args) {
	

//1: Get 5 random numbers to put on your lottery ticket
	Random rand = new Random();
	rand.nextInt(9);
	for(int i=0;i<5;i++) {
		System.out.println();
	}
	int total = 
//2: Display the selected numbers to the user in a pop-up
	JOptionPane.showConfirmDialog(null, "The numbers are" + (rand));

}
}