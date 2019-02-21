// This program reads a positive integer N and calculates 
// and displays the sum of the first N odd integers.
// Example : if N = 4, the program displays the value 16,
// because 1 + 3 + 5 + 7 = 16

import acm.program.*;

public class OddIntegers extends ConsoleProgram {
	public void run() {
		int N = readInt("Enter an integer: ");
		int above1 = N + 2;
		int above2 = N + 4;
		int under1 = N - 2;
		int under2 = N - 4;
		int sum = above1 + above2 + under1 + under2;
		println("Sum of the first odd integers near N: " + sum);
	}
}
