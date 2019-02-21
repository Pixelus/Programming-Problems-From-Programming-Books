import java.awt.Color;
import acm.graphics.*;
import acm.program.*;

public class OlympicRings extends GraphicsProgram {
	public void run() {
		// Blue
		GOval blue = new GOval(20, 50, 50, 50);
		blue.setFilled(true);
		blue.setColor(Color.BLUE);
		add(blue);
		GOval blueWhite = new GOval(25, 55, 40, 40);
		blueWhite.setFilled(true);
		blueWhite.setColor(Color.WHITE);
		add(blueWhite);
		
		// Yellow
		GOval yellow = new GOval(40, 70, 50, 50);
		yellow.setFilled(true);
		yellow.setColor(Color.YELLOW);
		add(yellow);
		GOval yellowWhite = new GOval(45, 75, 40, 40);
		yellowWhite.setFilled(true);
		yellowWhite.setColor(Color.WHITE);
		add(yellowWhite);
		
		// Black
		GOval black = new GOval(60, 50, 50, 50);
		black.setFilled(true);
		black.setColor(Color.BLACK);
		add(black);
		GOval blackWhite = new GOval(65, 55, 40, 40);
		blackWhite.setFilled(true);
		blackWhite.setColor(Color.WHITE);
		add(blackWhite);
		
		// Green
		GOval green = new GOval(80, 70, 50, 50);
		green.setFilled(true);
		green.setColor(Color.GREEN);
		add(green);
		GOval greenWhite = new GOval(85, 75, 40, 40);
		greenWhite.setFilled(true);
		greenWhite.setColor(Color.WHITE);
		add(greenWhite);
		
		// Red
		GOval red = new GOval(100, 50, 50, 50);
		red.setFilled(true);
		red.setColor(Color.RED);
		add(red);
		GOval redWhite = new GOval(105, 55, 40, 40);
		redWhite.setFilled(true);
		redWhite.setColor(Color.WHITE);
		add(redWhite);
	}
}
