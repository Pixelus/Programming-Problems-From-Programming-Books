// This program generates the number that has the same digits in the reverse order.

import acm.program.*;

public class ReverseDigit extends ConsoleProgram {
	public void run() {
		println("This program reverses order of the digits in an integer.");
		int n = readInt()"Enter a positive integer: ");
		int reverse = 0;
		while(n > 0) {
			reverse = n % 10;
			n /= 10;
			print reverse;
		}
		println("The reverse order of the integer is " + reverse);
	}
}
