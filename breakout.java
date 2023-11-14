import java.awt.event.MouseEvent;

import acm.graphics.GLabel;
import acm.graphics.GObject;
import acm.graphics.GOval;
import acm.graphics.GPoint;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class breakout extends GraphicsProgram {
	/** Width and height of application window in pixels */
	public static final int APPLICATION_WIDTH = 400;
	public static final int APPLICATION_HEIGHT = 600;

	/** Dimensions of game board (usually the same) */
	private static final int WIDTH = APPLICATION_WIDTH;
	private static final int HEIGHT = APPLICATION_HEIGHT;

	/** Dimensions of the paddle */
	private static final int PADDLE_WIDTH = 60;
	private static final int PADDLE_HEIGHT = 10;

	/** Offset of the paddle up from the bottom */
	private static final int PADDLE_Y_OFFSET = 30;

	/** Number of bricks per row */
	private static final int NBRICKS_PER_ROW = 10;

	/** Number of rows of bricks */
	private static final int NBRICK_ROWS = 10;

	/** Separation between bricks */
	private static final int BRICK_SEP = 4;

	/** Width of a brick */
	private static final int BRICK_WIDTH = (WIDTH - (NBRICKS_PER_ROW - 1) * BRICK_SEP) / NBRICKS_PER_ROW;

	/** Height of a brick */
	private static final int BRICK_HEIGHT = 8;

	/** Radius of the ball in pixels */
	private static final int BALL_RADIUS = 10;

	/** Offset of the top brick row from the top */
	private static final int BRICK_Y_OFFSET = 70;

	/** Number of turns */
	private static final int NTURNS = 3;

	/* Method: run() */
	/** Runs the Breakout program. */
	
	private GRect paddle;
	
	private RandomGenerator rgen = RandomGenerator.getInstance();
	private double vx = rgen.nextDouble(1.0, 3.0);
	private double vy = 3.0;
	
	
	public void run() {
			GRect paddle = new GRect(getWidth()/2 - PADDLE_WIDTH/2,getHeight() - PADDLE_Y_OFFSET , PADDLE_WIDTH, PADDLE_HEIGHT);
			paddle.setFilled(true);
			add(paddle);
			addMouseListeners();
	}
	
	public void mouseMoved(MouseEvent e) {
		GObject paddle = getElementAt(e.getX(), e.getY());
		if( paddle != null) {
			paddle.setLocation(e.getX()- PADDLE_WIDTH/2, getHeight() - PADDLE_Y_OFFSET);

		}
		
		
	}
}
	
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			