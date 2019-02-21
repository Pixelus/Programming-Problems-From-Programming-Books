import java.awt.Color;
import acm.graphics.*;
import acm.program.*;

public class Target extends GraphicsProgram {
	public void run() {
		//Extern target
		GOval extern = new GOval(50, 50, 100, 100);
		extern.setFilled(true);
		extern.setColor(Color.RED);
		add(extern);
		
		//Central white target
		GOval central = new GOval(70, 70, 60, 60);
		central.setFilled(true);
		central.setColor(Color.WHITE);
		add(central);
		
		//Intern red target
		GOval intern = new GOval(88, 88, 25, 25);
		intern.setFilled(true);
		intern.setColor(Color.RED);
		add(intern);
	}
}
