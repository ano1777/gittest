import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class Assignment2Pyramid extends GraphicsProgram {
	private static final int BRICKS_IN_BASE = 14;
	private static final int BRICK_WIDTH = 30;
	private static final int BRICK_HEIGHT = 12;

	public void run() {
		addBase();
		
	}

	private void addBase() {
	for (int i = 0; i < BRICKS_IN_BASE; i++) {
		for (int j = BRICKS_IN_BASE; j>=1; j++) {
	     	
				double x = getWidth()/2 - (BRICK_WIDTH * BRICKS_IN_BASE/2) +(i * BRICK_WIDTH ) + j * (BRICK_WIDTH/2) ;
				double y = getHeight() - j* BRICK_HEIGHT;
				GRect brick = new GRect(x, y, BRICK_WIDTH, BRICK_HEIGHT);
				add(brick);
			}

		}
	}

}
//+j * (BRICK_WIDTH)/2)