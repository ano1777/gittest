import java.awt.event.MouseEvent;

import acm.graphics.GLine;
import acm.program.ConsoleProgram;
import acm.program.GraphicsProgram;

public class Shualedruri2021 extends ConsoleProgram {
	public void run() {
	double a = 12;
	double b = 2.4;
	double c = 2;
	double k = a/5 + b/2 + c/5;
	println(k);
}
	
	
//	private GLine line;
//	int x =0;
//	int y = 0;
//
//	public void run() {
//		x =0;
//		y = 0;
//		addMouseListeners();
//	}
//
//	@Override
//	public void mousePressed(MouseEvent e) {
//		line = new GLine(x, y, e.getX(), e.getY());
//		add(line);
//		
//	}
//	@Override
//	public void mouseDragged(MouseEvent e) {
//		line.setEndPoint(e.getX(), e.getY());
//	}
//	@Override
//	public void mouseReleased(MouseEvent e) {
//		x = e.getX();
//		y= e.getY();
//	}

}