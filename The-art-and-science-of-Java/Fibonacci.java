// This program displays the value from F(0) through F(15) for the Fibonacci sequence.

import acm.program.*;

public class Fibonacci extends ConsoleProgram {
	public void run() {
		println("This program displays the value from F(0) through F(15) for the Fibonacci sequence.");
		int F0 = 0;
		int F1 = 1;
		println("F(0) = " + F0);
		println("F(1) = " + F1);
		int F = 0;
		for(int i = 2; i <= 15; i++) {
			int F(0) = 0;
			int F(1)= 1;
			int value = F(i - 1) + F(i - 2);
			println(F(" + i + ") = " + value);
		}
	}
}
