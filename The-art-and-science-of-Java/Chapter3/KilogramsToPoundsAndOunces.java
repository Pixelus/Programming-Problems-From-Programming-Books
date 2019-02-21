// This program converts a metric weight in kilograms to the 
// corresponding English weight in pounds and ounces.

import acm.program.*;

public class KilogramsToPoundsAndOunces extends ConsoleProgram {
	public void run() {
		println("This program converts kilograms to pounds and ounces.");
		double kilograms = readDouble("Enter weight in kilograms: ");
		double pounds = kilograms * 2.2;
		double ounces = pounds * 16;
		println(kilograms + " kilograms corresponding to " + pounds + " pounds.");
		println(kilograms + " kilograms corresponding to " + ounces + " ounces.");
	}
}
