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

	private GRect brick;
	private GRect paddle;
	private GOval ball;
	private RandomGenerator rgen = RandomGenerator.getInstance();
	private GObject collider;
	double vx = rgen.nextDouble(1.0, 3.0);
	double vy = rgen.nextDouble(1.0, 3.0);
	int num;
	private RandomGenerator rgen = RandomGenerator.getInstance();
	private double vx = rgen.nextDouble(1.0, 3.0);
	private double vy = 3.0;

	public void run() {
		GLabel start = new GLabel("click to start");
		// start.setFont("Times new roman - 40");
		start.setColor(Color.RED);
		add(start, getWidth() / 2 - start.getWidth() / 2, getHeight() / 2 - start.getAscent() / 2);

		addMouseListeners();
		addPaddle();
		initialization();
		playGame();
	}

	private void playGame() {
		// goDown()\
		goUpFromPaddle();
		removeBricks();
		collider = getCollidingObject();
	}

	private void removeBricks() {
		double x = ball.getX();
		double y = ball.getY();

		if (collider != null && collider == brick) {
			remove(collider);
			changeDirection();
		}
	}

	private void goUpFromPaddle() {
		double x = ball.getX();
		double x2 = ball.getX() + 2 * BALL_RADIUS;
		double y = ball.getY() + 2 * BALL_RADIUS;
		collider = getElementAt(x, y);
		collider = getElementAt(x2, y);
		if (collider != null && collider == paddle) {
			changeDirection();
		}
	}

	private void initialization() {
		addBricks();
		addBall();
	}

	public GObject getElementAt() {
		return getCollidingObject();

	}

	private GObject getCollidingObject() {
		double x = ball.getX();
		double y = ball.getY();
		GObject onTheRightTop = getElementAt(x, y);
		GObject onTheRightBottom = getElementAt(x, y + 2 * BALL_RADIUS);
		GObject onTheLeftTop = getElementAt(x + 2 * BALL_RADIUS, y);
		GObject onTheLeftBottom = getElementAt(x + 2 * BALL_RADIUS, y + 2 * BALL_RADIUS);
		if (onTheRightTop != null) {
			return onTheRightTop;
		}
		if (onTheRightBottom != null) {
			return onTheRightBottom;
		}
		if (onTheLeftTop != null) {
			return onTheLeftTop;
		}
		if (onTheLeftBottom != null) {
			return onTheLeftBottom;
		} else {
			return null;
		}

		// collider = getElementAt(x, y);
		// collider = getElementAt(pointX2, y);
		// collider = getElementAt(x, pointY2);
		// collider = getElementAt(pointX2, pointY2);
		// collider = getCollidingObject;
		// while(true){
		// if (collider != null && collider == paddle) {
		// changeDirection();
		// }
		// if (collider == brick) {
		// remove(collider);
		// changeDirection();
		//
		// return collider;
		// } else {
		// return null;
		// }
		// }

	}

	private void changeDirection() {
		vx = -vx;
		vy = -vy;
		ball.move(vx, vy);
		pause(PAUSE_TIME);
	}

	// collider = getCollidingObject();
	// while(true) {
	// if (collider == getElementAt(x, y)) {
	// if(collider== brick && collider != null)
	// remove(collider);
	// ball.move(-vx, -vy);
	// pause(PAUSE_TIME);
	// }
	// if(collider == getElementAt(x + 2*BALL_RADIUS, y)){
	// if(collider== brick && collider != null)
	// remove(collider);
	// vx= - vx;
	// vy= - vy;
	// pause(PAUSE_TIME);
	// }
	// if(collider == getElementAt(x, y+2*BALL_RADIUS)){
	// if(collider== brick && collider != null)
	// remove(collider);
	// vy= -vy;
	// vx= -vx;
	// pause(PAUSE_TIME);
	// }
	// if(collider == getElementAt(x + 2*BALL_RADIUS, y + 2*BALL_RADIUS));
	// if(collider == brick && collider != null){
	// remove(brick);
	// vy=-vy;
	// vx= -vx;
	// pause(PAUSE_TIME);
	// }
	//
	// if(ball.getY()+2 * BALL_RADIUS == paddle.getY()) {
	// vx= -vx;
	// vy= -vy;
	// ball.move(vx, vy);
	// }
	// }
	// }

	private void addPaddle() {
		paddle = new GRect(WIDTH / 2 - PADDLE_WIDTH / 2, HEIGHT - PADDLE_Y_OFFSET * 2, PADDLE_WIDTH, PADDLE_HEIGHT);
		paddle.setFilled(true);
		add(paddle);
		addMouseListeners();
	}

	public void mouseMoved(MouseEvent e) {
		double x = e.getX();
		if (x >= 0 && x <= WIDTH - PADDLE_WIDTH) {
			paddle.setLocation(x, HEIGHT - PADDLE_Y_OFFSET * 2);
		}
	}

	private void addBall() {
		ball = new GOval(WIDTH / 2 - BALL_RADIUS, HEIGHT / 2 - BALL_RADIUS, 2 * BALL_RADIUS, 2 * BALL_RADIUS);
		ball.setFilled(true);
		add(ball);

		waitForClick();

		while (true) {
			ball.move(vx, vy);
			pause(PAUSE_TIME);
			if (ball.getX() >= WIDTH - 2 * BALL_RADIUS || ball.getX() <= 0) {
				vx = -vx;
			}
			if (ball.getY() >= HEIGHT - 2 * BALL_RADIUS || ball.getY() <= 0) {
				vy = -vy;
			}
			if (ball.getY() >= getHeight()) {
				goBackToCenter();
				lifeLossNum();
			}

			if (num == 3) {
				removeAll();
				GLabel lose = new GLabel("YOU LOST");
				lose.setFont("Times new roman - 40");
				lose.setColor(Color.RED);
				add(lose, WIDTH / 2 - lose.getWidth(), HEIGHT / 2 - lose.getAscent());
				break;
			}
		}
	}

	private int lifeLossNum() {
		num = 0;
		for (int i = 0; i < NTURNS; i++) {
			if (ball.getY() + 2 * BALL_RADIUS >= HEIGHT) {
				num++;
			}
		}
		return num;
	}

	private void goBackToCenter() {
		ball.setLocation(WIDTH / 2 - BALL_RADIUS, HEIGHT / 2 - BALL_RADIUS);
	}

	// animations

	private void addBricks() {
		for (int i = 0; i < NBRICK_ROWS; i++) {
			for (int j = 0; j < NBRICKS_PER_ROW; j++) {
				double x = WIDTH / 2 - BRICK_WIDTH * NBRICKS_PER_ROW / 2 - BRICK_SEP * (NBRICKS_PER_ROW / 2 - 0.5);
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
