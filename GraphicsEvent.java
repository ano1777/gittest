import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

import com.sun.prism.paint.Color;

import acm.graphics.GLabel;
import acm.graphics.GObject;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class GraphicsEvent  extends GraphicsProgram {
	GLabel label;
	public void run() {
		 label = new GLabel("key typed");
		add(label, 100,100);
		addKeyListeners();
		addMouseListeners();
		
	}
	public void mouseDragged(MouseEvent e) {
		
	}
	public void keyTyped(KeyEvent e) {
		label.setLabel("key typed " + e.getKeyChar());
	}
}
//	private GRect newRect;
//	private GRect rect2;
//	label = new GLabel("")
//	public void run(){
//		
//	GRect newRect = new GRect( 100, 100, 150,150);
//	newRect.setFilled(true);
//	add(newRect);
//	
//	addMouseListeners();
//	addKeyListeners();
//	}
//	
//	public void mouseClicked(MouseEvent e) {
////	System.out.println("here");
////		e. getX();
//		
//		GObject obj = getElementAt(e.getX(), e.getY());
//		
//		if(obj != null) {
//			obj.setColor(Color.RED);
//			
//		}
//		
//		if(obj == newRect) {
//
//			
//			
//		}
//		
//	}
//	public void KeyTyped(keyEvent e) {
//		label.setLabel("key typed : ")
//		e.
//	}
//	}
