// This program displays the integers between 1 and 100
// that are divisible by either 6 or 7 but not both.

import acm.program.*;

public class DivisibleIntegers extends ConsoleProgram {
	public void run() {
		for(int i = 1; i <= 100; i++) {
			if((i % 6 == 0) || (i % 7 == 0)) {
				println(i);
			}
		}
	}
}
