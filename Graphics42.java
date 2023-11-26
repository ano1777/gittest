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
		addMouseListeners();
	}
		public void mouseMoved(MouseEvent e) {
			int x = 10;
			int y = 10;
			square.move(x, y);
		}

}