
import acm.program.*;
import acm.graphics.*;

import java.awt.Color;
import java.awt.event.*;
public class Graphicss41 extends GraphicsProgram{

	
	public void run() {
		addMouseListeners();
		getMouseMotionListeners();
		
		}
	
	
	@Override
	

     public void mouseEntered(MouseEvent e){
    	 GOval circle = new GOval(20, 20);
    	 circle.setFilled(true);
    	 circle.setColor(Color.GREEN);
    	 add(circle, e.getX(), e.getY());
     }
}
