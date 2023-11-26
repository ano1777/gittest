import java.awt.Color;
import java.awt.event.MouseEvent;

import acm.graphics.GLine;
import acm.graphics.GObject;
import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class Graphics42 extends GraphicsProgram {
	private GObject selectedObject = null;
	private GOval circle;
	private RandomGenerator rgen = RandomGenerator.getInstance();
	private static final int CIRCLE_D = 100;
	private static final int DELAY = 10;

	public void run() {
		addMouseListeners();
		while(true) {
		if (selectedObject != null) {
			while (selectedObject.getColor() != Color.GREEN) {
				Color color = myRandomColor();
				circle.setColor(color);				
				pause(DELAY);
			}
		}
	}
	}
	public void mousePressed(MouseEvent e) {
		double x = e.getX();
		double y = e.getY();
		GObject object = getElementAt(x, y);
		
		if (object == null) {
			Color color = rgen.nextColor();
		 circle = new GOval(x - CIRCLE_D/2, y - CIRCLE_D/2, CIRCLE_D, CIRCLE_D);
			circle.setFilled(true);
			circle.setColor(color);
			add(circle);
		} else {
			selectedObject = object;
		}
	}

	private Color myRandomColor() {
		int randNum = rgen.nextInt(5);
		if (randNum == 0)
			return Color.GREEN;
		if (randNum == 1)
			return Color.YELLOW;
		if (randNum == 2)
			return Color.RED;
		if (randNum == 3)
			return Color.BLACK;
		return Color.BLUE;
	}
}