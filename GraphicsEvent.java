import java.awt.event.MouseEvent;

import com.sun.prism.paint.Color;

import acm.graphics.GObject;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class GraphicsEvent  extends GraphicsProgram {
	private GRect newRect;
	private GRect rect2;
	label = new GLabel("")
	public void run(){
		
	GRect newRect = new GRect( 100, 100, 150,150);
	newRect.setFilled(true);
	add(newRect);
	
	addMouseListeners();
	addKeyListeners();
	}
	
	public void mouseClicked(MouseEvent e) {
//	System.out.println("here");
//		e. getX();
		
		GObject obj = getElementAt(e.getX(), e.getY());
		
		if(obj != null) {
			obj.setColor(Color.RED);
			
		}
		
		if(obj == newRect) {

			
			
		}
		
	}
	public void KeyTyped(keyEvent e) {
		label.setLabel("key typed : ")
		e.
	}
	}
