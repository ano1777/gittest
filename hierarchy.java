import acm.graphics.GLabel;
import acm.graphics.GLine;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class hierarchy extends GraphicsProgram {
	private static final double RECT_WIDTH = 150;
	private static final double RECT_HEIGHT = 60;
	private static final double SPACE_HORIZONTAL = 20;
	private static final double SPACE_VERTICAL =120;

	/* this class adds hierarchy system of programs on canvas */
	public void run() {
		addRectOnTheTop();
		addThreeRects();
		addFirstLabel();
		addSecondLabel();
		addThirdLabel();
		addThreeLines();
	}

	/*
	 * this method adds the top rectangle in the middle and adds the label
	 * "program" inside of it
	 */

	private void addRectOnTheTop() {
		double x = getWidth() / 2 - RECT_WIDTH / 2;
		double y = getHeight() / 3 - RECT_HEIGHT / 2;
		GRect frame = new GRect(x, y, RECT_WIDTH, RECT_HEIGHT);
		add(frame);

		GLabel label = new GLabel("program");
		double x1 = x + RECT_WIDTH / 2 - label.getWidth() / 2;
		double y1 = y + RECT_HEIGHT / 2 + label.getAscent() / 3;

		GLabel label1 = new GLabel("program", x1, y1);
		add(label1);
	}

	/*
	 * this method adds three lines on canvas that link the rectangles with each
	 * other.
	 */

	private void addThreeLines() {
		double x = getWidth() / 2;
		double y = getHeight() / 3 + RECT_HEIGHT / 2;
		double x1 = getWidth() / 2;
		double y1 = getHeight() / 3 + SPACE_VERTICAL;
		double x2 = getWidth() / 2 - RECT_WIDTH - SPACE_HORIZONTAL;
		double x3 = getWidth() / 2 + RECT_WIDTH + SPACE_HORIZONTAL;

		GLine middleLine = new GLine(x, y, x1, y1);
		add(middleLine);

		GLine leftLine = new GLine(x, y, x2, y1);
		add(leftLine);

		GLine rightLine = new GLine(x, y, x3, y1);
		add(rightLine);
	}
	/* this method adds three rectangles on the bottom */
	private void addThreeRects() {
		for (int i = 0; i < 3; i++) {
			double x = getWidth() / 2 - (1.5 * RECT_WIDTH) - SPACE_HORIZONTAL + (i * (RECT_WIDTH + SPACE_HORIZONTAL));
			double y = getHeight() / 3 + SPACE_VERTICAL;
			GRect rect = new GRect(x, y, RECT_WIDTH, RECT_HEIGHT);
			add(rect);
		}
	}
	/*
	 * this method adds the rectangle on the left side of canvas with the label
	 * "GraphicsProgram" inside of it
	 */

	private void addFirstLabel() {

		GLabel label = new GLabel("GraphicsProgram");
		double x1 = getWidth() / 2 - (1.5 * RECT_WIDTH) - SPACE_HORIZONTAL + RECT_WIDTH / 2 - label.getWidth() / 2;
		double y1 = getHeight() / 3 + SPACE_VERTICAL + RECT_HEIGHT / 2 + label.getAscent() / 3;
		GLabel firstWord = new GLabel("GraphicsProgram", x1, y1);
		add(firstWord);
	}

	/*
	 * this function adds the middle rectangle on the canvas with the label
	 * "ConsoleProgram" inside of it
	 */

	private void addSecondLabel() {
		GLabel label = new GLabel("ConsoleProgram");
		double x1 = getWidth() / 2 - (1.5 * RECT_WIDTH) - SPACE_HORIZONTAL + (1 * (RECT_WIDTH + SPACE_HORIZONTAL))
				+ RECT_WIDTH / 2 - label.getWidth() / 2;
		double y1 = getHeight() / 3 + SPACE_VERTICAL + RECT_HEIGHT / 2 + label.getAscent() / 3;
		GLabel secondWord = new GLabel("ConsoleProgram", x1, y1);
		add(secondWord);
	}

	/*
	 * this function adds the rectangle on the right side of the canvas with the
	 * label "DialogProgram" inside of it
	 */

	private void addThirdLabel() {

		GLabel label = new GLabel("DialogProgram");
		double x1 = getWidth() / 2 - (1.5 * RECT_WIDTH) - SPACE_HORIZONTAL + (2 * (RECT_WIDTH + SPACE_HORIZONTAL))
				+ RECT_WIDTH / 2 - label.getWidth() / 2;
		double y1 = getHeight() / 3 + SPACE_VERTICAL + RECT_HEIGHT / 2 + label.getAscent() / 3;
		GLabel thirdWord = new GLabel("DialogProgram", x1, y1);
		add(thirdWord);
	}
}
