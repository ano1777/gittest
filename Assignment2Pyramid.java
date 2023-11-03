import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class Assignment2Pyramid extends GraphicsProgram {
	private static final int BRICKS_IN_BASE = 14;
	private static final int BRICK_WIDTH = 30;
	private static final int BRICK_HEIGHT = 12;

	public void run() {
		int numOfBricksInBase = 14;
		addPyramid();
	}

	private void addPyramid() {
		addBase();

	}

	private void addBase() {
		for (int j = 14; j >= 0; j--) {
			numBricks();
			

			for (int i = 0; i <= BRICKS_IN_BASE; i++) {
				double x = getWidth() / 2 - (BRICKS_IN_BASE / 2) * BRICK_WIDTH + i * BRICK_WIDTH;
				double y = getHeight() - BRICK_HEIGHT;
				GRect brick = new GRect(x, y, BRICK_WIDTH, BRICK_HEIGHT);
				add(brick);

			}

		}
	}

	private int numBricks() {
		int total = 14;
		for (int i = 0; i <= 14; i++) {
			total--;
		}
		return total;
	}

}
