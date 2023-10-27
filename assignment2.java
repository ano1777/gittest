import java.awt.Color;

import acm.graphics.GLabel;
import acm.graphics.GLine;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class assignment2 extends GraphicsProgram{
	private static final double RECT_WIDTH = 200;
	private static final double RECT_HEIGHT = 100;
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
		
		addThreeLines();
		
	}
	
		
	
	private void addThreeLines() {
		double x = getWidth()/2;
		double y = getHeight()/3 + RECT_HEIGHT/2;
		double x1 = getWidth()/2;
		double y1 = getHeight()/3 + 120;
		double x2 = getWidth()/2 - 210;
		double x3 = getWidth()/2 + 210;
		
		GLine middleLine = new GLine(x, y, x1, y1);
		add (middleLine);
		
		GLine leftLine = new GLine(x, y, x2, y1);
		add(leftLine);
		
		GLine rightLine = new GLine(x, y, x3, y1);
		add(rightLine);
	}
	
	
	
	
	private void addThreeRects() {
		addFirstRect();
		addSSecondRect();
		adThirdRect();
		
	}
	
	private void adThirdRect() {
		double x = getWidth()/2 + 135;
	    double y = getHeight()/3 + 120;
	    GRect thirdRect = new GRect(x,y, RECT_WIDTH, RECT_HEIGHT);
		add(thirdRect);
		
		GLabel label = new GLabel("DialogProgram");
		double x1 = x + RECT_WIDTH/2 - label.getWidth()/2;
	    double y1 = y + RECT_HEIGHT/2 +label.getAscent()/3;
	    GLabel thirdWord = new GLabel("DialogProgram", x1,y1);
		add (thirdWord);
		
	}
	private void addFirstRect() {
		double x = getWidth()/2 - 285;
		double y = getHeight()/3 + 120;
		GRect firstRect = new GRect(x,y, RECT_WIDTH, RECT_HEIGHT);
		add(firstRect);
		
		GLabel label = new GLabel("GraphicsProgram");
		double x1 = x + RECT_WIDTH/2 - label.getWidth()/2;
		double y1 = y + RECT_HEIGHT/2 + label.getAscent()/3;
		GLabel firstWord = new GLabel("GraphicsProgram", x1,y1);
		add (firstWord);
	
		
	}
	private void addSSecondRect() {
		double x = getWidth()/2 - RECT_WIDTH/2;
		double y = getHeight()/3 + 120;
		GRect secondRect = new GRect(x, y, RECT_WIDTH, RECT_HEIGHT);
		add(secondRect);
		
		GLabel label = new GLabel("ConsoleProgram");
		double x1 = x + RECT_WIDTH/2 -label.getWidth()/2;	
	    double y1 = y + RECT_HEIGHT/2 +label.getAscent()/3;
	    GLabel secondWord = new GLabel("ConsoleProgram", x1, y1);
		add(secondWord);
		
				
	
		

	}
		
}


