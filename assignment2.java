import java.awt.Color;

import acm.graphics.GLabel;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class assignment2 extends GraphicsProgram{
	private static final double RECT_WIDTH = 130;
	private static final double RECT_HEIGHT =  50;
	private static final double FONT_SIZE = 20;
	public void run() {
		
		double x = getWidth()/2 - RECT_WIDTH/2;
		double y = getHeight()/2 - RECT_HEIGHT/2;
		GRect myRect = new GRect(x, y, RECT_WIDTH,RECT_HEIGHT);
		add (myRect);

		
		GLabel label = new GLabel ("program");
		double x1 = x+RECT_WIDTH/2- label.getWidth()/2;
	    double y1 = y + RECT_HEIGHT/2 + label.getAscent()/3;
		
	    GLabel label1 = new GLabel ("program",x1 , y1);
		add (label1);
		
		
		addTwoLines();
		
	}
	private void addTwoLines() {
		addLeftLine();
		addRightLine();
		
	}
	
	private void addLeftLine() {
		GLine leftLine = new Gline(getWidth()/2, )
		
	}
		
	}


