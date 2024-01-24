import java.awt.Color;
import java.awt.event.MouseEvent;

import acm.graphics.GObject;
import acm.graphics.GOval;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class aa extends GraphicsProgram {
	private static final int BALL_COUNT = 20;
	private static final int MIN_RADIUS = 2;
	private static final int MAX_RADIUS = 10;
	private static final int V_Y = 3;
	private GOval ball;
	RandomGenerator rgen;
	GObject circ = null;
	

	int vY = 3;
	public void run() {
		addMouseListeners();
		rgen = RandomGenerator.getInstance();
		addBalls();

	}
	private void addBalls(){
		int radius = rgen.nextInt(MIN_RADIUS, MAX_RADIUS);
		for(int i=0; i<BALL_COUNT; i++){
			int x = rgen.nextInt(0, getWidth() - 2 * radius);
			int y = rgen.nextInt(0, getHeight() - 2 * radius);
			ball = new GOval(x, y, 2 * radius , 2 * radius);
			ball.setFilled(true);
			add(ball);
		}
	}
	
	public void mouseClicked  (MouseEvent e) {
		GObject circle = getElementAt(e.getX(), e.getY());
		double vx = -10;
		if( circle != null) {
			circle.setColor(rgen.nextColor());	
			circ = ball;
//			if(circ != null && circle == null){
//				circle.move(0, vx);
//			}
		}else{
			circ = getElementAt(e.getX(), e.getY());
			
		}
	}
}