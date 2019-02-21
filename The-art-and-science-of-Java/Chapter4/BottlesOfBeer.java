// This program generates the lyrics for the song Bottles Of Beer.

import acm.program.*;

public class BottlesOfBeer extends ConsoleProgram {
	public void run() {
		int bottles = BOTTLES;
		for(int i = 0; i < BOTTLES; i ++) {
			if(bottles > 1) {
				println(bottles + " bottles of beer on the wall.");
				println(bottles + " bottles of beer.");
				println("You take one down, pass it around.");
				int sum = bottles - 1;
				if(sum == 1) {
					print(sum + " bottle of beer ont the wall.");
				} else {
					print(sum + " bottles of beer ont the wall.");
				}
			} else {
				println(bottles + " bottle of beer on the wall.");
				println(bottles + " bottle of beer.");
				println("You take one down, pass it around.");
				println((bottles - 1) + " bottle of beer ont the wall.");
			}
			bottles--;
		}
	}
	
	private static final int BOTTLES = 99;
}
