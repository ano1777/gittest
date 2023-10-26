import java.awt.Color;

import acm.graphics.GLabel;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class assignment2 extends GraphicsProgram{
	public void run() {
		add (new GLabel("hello, world!"), 30,30);
		GRect frame = new GRect (20, 10,20,20);
		add (frame);
		frame.setFilled(false);
		frame.setColor(Color.RED);
	}

}
