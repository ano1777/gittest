import java.awt.event.MouseEvent;

import acm.graphics.GObject;
import acm.graphics.GOval;
import acm.program.GraphicsProgram;

public class Graphicss41 extends GraphicsProgram{
	private GOval circle;
	
	public void run() {
		addMouseListeners();
		getMouseMotionListeners();
	}
	
	@Override
     private void mouseMoved (MouseEvent e) {
    	 GOval circle = new GOval(20, 20);
    	 circle.setFilled(true);
    		 add(circle, e.getX(), e.getY());
    	 
     }
}
