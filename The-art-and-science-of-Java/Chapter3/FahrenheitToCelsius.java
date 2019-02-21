// This program reads a temperature in degrees Fahrenheit 
// and returns the corresponding temperature in degrees Celsius.

import acm.program.*;

public class FahrenheitToCelsius extends ConsoleProgram {
	public void run() {
		println("This program converts Fahrenheit to Celsius.");
		double fahrenheit = readDouble("Enter Fahrenheit temperature: ");
		double celsius = (fahrenheit - 32) * 5/9;
		println("Celsius equivalent: " + celsius);
	}
}
