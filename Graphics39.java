import acm.graphics.GOval;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class Graphics39 extends GraphicsProgram {
	private static final int PAUSE_TIME = 20;
	private static final int REVERSE_VELOCITY = -10;
	private static final int INITIAL_VELOCITY = 10;

	public void run() {
		GOval newOval = new GOval(0, getHeight() / 2 - 25, 50, 50);
		newOval.setFilled(true);
		add(newOval);
		int finalX = getWidth() - 50;
		int initialX = 0;
		while (true) {
			goToTheEnd(newOval, finalX, initialX);
			goBackwards(newOval, initialX, finalX);
		}
	}
	// go to the end of the canvas

	private void goToTheEnd(GOval newOval, int finalX, int initialX) {
		while (newOval.getX() >= initialX) {
			newOval.move(INITIAL_VELOCITY, 10);
			pause(PAUSE_TIME);
			if (newOval.getX() >= finalX) {
				goBackwards(newOval, initialX, finalX);
			}
			if(newOval.getY() <= 0) {
				while(newOval.getY() < getHeight())
				newOval.move(INITIAL_VELOCITY, 5);
				pause(PAUSE_TIME);
			
			if(newOval.getY() >= getHeight()-50) {
				while(newOval.getY() > 0){
				newOval.move(INITIAL_VELOCITY ,-5);
				pause(PAUSE_TIME);
				}
					
				}
				}
			}
		}
	

	private void goBackwards(GOval newOval, int initialX, int finalX) {
		while(newOval.getX() > initialX) {
			newOval.move(REVERSE_VELOCITY, 5);
			pause(PAUSE_TIME);
				
				
			}
			
		}
	}
