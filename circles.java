
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
import java.awt.event.MouseEvent;
public class circles extends GraphicsProgram {
	ArrayList<GOval> coins;
	double y1;

	public void run() {
		addCoins();
		addMouseListeners();
	}

	private void addCoins() {
		coins = new ArrayList<GOval>();
		double x = (getWidth() - 11 * 50 - 10 * 10) / 2.0;
		y1 = getHeight() / 2 - 25;
		for (int i = 0; i < 11; i++) {
			GOval oval = new GOval(50, 50);
			oval.setFilled(true);
			oval.setColor(Color.BLACK);
			oval.setFillColor(Color.GRAY);
			double xebi = x + i * (50 + 10);
			add(oval, xebi, y1);
			coins.add(i, oval);
		}
	}

	private void removeCoins(int num) {
		for (int i = 0; i > num; i++) {
			remove(coins.get(coins.size() - 1));
			coins.remove(coins.size() - 1);
		}

	}

	public void mousePressed(MouseEvent e) {
		GObject obj = getElementAt(e.getX(), e.getY());
		int num = -1;
		if (coins.size() > 0 && obj == coins.get(coins.size() - 1)) {
			num = 1;
		} else if (coins.size() > 1 && obj == coins.get(coins.size() - 2)) {
			num = 2;
		} else if (coins.size() > 0 && obj == coins.get(coins.size() - 3)) {
			num = 3;
		} else {
			return;
		}

		removeCoins(num);

	}
}
