import java.awt.event.MouseEvent;

import acm.graphics.GLine;
import acm.program.GraphicsProgram;

public class Shualedruri2021 extends GraphicsProgram {
	private GLine line;
	private GLine lines;
	public void run() {
		//addFirstPoint();
		line= new GLine (0,0,0, 0);
		add(line);
		addMouseListeners();
	}



	@Override
	public void mouseClicked(MouseEvent e) {
	line.setEndPoint(e.getX(), e.getY());	
	    int x = e.getX();
	    int y = e.getY();
	lines = new GLine (x, y, e.getX(), e.getY());
		add(lines);
	}
	
	public void mouseDragged(MouseEvent e) {
//		int x = 0;
//		int y = 0;
		GLine line1 = new GLine(0 , 0 , e.getX(), e.getY());
		add(line1);
	}

}