// This program count down to 0 as in a rocket launch sequence.

import acm.program.*;

public class Countdown extends ConsoleProgram {
	public void run() {
		int t = START;
		while(t >= 0) {
			println(t);
			t--;
		}
		println("Liftoff!");
	}
	
	// SPecifies the value from which to start counting down
	private static final int START = 10;
}
