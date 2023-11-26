import java.awt.event.MouseEvent;

import acm.graphics.GLine;
import acm.program.GraphicsProgram;

public class Shualedruri2021 extends GraphicsProgram {
	public void run() {
		addFirstPoint();
		addMouseListeners();
	}

	private void addFirstPoint() {
		GLine point = new GLine(0, 0, 0, 0);
		add(point);
	}

	@Override
	public void mouseClicked(MouseEvent e) {	
		GLine line = new GLine(0, 0, e.getX(), e.getY());
		add(line);
		//while(e.getX()< getWidth() && e.getY()<getHeight())
	}
	
	public void mouseDragged(MouseEvent e) {
		GLine line1 = new GLine(0,0 , e.getX(), e.getY());
		add(line1);
	}
}
