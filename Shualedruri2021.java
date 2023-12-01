import java.awt.event.MouseEvent;

import acm.graphics.GLine;
import acm.program.ConsoleProgram;
import acm.program.GraphicsProgram;

public class Shualedruri2021 extends ConsoleProgram {
	public void run() {
		String str = readLine();
		println(lengthOfLastWord(str));
	}

	private int lengthOfLastWord(String s) {
		int n = 0;
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch == ' ') {
				count++;
			}
		}
		for (int j = 0; j < s.length(); j++) {
			if (s.charAt(j) == ' ') {
				count--;
				
				if (count == 0) {
					String lastWord = s.substring(j + 1);
						if (j == s.length() - 1) {
						s = s.substring(0, s.length() - 1);
						}
					n = lastWord.length();
				}
			}
			
		}
		return n;
	}
}

// String haystack = "buts";
// String needle = "sad";
// int str = strStr(haystack, needle);
// println(str);
// }
// public int strStr(String haystack, String needle) {
// int index = haystack.indexOf(needle);
//
// return index;
//
// }

// String a = "iyo arabets rostevan";
// String b = "iyo rets rostevan";
// println(manipulation(a,b));
//
//
// }
//
// private boolean manipulation(String a, String b) {
//
// return true;
// }

// private GLine line;
// int x =0;
// int y = 0;
//
// public void run() {
// x =0;
// y = 0;
// addMouseListeners();
// }
//
// @Override
// public void mousePressed(MouseEvent e) {
// line = new GLine(x, y, e.getX(), e.getY());
// add(line);
//
// }
// @Override
// public void mouseDragged(MouseEvent e) {
// line.setEndPoint(e.getX(), e.getY());
// }
// @Override
// public void mouseReleased(MouseEvent e) {
// x = e.getX();
// y= e.getY();
// }
