//import acm.program.ConsoleProgram;
//
//public class circles extends ConsoleProgram {
//	private static final int NUM = 0;
//
//	public void run() {
//
//		int n = readInt(" ? ");
//		int max = n;
//		int min = n;
//
//		if (n == NUM) {
//			println(" this number is not allowed. try again.");
//			n = readInt(" ? ");
//		}
//
//		while (n != NUM) {
//			n = readInt(" ? ");
//			
//			if (max < n) {
//				max = n;
//
//			if (min > n) {
//				min = n;
//			}
//			}
//
//			if (n == NUM) {
//				addMaxAndMin( max, min);
//
//			}
//		}
//
//	}
//
//	private void addMaxAndMin( int max, int min) {
//		println("smallest : " + min);
//		println("largest : " + max);
//
//	}

import acm.program.*;
import acm.graphics.*;
import java.awt.event.*;
public class circles extends GraphicsProgram {
public void run() {
label = new GLabel("");
label.setFont("Times New Roman-36");
add(label, 50, 50);
// Must call this method to be able to get mouse events
addMouseListeners();
}
// This method is called everytime user moves mouse
public void mouseMoved(MouseEvent e) {
label.setLabel("Mouse: (" + e.getX() + ", " + e.getY() + ")");
}
/* Private instance variable */
private GLabel label;
}

