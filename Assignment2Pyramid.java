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
		for(int i=0; i <=14; i++) {
			numOfBricksInBase--;
		}
		
	}
	private void addBase() {
      for (int i=0; i<=BRICKS_IN_BASE; i++) {
    	  double x = getWidth()/2 - (i/2)*BRICK_WIDTH;
    	  double y = getHeight()- BRICK_HEIGHT;
    	  GRect brick = new GRect (x,y,BRICK_WIDTH, BRICK_HEIGHT);
    	  add (brick);
    	  for (int j=0; j<=14; j++) {
    		  numBricks();
    		  double x1 = getWidth()/2- (i/2)* BRICK_WIDTH;
    		  double y1 = getHeight() - i * BRICK_HEIGHT;
    		  GRect newRow = new GRect(x1,y1, BRICK_WIDTH, BRICK_HEIGHT);
    		  add(newRow);
    		  
    	  }
    	  
    	  
	
}
	}

	private int numBricks () {
		int total = 14;
		for (int i=0; i<=14; i ++) {
			total--;
		}
		return total;
	}

}
