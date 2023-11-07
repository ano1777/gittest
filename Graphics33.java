import java.awt.Color;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class Graphics33 extends GraphicsProgram{
	private RandomGenerator rgen = RandomGenerator.getInstance();

	private static final int MIN_RAD = 10;
	private static final int MAX_RAD = 100;
	public void run() {
		
		double x = rgen.nextDouble(getWidth()/2 - 100, getWidth()/2 + 200);
		double y = rgen. nextDouble(getHeight()/2-100, getHeight()/2 +200);
		double radius = rgen.nextDouble(MIN_RAD, MAX_RAD);
		Color color = rgen. nextColor();

		GRect oneOval = new GRect(x, y, 2* radius, 2*radius);
		oneOval.setFilled(true);
		oneOval.setColor(color);
		add(oneOval);
		
	}

}
