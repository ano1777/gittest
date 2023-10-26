import java.awt.Color;

import acm.graphics.GLabel;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class assignment2 extends GraphicsProgram{
	public void run() {
		GLabel label = new GLabel("Hello, world!", 30,30);
		add (label);
	
		GRect frame = new GRect (20,20, label.getWidth()+10, label.getAscent()+10);
		add (frame);
		frame.setFilled(false);
		frame.setColor(Color.RED);
	}

}
