// This program asks the user for the radius of a circle and then 
// computes the area of that circle(A) using the formula A = PI r².

import acm.program.*;

public class CircleArea extends ConsoleProgram {
	public void run() {
		println("Area of a circle");
		int radius = readInt("Enter radius for A circle: ");
		double area = PI * radius * radius;
		println("Area for the A circle: " + area);
	}
	
	private static final double PI = 3.14;
}
