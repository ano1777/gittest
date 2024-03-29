import java.awt.Color;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class graphics34 extends GraphicsProgram {
	private RandomGenerator rgen = RandomGenerator.getInstance();
	private static final int MAX_NUM = 1000;
	private static final int MIN_RADIUS =10;
	private static final int MAX_RADIUS = 90;
	
	public void run() {
		for (int i = 0; i <= MAX_NUM; i++ ) {
			double radius = rgen.nextDouble(MIN_RADIUS, MAX_RADIUS);
			double x = rgen.nextDouble(0, getWidth()- 2* radius);
			double y = rgen.nextDouble(0, getHeight() - 2* radius);
			Color color = rgen. nextColor();
			GOval circle = new GOval(x, y, 2*radius, 2*radius);
			circle.setFilled(true);
			circle.setColor(color);
			add(circle, x, y);
		}
	
	}
}


