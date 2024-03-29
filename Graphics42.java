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
	private RandomGenerator rgen;
	private static final int CIRCLE_D = 100;
	private static final int DELAY = 1000;

	public void init() {
		addMouseListeners();
		rgen = RandomGenerator.getInstance();
	}


	public void run() {
		while (true) {
			if (selectedObject != null) {
				while (selectedObject.getColor() != Color.GREEN) {
					Color color = myRandomColor();
					selectedObject.setColor(color);
					pause(DELAY);
				}
				selectedObject = null;
			}
			println("E");
		}
	}

	public void mousePressed(MouseEvent e) {
		double x = e.getX();
		double y = e.getY();
		GObject object = getElementAt(x, y);

		if (object == null) {
			circle = new GOval(x - CIRCLE_D / 2, y - CIRCLE_D / 2, CIRCLE_D, CIRCLE_D);
			circle.setFilled(true);
			circle.setColor(myRandomColor());
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
	