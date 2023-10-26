import java.awt.Color;

import acm.graphics.GLabel;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class assignment2 extends GraphicsProgram{
	private static final double RECT_WIDTH = 100;
	private static final double RECT_HEIGHT =  50;
	public void run() {
		GLabel label = new GLabel ("program",getWidth()/2, getHeight() / 2 -30);
		add (label);
		
		GRect myRect = new GRect(getWidth() /2 - label.getWidth(), getHeight() / 2 - label.getHeight(), RECT_WIDTH,RECT_HEIGHT);
		add (myRect);
		
	
	}

}
