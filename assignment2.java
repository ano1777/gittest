import java.awt.Color;

import acm.graphics.GLabel;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class assignment2 extends GraphicsProgram{
	private static final double RECT_WIDTH = 130;
	private static final double RECT_HEIGHT =  50;
	private static final double FONT_SIZE = 20;
	public void run() {
		
		double x = getWidth()/2- RECT_WIDTH/2;
		double y = getHeight()/3 - RECT_HEIGHT/2;
		GRect myRect = new GRect(x, y, RECT_WIDTH,RECT_HEIGHT);
		add (myRect);

		
		GLabel label = new GLabel ("program");
		double x1 = x+RECT_WIDTH/2- label.getWidth()/2;
	    double y1 = y + RECT_HEIGHT/2 + label.getAscent()/3;
		
	    GLabel label1 = new GLabel ("program",x1 , y1);
		add (label1);
		
		addThreeRects ();
		
		addTwoLines();
		
	}
	private void addTwoLines() {
		// TODO Auto-generated method stub
		
	}
	private void addThreeRects() {
		addFirstRect();
		addSSecondRect();
		adThirdRect();
		
	}
	
	private void adThirdRect() {
		double x = getWidth()/2 + 225;
	    double y = getHeight()/3 + 60;
	    GRect thirdRect = new GRect(x,y, RECT_WIDTH, RECT_HEIGHT);
		add(thirdRect);
		
	}
	private void addFirstRect() {
		double x = getWidth()/2 - 225;
		double y = getHeight()/3 + 60;
		GRect firstRect = new GRect(x,y, RECT_WIDTH, RECT_HEIGHT);
		add(firstRect);
	
		
	}
	private void addSSecondRect() {
		double x = getWidth()/2 - RECT_WIDTH/2;
		double y = getHeight()/3 + 60;
		GRect secondRect = new GRect(x, y, RECT_WIDTH, RECT_HEIGHT);
		add(secondRect);
				
	
		

	}
		
}


