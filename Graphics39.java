import acm.graphics.GOval;
import acm.program.GraphicsProgram;

public class Graphics39 extends GraphicsProgram {
	private static final int PAUSE_TIME = 20;
	private static final int REVERSE_VELOCITY = -5;
	private static final int INITIAL_VELOCITY = 5;

	public void run() {

		GOval newOval = new GOval(0, getHeight() / 2 - 25, 50, 50);
		newOval.setFilled(true);
		add(newOval);
		int finalX = getWidth()-50;
		int initialX = 50;
		
		
   
			changeDirection(newOval, finalX, initialX);
			
		
	while(true) {
			if (newOval.getX() == finalX) {
				while (newOval.getX() >= initialX) {
					newOval.move(-INITIAL_VELOCITY, 0);
					pause(PAUSE_TIME);
				}
			}
	}
	}

	private void changeDirection(GOval newOval, int finalX, int initialX) {
		while(true) {
			if(newOval.getX() < finalX) {
				newOval.move(INITIAL_VELOCITY, 0);
				pause(PAUSE_TIME);
				if(newOval.getX() >= finalX) {
					while(newOval.getX() > 0) {
					newOval.move(REVERSE_VELOCITY, 0);
					pause(PAUSE_TIME);
					
					if(newOval.getX() <= 0) {
						newOval.move(INITIAL_VELOCITY, 0);
						pause(PAUSE_TIME);
					}
				}
				
			}
		}
		
	}

	
	}
}
