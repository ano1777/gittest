
import acm.program.*;
import acm.graphics.*;

import java.awt.Color;
import java.awt.event.*;
public class Graphicss41 extends GraphicsProgram{
    private static final int RADIUS = 10;
	
	public void run() {
		addMouseListeners();
		getMouseMotionListeners();
		
	}
	@Override
     public void mouseDragged(MouseEvent e){
    	 GOval circle = new GOval(2*RADIUS, 2* RADIUS);
    	 circle.setFilled(true);
    	 circle.setColor(Color.GREEN);
    	 add(circle, e.getX()-RADIUS, e.getY()-RADIUS);
     }
}
