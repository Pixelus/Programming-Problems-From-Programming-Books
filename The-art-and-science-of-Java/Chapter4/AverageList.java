// This program reads in a liste of integers representing
// exam scores and prints out the average. Sentinel -1 is 
// used to mark the end of the input. 

import acm.program.*;

public class AverageList extends ConsoleProgram {
	public void run() {
		println("Enter values, one per line, using " + SENTINEL);
		println("to signal the end of the list.");
		int total = 0;
		int exams_number = 0;
		while(true) {
			int value = readInt("?");
			if(value == SENTINEL) {
				break;
			}
			total += value;
			exams_number++;
		}
		println("The average is " + (total / exams_number) + ".");
	}
	
	private static final int SENTINEL = -1;
}
