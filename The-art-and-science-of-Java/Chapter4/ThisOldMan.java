// This program display all 10 verses of the song This Old Man.

import acm.program.*;

public class ThisOldMan extends ConsoleProgram {
	public void run() {
		String word = "thumb";
		for(int number = 1; number < 11; number++) {
			println("This old man, he played " + number);
			switch(number) {
				case 2:
					word = "shoe";
					break;
				case 3:
					word = "knee";
					break;
				case 4:
					word = "door";
					break;
				case 5:
					word = "hive";
					break;
				case 6:
					word = "sticks";
					break;
				case 7:
					word = "heaven";
					break;
				case 8:
					word = "pate";
					break;
				case 9:
					word = "spine";
					break;
				case 10:
					word = "shin";
					break;
				default:
					word = "thumb";
					break;
			}
			println("He played knick-knack on my " + word);
			println("With a knick-knack, paddy-whack,");
			println("Give your dog a bone.");
			println("This old man came rolling home.");
		} 
	}
}
