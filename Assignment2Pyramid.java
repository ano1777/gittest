import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class Assignment2Pyramid extends GraphicsProgram {
	private static final int BRICKS_IN_BASE = 14;
	private static final int BRICK_WIDTH = 30;
	private static final int BRICK_HEIGHT = 12;

	public void run() {
		int numOfBricksiNBase = 14;
		addPyramid();
	}

	private void addPyramid() {
		addBase();

	}

	private void addBase() {
		while (newRow) {
			
		}
		for (int j = 1; j <=BRICKS_IN_BASE; j++) {
		
			double x1 = getWidth()/2 - (BRICKS_IN_BASE/2) + j*(BRICK_WIDTH/2);
			double y1 = getHeight() - (j+1 )* BRICK_HEIGHT;
			GRect newRow = new GRect(x1, y1, BRICK_WIDTH, BRICK_HEIGHT);
			add(newRow);

			for (int i = 1; i <= BRICKS_IN_BASE; i++) {
				double x = getWidth() / 2 - (BRICKS_IN_BASE / 2) * BRICK_WIDTH + i * BRICK_WIDTH;
				double y = getHeight() - BRICK_HEIGHT;
				GRect brick = new GRect(x, y, BRICK_WIDTH, BRICK_HEIGHT);
				add(brick);
				

			}

		}
	}

	private int numBricks(int numOfBricksInBase) {
		int total = 14;
		for (int i = 0; i <= 14; i++) {
			boolean ifNewRow (int num) {
				if (ifNewRow){
					total--;
				}
				return num;
			}	
				
		}
		return total;
	}

}
