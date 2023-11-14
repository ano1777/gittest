import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import acm.graphics.GLabel;
import acm.graphics.GObject;
import acm.graphics.GOval;
import acm.graphics.GPoint;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class breakout extends GraphicsProgram {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
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
	
	private GLabel start;
	private RandomGenerator rgen = RandomGenerator.getInstance();
//	private double vx = rgen.nextDouble(1.0, 3.0);
//	private double vy = 3.0 ;

	private GRect brick = null;
	//private boolean startAnim = false;

	public void init () {
		  start  =  new GLabel("click to start");
			start.setFont("Times new roman - 40");
			start.setColor(Color.RED);
			add(start, getWidth()/2 - start.getWidth()/2, getHeight()/2 - start.getAscent()/2);
	}
	
	public void run() {
		addBricks();
		addPaddle();
	}
	
	private void addPaddle() {
		paddle = new GRect(getWidth()/2 - PADDLE_WIDTH/2,getHeight() - PADDLE_Y_OFFSET , PADDLE_WIDTH, PADDLE_HEIGHT);
		paddle.setFilled(true);
		add(paddle);
		addMouseListeners();
		
	}
	@Override
	public void mouseMoved(MouseEvent e) {
		GObject paddle = getElementAt(e.getX(), e.getY());
		while(paddle.getX()>0 && paddle.getX()<getWidth() - PADDLE_WIDTH) {
		if (paddle != null) {
			paddle.setLocation(e.getX()- PADDLE_WIDTH/2, getHeight() - PADDLE_Y_OFFSET);
			if (paddle.getX()<=0 || paddle.getX()+PADDLE_WIDTH >= getWidth()) {			
			}
		}
		// getElementAt (x, y)(ball coordinates) and remove GRect brick.
		}
	}
	

	private void addBricks(){
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				double x = getWidth() / 2 - BRICK_WIDTH * NBRICKS_PER_ROW / 2 - BRICK_SEP * (NBRICKS_PER_ROW / 2 - 0.5);
				double y = BRICK_Y_OFFSET + (j * (BRICK_SEP + BRICK_HEIGHT));
				 brick = new GRect(x + (i * (BRICK_WIDTH + BRICK_SEP)), y, BRICK_WIDTH, BRICK_HEIGHT);
				brick.setFilled(true);
				if (j == 0 || j == 1) {
					brick.setColor(Color.RED);
				}
				if (j == 2 || j == 3) {
					brick.setColor(Color.ORANGE);
				}
				if (j == 4 || j == 5) {
					brick.setColor(Color.YELLOW);
				}
				if (j == 6 || j == 7) {
					brick.setColor(Color.GREEN);
				}
				if (j == 8 || j == 9) {
					brick.setColor(Color.CYAN);
				}
				add(brick);
			}
			}
		}
	}

	
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			