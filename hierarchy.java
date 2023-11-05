import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class hierarchy extends GraphicsProgram {
	private static final double RECT_WIDTH = 100;
	private static final double RECT_HEIGHT = 60;
	private static final double SPACE_BETW_RECTS = 60;
	public void run() {
		for (int i =0; i<3; i++) {
			double x = getWidth() / 2 - (1.5 * RECT_WIDTH) - SPACE_BETW_RECTS + (i*(RECT_WIDTH+SPACE_BETW_RECTS));
			double y = getHeight() / 3 + SPACE_BETW_RECTS * 2;
			GRect rect = new GRect (x, y, RECT_WIDTH, RECT_HEIGHT);
			add(rect);
		}
	}

}
