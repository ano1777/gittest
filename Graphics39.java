import acm.graphics.GOval;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class Graphics39 extends GraphicsProgram {
	private static final int PAUSE_TIME = 20;
	private static final int REVERSE_VELOCITY = -10;
	private static final int INITIAL_VELOCITY = 10;
	private RandomGenerator rgen = RandomGenerator.getInstance();
	public void run() {
		GOval newOval = new GOval(0, getHeight() / 2 - 25, 50, 50);
		newOval.setFilled(true);
		add(newOval);
		int finalX = getWidth() - 50;
		int initialX = 0;
        int initialVelo = rgen.nextInt(10, 20);
	//	goToTheEnd(newOval, finalX, initialX);
		newOval.move(initialVelo, initialVelo);
		pause(1);
	}
	
//go to the end of the canvas
//	private void goToTheEnd(GOval newOval, int finalX, int initialX) {
//		while (true) {
//			if (newOval.getX() < finalX) {
//				newOval.move(INITIAL_VELOCITY, 0);
//				pause(PAUSE_TIME);
//				if (newOval.getX() >= finalX) {
//					changeDirection(newOval, finalX, initialX );
//				}
//			}
//		}
//	}
////if the ball is on the the last coordinate of x, it starts moving backwards and goes to the start.
////this process lasts infinitively.
//	private void changeDirection(GOval newOval, int finalX, int initialX) {
//		while (newOval.getX() > 0) {
//			newOval.move(REVERSE_VELOCITY, 0);
//			pause(PAUSE_TIME);
//
//			if (newOval.getX() <= initialX) {
//
//			while (newOval.getX() <= finalX) {
//				newOval.move(INITIAL_VELOCITY, 0);
//				pause(PAUSE_TIME);
//				}
//			}
//		}
//	}
//	
//	
}