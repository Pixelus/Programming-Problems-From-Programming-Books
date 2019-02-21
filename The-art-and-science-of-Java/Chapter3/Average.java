// This program computes the average of four integers.

import acm.program.*;

public class Average extends ConsoleProgram {
	public void run() {
		println("This program computes the average of four integers.");
		int a = readInt("Enter your first exam grade: ");
		int b = readInt("Enter your first exam grade: ");
		int c = readInt("Enter your first exam grade: ");
		int d = readInt("Enter your first exam grade: ");
		int average = (a + b + c + d)/4;
		println("Average = " + average);
	}
}
