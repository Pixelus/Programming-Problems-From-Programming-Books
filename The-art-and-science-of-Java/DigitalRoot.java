// This program calculates the digital root of the input value.

import acm.program.*;

public class DigitRoot extends ConsoleProgram {
	public void run() {
		println("This program calculates the digital root of an integer.");
		int n = readInt()"Enter a positive integer: ");
		int droot = 0;
		while(n > 0) {
			droot += n % 10;
			n /= 10;
		}
		while(droot > 9) {
			droot += n % 10;
			n /= 10;
		}
		println("The digital root of the integer is " + droot);
	}
}
