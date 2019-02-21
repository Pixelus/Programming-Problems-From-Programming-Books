import java.awt.Color;
import acm.graphics.*;
import acm.program.*;

public class Checkerboard extends GraphicsProgram {
	public void run() {
		setSize(820, 820);
		//Checkerboard with red and black checkers corresponding to the initial state of the game
		// 8 rows 
		for(int i = 0; i <= 8; i++) {
			GRect rect = new GRect(10, 10, TILE, TILE);
			rect.setFilled(true);
			add(rect);
			// 8 columns
			for(int i = 0; i <= 8; i++) {
				GRect rect = new GRect(10, 10, TILE, TILE);
				rect.setFilled(true);
				add(rect);
			}
		}
	}
	
	// Constant to define the heigh and width of a tile
	private static final int TILE = 10;
}
