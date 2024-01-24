
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

import java.awt.Color;
import java.awt.event.*;
import java.util.ArrayList;

public class circles extends GraphicsProgram {
	ArrayList<GOval> ovals;
	double y1;

	public void run() {
		addCoins();
		addMouseListeners();
	}

	private void addCoins() {
		ovals = new ArrayList<GOval>();
		double x = (getWidth() - 11 * 50 - 10 * 10) / 2.0;
		y1 = getHeight() / 2 - 25;
		for (int i = 0; i < 11; i++) {
			GOval oval = new GOval(50, 50);
			oval.setFilled(true);
			oval.setColor(Color.BLACK);
			oval.setFillColor(Color.GRAY);
			double xebi = x + i * (50 + 10);
			add(oval, xebi, y1);
			ovals.add(i, oval);
		}
	}

	public void mouseClicked(MouseEvent e) {
		double x = e.getX();
		double y = e.getY();
		GObject obj = getElementAt(x, y);
		int num = -1;
		if (obj == null) {
			return;
		} else if (ovals.size() > 0 && obj == ovals.get(ovals.size() - 1)) {
			num = 1;
			removeCoins(num);
//			remove(obj);
			//ovals.remove(ovals.size() - 1);
			System.out.println(ovals);
		} else if (ovals.size() > 1 && obj == ovals.get(ovals.size() - 2)) {
			num = 2;
			removeCoins(num);
//			remove(obj);
//			remove(getElementAt(obj.getX() + 60, y1));
//			ovals.remove(ovals.size() - 2);
//			ovals.remove(ovals.size() - 1);
			System.out.println(ovals);
		} else if (ovals.size() > 2 && obj == ovals.get(ovals.size() - 3)) {
			num = 3;
			removeCoins(num);
//			remove(getElementAt(obj.getX() + 60, y1));
//			remove(getElementAt(obj.getX() + 120, y1));
//			ovals.remove(ovals.size() - 3);
//			ovals.remove(ovals.size() - 2);
//			ovals.remove(ovals.size() - 1);
			System.out.println(ovals);
		}
	
	}

	
	private void removeCoins(int num) {
		for(int i = 0; i > num ; i ++){
		    remove(ovals.get(ovals.size()- i));
			ovals.remove(ovals.size() - 1);
	    }

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
