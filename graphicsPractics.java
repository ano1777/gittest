import java.awt.event.MouseEvent;

import acm.graphics.GLine;
import acm.graphics.GPoint;
import acm.program.GraphicsProgram;

public class graphicsPractics extends GraphicsProgram{
	int x =0;
	int y =0;
	GLine newLine;
	GPoint prevPoint;
	public void run() {
		addMouseListeners();
	    prevPoint = new GPoint(0,0);
	}
	
public void mousePressed(MouseEvent e) {
	 newLine = new GLine(prevPoint.getX(), prevPoint.getY(), e.getX(), e.getY());
	 add (newLine);
	 prevPoint = new GPoint(e.getX(), e.getY());
}

public void mouseDragged(MouseEvent e) {
	newLine.setEndPoint(e.getX(), e.getY());
	add(newLine);
}
}

//public void run() {
//	addMouseListeners();
//}
//public void mousePressed(MouseEvent e){
//	newLine = new GLine(x, y, e.getX(), e.getY());
//	add(newLine);
//}
//public void mouseDragged(MouseEvent e) {
//	newLine.setEndPoint(e.getX(), e.getY());
//	add(newLine);
//}
//public void mouseReleased(MouseEvent e) {
//	x= e.getX();
//	y=e.getY();
//}

















//private GLine line;
//int x =0;
//int y = 0;
//
//public void run() {
//x =0;
//y = 0;
//addMouseListeners();
//}
//
//@Override
//public void mousePressed(MouseEvent e) {
//line = new GLine(x, y, e.getX(), e.getY());
//add(line);
//
//}
//@Override
//public void mouseDragged(MouseEvent e) {
//line.setEndPoint(e.getX(), e.getY());
//}
//@Override
//public void mouseReleased(MouseEvent e) {
//x = e.getX();
//y= e.getY();
//}
