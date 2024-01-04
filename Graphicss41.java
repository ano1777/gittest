
import acm.program.*;
import acm.graphics.*;

import java.awt.Color;
import java.awt.event.*;
public class Graphicss41 extends GraphicsProgram{
    private static final int RADIUS = 10;

import java.awt.event.MouseEvent;

import acm.graphics.GLabel;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class shualeduri2017 extends GraphicsProgram {
	
	public void run() {
		
		int x = getWidth()-SQUARE_LENGTH;
		int y = getHeight()-SQUARE_LENGTH;
		GRect square = new GRect(x, y, SQUARE_LENGTH, SQUARE_LENGTH);
		add(square);
		GLabel score = new GLabel("0");
		add(score, x + SQUARE_LENGTH/2 - score.getWidth()/2, y + SQUARE_LENGTH/2 -score.getAscent()/2);
		addMouseListeners();
}
	public void mouseDragged (MouseEvent e){
		double x = e.getX();
		double y = e.getY();
	    //if x1>x2  marjvnidan marcxnivaa da unda daiklos
		//if x2>x1 marcxnidan marjvnivaa da unda gaizardos
		if(score != 0){
			
		}
	}
}
	/*public void run() {

		addMouseListeners();
		getMouseMotionListeners();
		
	}
	@Override
     public void mouseDragged(MouseEvent e){
    	 addCircle(e.getX(), e.getY());
     }
	@Override
	public void mousePressed(MouseEvent e) {
		
	}
	private void addCircle(int centerX, int centerY) {
	GOval circle = new GOval(2*RADIUS, 2* RADIUS);
   	 circle.setFilled(true);
   	 circle.setColor(Color.GREEN);
   	 add(circle, e.getX()-RADIUS, e.getY()-RADIUS);
	}
}
*/