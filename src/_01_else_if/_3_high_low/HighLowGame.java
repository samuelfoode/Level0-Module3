
package _01_else_if._3_high_low;

import java.util.Random;

import javax.swing.JOptionPane;

public class HighLowGame {

	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100. 
		int random = new Random().nextInt(101)+1;
		for(int i = 0; i<=100; i++) {
		
		
		// 2. Print out the random variable above
		System.out.println(""+random);
		
		// 11. Repeat steps 1 to 10 ten times
		
			// 1. Ask the user for a guess using a pop-up window, and save their response 
		String guess = JOptionPane.showInputDialog(null, "ask for a guess");

			int in =Integer.parseInt(guess);
			
			if(random==in) {
				JOptionPane.showMessageDialog(null,"you won");
			System.exit(0);
			
			}
			else if(random<in) {
			JOptionPane.showMessageDialog(null,"too high");
			}
			else if(random>in) {
			JOptionPane.showMessageDialog(null,"too low");
			}
			// 7. if the guess is high
				// 8. Tell them it's too high
			// 9. if the guess is low
				// 10. Tell them it's too low
		}
		// 13. Tell them they lose
		
	}

}


