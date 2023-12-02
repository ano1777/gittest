import java.util.StringTokenizer;

import acm.program.ConsoleProgram;

public class string50 extends ConsoleProgram {
	
	public void run() {
		int a = readInt();
		int b = reverse(a);
		if (a == b) {
			println("Palindrome");
		} else {
			println("Not a palindrom");
		}
	}

	private int reverse(int a) {
		int c = 0;
		int i = 0;
		while(a > 0) {
			c *= 10;
			c += a % 10;
			a /= 10;
		}
		return c;
	}
}
//	public void run() {
//		String str = readLine();
//		String newStr = addAmount(str);
//		println(newStr);
//	}
//
//	private String addAmount(String str) {
//		String newStr = "";
//		for (int i = 0; i < str.length(); i++) {
//			char ch = str.charAt(i);
//			int amount = countSumbols(str, ch, i);
//			if (amount == 1) {
//				newStr += ch;
//			} else{
//				newStr += newStr + amount + ch;
//				i += amount - 1;
//		}
//		}
//		return newStr;
//	
//	}
//
//	private int countSumbols(String str, char ch, int i) {
//		int count = 0;
//		for (int j = 0; j < str.length(); j++) {
//			if (str.charAt(j) == ch) {
//				count++;
//			} else {
//				break;
//			}
//		}
//		return count;
//	}
//}


// String str = readLine("enter text: ");
// String str2 = reverseWords(str);
// println(str2);
//
// }
//
// private String reverseWords(String str) {
//
// String answer = "";
//
// for (int i = 0; i < str.length(); i++) {
//
// if (str.charAt(i) == ' ') {
//
// String sub1 = str.substring(0, i);
// String sub2 = str.substring(i + 1);
// println(sub1);
// println(sub2);
// answer = sub2 + ' ' + sub1;
//
// }
// }
// return answer;
// }
// }

// String str = readLine("Enter string: ");
// StringTokenizer newtokens = new StringTokenizer(str, " ,?.");
// int count = 0;
// while(newtokens.hasMoreTokens()){
// String newTok = newtokens.nextToken();
// count++;
// }
// println(count);
// }
// }

// String s = readLine("enter text: ");
// String newSt = reversed(s);
// println(simulate(newSt));
// }
//
// private String simulate(String newSt) {
// String answer ="";
// StringTokenizer newTokens = new StringTokenizer(newSt, " ");
// while (newTokens.hasMoreTokens()) {
// String token = newTokens.nextToken();
// String rev = reversed(token);
// answer += rev + " ";
// }
// return answer;
// }
//
// private String reversed(String s) {
// String result = "";
// for (int i = s.length() - 1; i >= 0; i--) {
// char ch = s.charAt(i);
// result += ch;
// }
// return result;
//
// }
// }
