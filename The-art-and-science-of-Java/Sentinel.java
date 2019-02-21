// This programs read a list of integers, one per line, until
// the user enters a sentinel value of 0. When the sentinel is 
// read, the program should display the largest value in the list. 

import acm.program.*;

public class Sentinel extends ConsoleProgram {
	public void run() {
		println("This program finds the largest integer in a list.");
		println("Enter values, one per line, using a 0 to signal the end of the list.");
		int value;
		int max = 0;
		while(value != SENTINEL) {
			value = readInt(" ? ");
			if(value > max) {
				max = value;
			} 
		}
		println("The largest value is " + max);
	}	
	
	// Constant to define the sentinel value
	private static final int SENTINEL = 0;
}
