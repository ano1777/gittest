import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class practice2 extends GraphicsProgram {

/** Width of each brick in pixels */
	private static final int BRICK_WIDTH = 30;

/** Width of each brick in pixels */
	private static final int BRICK_HEIGHT = 12;

/** Number of bricks in the base of the pyramid */
	private static final int BRICKS_IN_BASE = 14;
	
	  public void run() {
		  addPyramid();
		  
}
	private void addPyramid() {
		int numBricks = 14;
	for(int i =0; i<BRICKS_IN_BASE; i++) {
		for(int j=1; j<=1;j++) {
			double x = getWidth()/2 -(i+1)* BRICK_WIDTH+numBricks*BRICK_WIDTH;
			double y = getHeight() -j*BRICK_HEIGHT;
			GRect newRect = new GRect (x, y, BRICK_WIDTH, BRICK_HEIGHT);
			add(newRect);
			
		}
	}
	}
}