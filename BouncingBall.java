import acm.graphics.GOval;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class BouncingBall extends GraphicsProgram{
		private RandomGenerator rgen = RandomGenerator.getInstance();
		private static final int RADIUS = 20;
		private static final int PAUSE_TIME = 10;
		public void run() {
			double vx = rgen.nextDouble(1.0, 3.0);
			   
			double vy = rgen.nextDouble(1.0, 3.0);
			GOval ball = new GOval (getWidth()/2 - RADIUS, getHeight()/2-RADIUS, 2*RADIUS, 2*RADIUS);
			ball.setFilled(true);;
			add(ball);
			while(true) {
			ball.move(vx, vy);
			pause(PAUSE_TIME);
			if ( ball.getX()>= getWidth() - 2 * RADIUS || ball.getX()<= 0) {
				vx = - vx;
			}
			if(ball.getY() >= getHeight()-RADIUS || ball.getY() <=0) {
				vy = - vy;
			}

	}

}
}