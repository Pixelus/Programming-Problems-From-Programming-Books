import java.awt.Color;
import acm.graphics.*;
import acm.program.*;

public class Rainbow extends GraphicsProgram {
	public void run() {
		// Red
		GOval red = new GOval(-100, 10, 500, 450);
		red.setFilled(true);
		red.setColor(Color.RED);
		add(red);
		
		// Orange
		GOval orange = new GOval(-100, 25, 500, 450);
		orange.setFilled(true);
		orange.setColor(Color.ORANGE);
		add(orange);
		
		// Yellow
		GOval yellow = new GOval(-100, 40, 500, 450);
		yellow.setFilled(true);
		yellow.setColor(Color.YELLOW);
		add(yellow);
		
		// Green
		GOval green = new GOval(-100, 55, 500, 450);
		green.setFilled(true);
		green.setColor(Color.GREEN);
		add(green);
		
		// Blue
		GOval blue = new GOval(-100, 70, 500, 450);
		blue.setFilled(true);
		blue.setColor(Color.BLUE);
		add(blue);
		
		// Magenta
		GOval magenta = new GOval(-100, 85, 500, 450);
		magenta.setFilled(true);
		magenta.setColor(Color.MAGENTA);
		add(magenta);
		
		// Magenta
		GOval white = new GOval(-100, 100, 500, 450);
		white.setFilled(true);
		white.setColor(Color.WHITE);
		add(white);
	}
}
