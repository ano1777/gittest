import java.awt.Color;
import java.awt.event.MouseEvent;

import acm.graphics.GLine;
import acm.graphics.GObject;
import acm.graphics.GOval;
import acm.graphics.GPoint;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

import acm.util.RandomGenerator;

public class graphicsPractics extends GraphicsProgram {
	private static final int NUM_ROW = 8;
	private static final int NUM_COL = 8;

	private GRect firstBlack = null;
	private GRect secondBlack = null;

	public void run() {
		addMouseListeners();
		int length = Math.max(getWidth(), getHeight()) / NUM_ROW;
		for (int i = 0; i < NUM_ROW; i++) {
			for (int j = 0; j < NUM_COL; j++) {
				double x = j * length;
				double y = i * length;
				GRect cell = new GRect(y, x, length, length);
				cell.setFilled(true);
				cell.setFillColor(Color.WHITE);
				add(cell);
			}
		}
	}

	public void mouseClicked(MouseEvent e) {
		GRect object = (GRect)getElementAt(e.getX(), e.getY());
		if(object == null){
			return;
		}else{
		if(object.getFillColor() ==  Color.WHITE) {
			object.setFillColor(Color.BLACK);
			if(firstBlack == null) {
				firstBlack = object;
			}else if (secondBlack == null){
				secondBlack = object;
				
			}else {
				firstBlack.setFillColor(Color.WHITE);
				firstBlack = secondBlack;
				secondBlack = object;	
			}
			
			if(firstBlack == null || secondBlack == null){
			object.setFillColor(Color.BLACK);
			}
			else {
				object.setFillColor(Color.BLACK);
		
				firstBlack = secondBlack;
				secondBlack = object;
				
			}
			
		}
		else {
			object.setFillColor(Color.WHITE);
			if(object == firstBlack){
				firstBlack = secondBlack;
			}else {
				secondBlack = null;
			}
		}
		}
	}
	// private RandomGenerator rgen = new RandomGenerator();
	//
	// private static final double RADIUS_MIN = 10;
	// private static final double RADIUS_MAX = 50;
	// private static final int V_MIN = 1;
	// private static final int V_MAX = 5;
	// private static final int DELAY = 80;
	//
	// public void run() {
	//
	// addMouseListeners();
	// addBall();
	//
	// while (true) {
	// double vx = rgen.nextDouble(1, 3);
	// double vy = rgen.nextDouble(1, 3);
	// if (ball.getX() < 0 || ball.getX() - ball.getWidth() > getWidth() ) {
	// vx = -vx;
	// }
	// if ( ball.getY() < 0 || ball.getY() - ball.getHeight() > getHeight() ) {
	// vy = -vy;
	// }
	// ball.move(vx, vy);
	// pause(DELAY);
	// }
	// }
	//
	// private void addBall() {
	// double radius = rgen.nextDouble(RADIUS_MIN, RADIUS_MAX);
	// double x = rgen.nextDouble(0, getWidth() - 2 * radius);
	// double y = rgen.nextDouble(0, getHeight() - 2 * radius);
	// ball = new GOval(x, y, radius * 2, radius * 2);
	// ball.setFilled(true);
	// ball.setColor(rgen.nextColor());
	// add(ball);
	// }
	//
	// public void mousePressed(MouseEvent e) {
	// ball.setColor(rgen.nextColor());
	// }
	// private int randomSpeed() {
	// int v = rgen.nextInt(V_MIN, V_MAX);
	//
	// return ;
	// }
}
// private void moveBall() {
// // TODO Auto-generated method stub
//
// }
// }

// int x = 0;
// int y = 0;
// GLine newLine;
// GPoint prevPoint;
//
//
// public void run() {
// addMouseListeners();
// }
// public void mousePressed(MouseEvent e){
// newLine = new GLine(x, y, e.getX(), e.getY());
// add(newLine);
// }
// public void mouseDragged(MouseEvent e) {
// newLine.setEndPoint(e.getX(), e.getY());
// add(newLine);
// }
// public void mouseReleased(MouseEvent e) {
// x= e.getX();
// y=e.getY();
// }
// }
