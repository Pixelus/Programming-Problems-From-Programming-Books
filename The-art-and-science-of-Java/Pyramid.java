import java.awt.Color;
import acm.graphics.*;
import acm.program.*;

public class Pyramid extends GraphicsProgram {
	public void run() {
		// Pyramid of bricks arranged in horizontal rows
		setSize(640, 640);
		// Draw rows of bricks
		int bricks = 0;
		for(int rows = 1; rows <= BRICKS_IN_BASE; rows ++) {
			bricks++;
			for(int i = 0; i < bricks; i++) {
				// Draw one line of bricks
				GRect rect = new GRect(300, 20, BRICK_WIDTH, BRICK_HEIGHT);
				rect.setFilled(true);
				add(rect);
			}
		}
	}
	
	// Constants to define the heigh and width of the pyramid, and the number of bricks
	private static final int BRICK_WIDTH = 40;
	private static final int BRICK_HEIGHT = 20;
	private static final int BRICKS_IN_BASE = 12;
}
