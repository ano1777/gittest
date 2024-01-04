import java.awt.Color;

import acm.graphics.GLabel;
import acm.graphics.GLine;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class assignment2 extends GraphicsProgram {
	private static final double RECT_WIDTH = 150;
	private static final double RECT_HEIGHT = 60;
	private static final Color FRAME_COLOR = Color.RED;
	private static final Color FONT_COLOR = Color.BLUE;

	public void run() {
		
		double x = getWidth()/2- RECT_WIDTH/2;
		double y = getHeight()/3 - RECT_HEIGHT/2;
		GRect frame = new GRect(x, y, RECT_WIDTH,RECT_HEIGHT);
		frame.setColor(FRAME_COLOR);
		add (frame);

		
		GLabel label = new GLabel ("program");
		double x1 = x+RECT_WIDTH/2- label.getWidth()/2;
	    double y1 = y + RECT_HEIGHT/2 + label.getAscent()/3;
		
	    GLabel label1 = new GLabel ("program",x1 , y1);
	    label1.setColor(FONT_COLOR);
		add (label1);
		
		addThreeRects ();
		
		addThreeLines();
		
	}
	
		
	
	private void addThreeLines() {
		double x = getWidth()/2;
		double y = getHeight()/3 + RECT_HEIGHT/2;
		double x1 = getWidth()/2;
		double y1 = getHeight()/3 + 120;
		double x2 = getWidth()/2 - RECT_WIDTH - 60;
		double x3 = getWidth()/2 + RECT_WIDTH + 60;
		
		GLine middleLine = new GLine(x, y, x1, y1);
		middleLine.setColor(FRAME_COLOR);
		add (middleLine);
		
		GLine leftLine = new GLine(x, y, x2, y1);
		leftLine.setColor(FRAME_COLOR);
		add(leftLine);
		
		GLine rightLine = new GLine(x, y, x3, y1);
		rightLine.setColor(FRAME_COLOR);
		add(rightLine);
	}
	
	
	
	
	private void addThreeRects() {
		addFirstRect();
		addSSecondRect();
		addThirdRect();
		
	}
	
	private void addThirdRect() {
		double x = getWidth()/2 + RECT_WIDTH/2 +60;
	    double y = getHeight()/3 + 120;
	    GRect thirdRect = new GRect(x, y, RECT_WIDTH, RECT_HEIGHT);
	   
		
		GLabel label = new GLabel("DialogProgram");
		double x1 = x + RECT_WIDTH/2 - label.getWidth()/2;
	    double y1 = y + RECT_HEIGHT/2 + label.getAscent()/3;
	    GLabel thirdWord = new GLabel("DialogProgram", x1,y1);
	   
	}
	
	private void addFirstRect() {
		double x = getWidth()/2 - RECT_WIDTH - RECT_WIDTH/2 - 60;
		double y = getHeight()/3 + 120;
		GRect firstRect = new GRect(x,y, RECT_WIDTH, RECT_HEIGHT);
	
		
		GLabel label = new GLabel("GraphicsProgram");
		double x1 = x + RECT_WIDTH/2 - label.getWidth()/2;
		double y1 = y + RECT_HEIGHT/2 + label.getAscent()/3;
		GLabel firstWord = new GLabel("GraphicsProgram", x1,y1);
	
		
	}
	private void addSSecondRect() {
		double x = getWidth()/2 - RECT_WIDTH/2;
		double y = getHeight()/3 + 120;
		GRect secondRect = new GRect(x, y, RECT_WIDTH, RECT_HEIGHT);
		
		
		GLabel label = new GLabel("ConsoleProgram");
		double x1 = x + RECT_WIDTH/2 -label.getWidth()/2;	
	    double y1 = y + RECT_HEIGHT/2 +label.getAscent()/3;
	    GLabel secondWord = new GLabel("ConsoleProgram", x1, y1);
	
				
	
		

	}
		
}


