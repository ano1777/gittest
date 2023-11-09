import acm.graphics.GOval;
import acm.program.GraphicsProgram;

public class Graphics39 extends GraphicsProgram {
	private static final int PAUSE_TIME = 20;
	private static final int INITIAL_VELOCITY = 5;

	public void run() {

		GOval newOval = new GOval(0, getHeight() / 2 - 25, 50, 50);
		newOval.setFilled(true);
		add(newOval);
		int finalX = getWidth()-50;
		int initialX = 50;

		while (newOval.getX() < finalX) {
			newOval.move(INITIAL_VELOCITY, 0);
			pause(PAUSE_TIME);
		} while(true) {
			if (newOval.getX() == finalX) {
				if (newOval.getX() >= initialX) {
					newOval.move(-INITIAL_VELOCITY, 0);
					pause(PAUSE_TIME);
				}
			}

		}

	}

}