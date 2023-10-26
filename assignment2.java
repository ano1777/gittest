import java.awt.Color;

import acm.graphics.GLabel;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class assignment2 extends GraphicsProgram{
	private static final double RECT_WIDTH = label.getWidth + 15;
	private static final double RECT_HEIGHT = label.getAscent + 15;
	public void run() {
		GRect myRect = new GRect(getWidth() /2 - RECT_WIDTH, getHeight() / 2 - RECT_HEIGHT, RECT_WIDTH,RECT_HEIGHT);
		add (myRect);
		
	
	}

}
