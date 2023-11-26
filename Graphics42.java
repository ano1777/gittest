import java.awt.event.MouseEvent;

import acm.graphics.GLine;
import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class Graphics42 extends GraphicsProgram{
	
private GRect square;
	public void run() {
		 square = new GRect (0,0, 40,40);
		add(square);
	}
		public void mouseMoved(MouseEvent e) {
			int x = e.getX() -  40/2;
			int y = e.getY() - 40/2;
			square.setLocation(x, y);
		}

}