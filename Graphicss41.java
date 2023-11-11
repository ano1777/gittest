
import acm.program.*;
import acm.graphics.*;
import java.awt.event.*;
public class Graphicss41 extends GraphicsProgram{
	private GOval circle;
	
	public void run() {
		GOval circle = new GOval(40,40);
		circle.setFilled(true);
		add(circle);
		
		addMouseListeners();
		getMouseMotionListeners();
		
		}
	
	
	@Override
	

     private void mouseMoved(MouseEvent e){
    	 GOval circle = new GOval(20, 20);
    	 circle.setFilled(true);
    	 add(circle, e.getX(), e.getY());
     }
}
