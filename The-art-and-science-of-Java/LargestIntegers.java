// This programs read a list of integers, one per line, until
// the user enters a sentinel value of 0. When the sentinel is 
// read, the program should display the largest value and the
// second largest value in the list. 

import acm.program.*;

public class LargestIntegers extends ConsoleProgram {
	public void run() {
		println("This program finds the two largest integers in a list.");
		println("Enter values, one per line, using a 0 to signal the end of the list.");
		int value;
		int max = 1;
		int secondMax = 0;
		while(value != SENTINEL) {
			value = readInt(" ? ");
			if(value > max) {
				max = value;
				secondMax = max;
			} 
		}
		println("The largest value is " + max);
		println("The second largest value is " + secondMax);
	}	
	
	// Constant to define the sentinel value
	private static final int SENTINEL = 0;
}
