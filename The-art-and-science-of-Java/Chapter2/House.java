import acm.graphics.*;
import acm.program.*;

public class House extends GraphicsProgram {
	public void run() {
		// House walls
		// Left wall
		add(new GLine(40, 70, 40, 140));
		// Ground wall
		add(new GLine(40, 140, 160, 140));
		// Right wall
		add(new GLine(160, 70, 160, 140));
		
		// Roof
		// Top peaked roof 
		add(new GLine(40, 70, 160, 70));
		// Left peaked roof
		add(new GLine(40, 70, 100, 35));
		// Right peaked roff
		add(new GLine(100, 35, 160, 70));
		// Windows
		// Left window
		// Left 
		add(new GLine(50, 80, 50, 100));
		// Bottom 
		add(new GLine(50, 100, 70, 100));
		// Right
		add(new GLine(70, 80, 70, 100));
		// Top
		add(new GLine(50, 80, 70, 80));
		// Right window
		// Left 
		add(new GLine(130, 80, 130, 100));
		// Bottom 
		add(new GLine(130, 100, 150, 100));		
		// Right
		add(new GLine(150, 80, 150, 100));		
		// Top
		add(new GLine(130, 80, 150, 80));
		
		// Door
		// Left
		add(new GLine(90, 90, 90, 140));
		// Top
		add(new GLine(90, 90, 110, 90));
		// Right
		add(new GLine(110, 90, 110, 140));
		// Wrist
		add(new GOval(105, 115, 3, 3));
	}
}
