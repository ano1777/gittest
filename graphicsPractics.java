import java.awt.event.MouseEvent;

import acm.graphics.GLine;
import acm.graphics.GOval;
import acm.graphics.GPoint;
import acm.program.GraphicsProgram;

import acm.util.RandomGenerator;

public class graphicsPractics extends GraphicsProgram {
	GOval ball;
	private RandomGenerator rgen = new RandomGenerator();
	double vx = rgen.nextDouble(1, 3);
	double vy = rgen.nextDouble(1, 3);
	private static final double RADIUS_MIN = 10;
	private static final double RADIUS_MAX = 50;
	private static final int V_MIN = 1;
	private static final int V_MAX = 5;
	private static final int DELAY = 80;

	public void run() {

		addMouseListeners();
		addBall();
		ballMove();
	}

	private void ballMove() {
while(true) {
	ball.move(vx, vy);
	pause(DELAY);
}
	}

	private void addBall() {
		double radius = rgen.nextDouble(RADIUS_MIN, RADIUS_MAX);
		double x = rgen.nextDouble(0, getWidth() - 2 * radius);
		double y = rgen.nextDouble(0, getHeight() - 2 * radius);
		ball = new GOval(x, y, radius *2, radius*2);
		ball.setFilled(true);
		ball.setColor(rgen.nextColor());
		add(ball);
	}

	public void mousePressed(MouseEvent e) {
		ball.setColor(rgen.nextColor());

			ball.move(vx, vy);
		}

}
//	private void moveBall() {
//		// TODO Auto-generated method stub
//
//	}
//}

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
