import java.awt.event.MouseEvent;

import acm.graphics.GLine;
import acm.graphics.GOval;
import acm.program.GraphicsProgram;

public class Graphics42 extends GraphicsProgram{
	public void run() {
		addMouseListeners();
		getMouseMotionListeners();
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		GOval firstPoint = new GOval(5,5);
		firstPoint.setFilled(true);
		add(firstPoint, e.getX(), e.getY());
		}
	public void mouseMoved(MouseEvent e) {
		GLine line = new GLine(e.getX(), e.getY(), e.getX(), e.getY());
		add(line);
		
	}
	}
	


