import java.awt.event.MouseEvent;

import acm.graphics.GLine;
import acm.program.GraphicsProgram;

public class Shualedruri2021 extends GraphicsProgram {
	public void run() {
		//addFirstPoint();
		addMouseListeners();
	}




	@Override
	public void mouseClicked(MouseEvent e) {
	    int x = 0;
	    int y =0;
		GLine line = new GLine(x , y , x, y);
		add(line);
		x = e.getX();
		y = e.getY();
		GLine lines = new GLine(x, y, e.getX(), e.getY());
		add(lines);
	}
	
//	public void mouseDragged(MouseEvent e) {
//		GLine line1 = new GLine(0,0 , e.getX(), e.getY());
//		add(line1);
//	}
}
