import java.awt.event.MouseEvent;

import acm.graphics.GLine;
import acm.program.ConsoleProgram;
import acm.program.GraphicsProgram;

public class Shualedruri2021 extends ConsoleProgram {
	public void run() {

		String a = "iyo arabets rostevan";
		String b = "yo arabts rostvan";
		println(manipulation(a, b));

	}

	private boolean manipulation(String a, String b) {
		for (int i = 0; i < a.length(); i++) {
			String str1 = a.substring(0, i);
			String str2 = a.substring(i);

			if (canManipulate(str1, str2, b)) {
				return true;
			}
		}
		return false;

	}

	private boolean canManipulate(String str1, String str2, String b) {
		for (int i = 0; i < str1.length(); i++) {
			String substracted1 = substractString(str1, str1.charAt(i));
			for (int j = 0; j < str2.length(); j++) {
				String substracted2 = substractString(str2, str2.charAt(j));
			
				String newString = substracted1 + substracted2;
				if (newString.equals(b))
					return true;
			}
		}
		return false;
	}

	private String substractString(String text, char symb) {
		String result = "";
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) != symb) {
				result += text.charAt(i);
			}
		}
		return result;
	}
}

// String str = readLine();
// println(lengthOfLastWord(str));
// }
//
// private int lengthOfLastWord(String s) {
// int n = 0;
// int lastIndOfSpace = s.lastIndexOf(' ');
// if (lastIndOfSpace == s.length() - 1) {
// s = s.substring(0, s.length() - 1);
// lastIndOfSpace = s.lastIndexOf(' ');
// }
// String lastWord = s.substring(lastIndOfSpace + 1);
// n = lastWord.length();
//
//
//
// return n;
// }
// }




