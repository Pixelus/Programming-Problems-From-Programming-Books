import java.awt.Color;
import acm.graphics.*;
import acm.program.*;

public class Rings extends GraphicsProgram {
	public void run() {
		// Blue
		GOval blue = new GOval(20, 50, 50, 50);
		blue.setFilled(false);
		blue.setColor(Color.BLUE);
		add(blue);
		
		// Yellow
		GOval yellow = new GOval(40, 70, 50, 50);
		yellow.setFilled(false);
		yellow.setColor(Color.YELLOW);
		add(yellow);
		
		// Black
		GOval black = new GOval(60, 50, 50, 50);
		black.setFilled(false);
		black.setColor(Color.BLACK);
		add(black);
		
		// Green
		GOval green = new GOval(80, 70, 50, 50);
		green.setFilled(false);
		green.setColor(Color.GREEN);
		add(green);
		
		// Red
		GOval red = new GOval(100, 50, 50, 50);
		red.setFilled(false);
		red.setColor(Color.RED);
		add(red);
	}
}
