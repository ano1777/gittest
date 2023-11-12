import acm.graphics.GOval;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class BouncingBall extends GraphicsProgram{
		private RandomGenerator rgen = RandomGenerator.getInstance();
		private static final int RADIUS = 20;
		public void run() {
			double vx = rgen.nextDouble(-3.0, 3.0);
			double vy = rgen.nextDouble(-3.0, 3.0);
			GOval ball = new GOval (getWidth()/2-RADIUS, getHeight()/2-RADIUS, 2*RADIUS, 2*RADIUS);
			add(ball);
			ball.move(vx,  vy);

	}

}
