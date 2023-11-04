import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class Assignment2Pyramid extends GraphicsProgram {
	private static final int BRICKS_IN_BASE = 14;
	private static final int BRICK_WIDTH = 30;
	private static final int BRICK_HEIGHT = 12;
    int bricksInRow = BRICKS_IN_BASE;
    int x1;
    int y1;
	public void run() {
		addBase();
	
	}

	private void addBase() {
		
	for (int i = 0; i < bricksInRow; i++) {
		for (int j = 1; j<=BRICKS_IN_BASE; j++) {   	
				int x1 = getWidth()/2 - ((BRICK_WIDTH * i)/2) + (i* BRICK_WIDTH) ;
				int y1 = getHeight() - (BRICK_HEIGHT*j);
				GRect brick = new GRect(x1, y1, BRICK_WIDTH, BRICK_HEIGHT);
				add(brick);
				
			}
		bricksInRow--;
		x1 = getWidth()/2 - BRICK_WIDTH* bricksInRow/2;
		}
	}

}

//+j * (BRICK_WIDTH)/2)