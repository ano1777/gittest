import java.awt.Color;
import java.awt.event.MouseEvent;

import acm.graphics.GObject;
import acm.graphics.GOval;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class BouncingBall extends GraphicsProgram {
	private RandomGenerator rgen = RandomGenerator.getInstance();
	private static final int RADIUS = 20;
	private static final int PAUSE_TIME = 100;
GOval ball;
	public void run() {
		addMouseListeners();
		double vx = rgen.nextDouble(1.0, 3.0);

		double vy = rgen.nextDouble(1.0, 3.0);
		 ball = new GOval(getWidth() / 2 - RADIUS, getHeight() / 2 - RADIUS, 2 * RADIUS, 2 * RADIUS);
		ball.setFilled(true);
		add(ball);
		while (true) {
			ball.move(vx, vy);
			pause(PAUSE_TIME);
			if (ball.getX() >= getWidth() - 2 * RADIUS || ball.getX() <= 0) {
				vx = -vx;
			}
			if (ball.getY() >= getHeight() - 2 * RADIUS || ball.getY() <= 0) {
				vy = -vy;
			}

		}

	} public void mouseClicked(MouseEvent e) {
		GObject object = getElementAt(e.getX(), e.getY());
		if(object != null) {
			object.setColor(myColor());
			
			
		}
	}
	public void mouseDragged(MouseEvent e){
		GObject obj = getElementAt(e.getX(), e.getY());
		if(obj != null) {
		ball.setLocation(e.getX()-RADIUS, e.getY()- RADIUS);
		}
	}
	private Color myColor (){
		int num = rgen.nextInt(0,5);
		if(num == 0 ){
			return Color.GREEN;
		}
		if(num ==1) {
			return Color.RED;
		}
		if(num==2 ){
			return Color.BLACK;	
		}
		if( num ==3){
		return Color.YELLOW;
	}
	
		return Color.BLUE;
	}
}