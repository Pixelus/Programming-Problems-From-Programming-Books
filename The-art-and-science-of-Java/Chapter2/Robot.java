import java.awt.Color;
import acm.graphics.*;
import acm.program.*;

public class Robot extends GraphicsProgram {
	public void run() {
		// Gray face, black outlined
		GRect rect = new GRect(60, 40, 80, 120);
		rect.setFilled(true);
		rect.setFillColor(Color.GRAY);
		add(rect);
		
		// Orange eyes
		// Left
		GOval leftEye = new GOval(70, 60, 20, 20);
		leftEye.setFilled(true);
		leftEye.setColor(Color.ORANGE);
		add(leftEye);
		// Right
		GOval rightEye = new GOval(110, 60, 20, 20);
		rightEye.setFilled(true);
		rightEye.setColor(Color.ORANGE);
		add(rightEye);
		
		// Black noise
		GRect noseRect = new GRect(98, 98, 4, 10);
		noseRect.setFilled(true);
		noseRect.setColor(Color.BLACK);
		add(noseRect);
		
		// White mouse
		GRect mouseRect = new GRect(80, 120, 40, 20);
		mouseRect.setFilled(true);
		mouseRect.setColor(Color.WHITE);
		add(mouseRect);
		
	}
}
