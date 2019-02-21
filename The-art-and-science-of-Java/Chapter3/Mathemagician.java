// This program compares java's precedence and Milo's problem
// gived by the Mathemagician of The Phantom Tollbooth.

import acm.program.*;

public class Mathemagician extends ConsoleProgram {
	public void run() {
		println("This program converts Milo's solving with Java's precedence solving.");
		int milo = 0;
		int java = 4 + 9 - 2 * 16 + 1 / 3 * 6 - 67 + 8 * 2 - 3 + 26 - 1 / 34 + 3 / 7 + 2 - 5;
		println("With Milo's solving: " + milo);
		println("With Java's precedence solving: " + java);
	}
}
