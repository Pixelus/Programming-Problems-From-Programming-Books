// This program converts inches to centimeters.

import acm.program.*;

public class FeetAndInchesToCentimeters extends ConsoleProgram {
	public void run() {
		println("This program converts inches to centimeters.");
		double feet = readDouble("Enter value in feet: ");
		double inches = readDouble("Enter value in inches: ");
		double cm = (inches * CENTIMETERS_PER_INCH) + (feet * INCH_PER_FEET);
		println(feet + "ft " + inches + "in = " + cm + " cm");
	}
	
	private static final double CENTIMETERS_PER_INCH = 2.54;
	private static final double INCH_PER_FEET = 12;
}
