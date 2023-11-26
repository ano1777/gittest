import java.awt.Color;
import java.awt.event.MouseEvent;



import acm.graphics.GLine;
import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class Graphics42 extends GraphicsProgram {

	private GOval circle;
	private RandomGenerator rgen = RandomGenerator.getInstance();
	private static final int CIRCLE_D = 50;

	public void run() {
		addMouseListeners();
	}

	@Override
	public void mousePressed(MouseEvent e) {
		Color color = rgen.nextColor();
		circle = new GOval(CIRCLE_D, CIRCLE_D);
		circle.setFilled(true);
		circle.setColor(color);
	
		add(circle, e.getX() - CIRCLE_D/2, e.getY()-CIRCLE_D/2);
	}
	//@Override 
//	public void mouse(MouseEvent e) {
//		Color color = rgen.nextColor();
//		for(int i=0; i<5; i++) {
//			circle.setColor(color);
//		}
//	}
}