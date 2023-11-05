import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class practice2 extends GraphicsProgram {

/** Width of each brick in pixels */
	private static final int BRICK_WIDTH = 30;

/** Width of each brick in pixels */
	private static final int BRICK_HEIGHT = 12;

/** Number of bricks in the base of the pyramid */
	private static final int BRICKS_IN_BASE = 20;
	
	  public void run() {
		  addPyramid();
		double initialX = 0;
		double initialY = 0;
		double numBricks = BRICKS_IN_BASE;
		
		initialX = getWidth()/2 -(numBricks * BRICK_WIDTH)/2;
		initialY = getHeight() - BRICK_HEIGHT;
		
		/*number of rows*/
		for( int i = 0; i<BRICKS_IN_BASE; i++) {
			
		
			for( int j = 0; j<numBricks; j++) {
				double x = initialX + i*BRICK_WIDTH + j*BRICK_WIDTH/2;
		        double y = initialY - j* BRICK_HEIGHT;
				GRect brick = new GRect(x, y, BRICK_WIDTH, BRICK_HEIGHT);
				add(brick);
			}
			numBricks--;
		}
		
		

	}

	private void addPyramid() {
	
		
	}
}