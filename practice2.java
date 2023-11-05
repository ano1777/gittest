import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class practice2 extends GraphicsProgram {

/** Width of each brick in pixels */
	private static final int BRICK_WIDTH = 30;

/** Width of each brick in pixels */
	private static final int BRICK_HEIGHT = 12;

/** Number of bricks in the base of the pyramid */
	private static final int BRICKS_IN_BASE = 15;
	public void run() {
		calculateSqrt();	
	}
	
	private void calculateSqrt() {
        int a = readInt("a : ");
		int b = readInt("b : ");
		double c = Math.sqrt(a * a + b * b);
		println("c = " + c);
	}
}