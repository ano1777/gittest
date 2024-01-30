import java.awt.Color;
import java.util.Arrays;

import javax.swing.JButton;

import acm.graphics.GOval;
import acm.program.ConsoleProgram;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class twoBalls extends GraphicsProgram {
	private RandomGenerator rgen;
	private JButton up;
	private JButton down;
	private double vx = 10;
	private double vy = 10;
	GOval oval1;
	GOval oval2;
	private static final int OVAL_SIZE = 60;

	public void init() {
		up = new JButton("up");
		up.addActionListener(this);
		down = new JButton("down");
		down.addActionListener(this);

		addMouseListeners();
		addActionListeners();
	}

	public void run() {
		rgen = RandomGenerator.getInstance();
		oval1 = new GOval(OVAL_SIZE, OVAL_SIZE);
		oval2 = new GOval(OVAL_SIZE, OVAL_SIZE);
		double x = rgen.nextDouble(0, getWidth() - OVAL_SIZE);
		double y = rgen.nextDouble(0, getHeight() - OVAL_SIZE);
		oval1.setFilled(true);
		oval1.setColor(Color.RED);
		add(oval1, x, y);

		double a = rgen.nextDouble(0, getWidth() - OVAL_SIZE);
		double b = rgen.nextDouble(0, getHeight() - OVAL_SIZE);
		oval2.setFilled(true);
		oval2.setColor(Color.BLUE);
		add(oval2, a, b);

		while (true) {
			oval1.move(vx, 0);
			oval1.pause(5);
			oval2.move(0, vy);
			oval2.pause(5);
			if(oval1.getX() >= 0 && oval1.getX() <= getWidth() - oval1.getWidth()) {
				vx = -vx;
			}
			if (oval2.getY() >= 0 && oval2.getY() =< oval1.getHeight()) {
				vy = -vy;
			}
		}
	}
}
// private void badSort(int[] arr) {
// // rgen = RandomGenerator.getInstance();
// //while (!sorted(arr)) {
//
// for(int i = 0; i < arr.length; i ++) {
// for(int )
// }
//
//
//// int a = rgen.nextInt(0, arr.length - 1);
//// int b = rgen.nextInt(0, arr.length - 1);
////
//// int max = Math.max(a, b);
//// int min = Math.min(a, b);
////
//// if (arr[max] < arr[min]) {
//// swap(arr, max, min);
//// }
//
// //}
// }
//
// private void swap(int[] arr, int i, int j) {
// int temp = arr[i];
// arr[i] = arr[j];
// arr[j] = temp;
// }
//
// private boolean sorted(int[] arr) {
// for (int i = 1; i < arr.length; i++) {
// if (arr[i] < arr[i - 1]) {
// return false;
// }
// }
// return true;
// }
