import java.util.StringTokenizer;

import acm.program.ConsoleProgram;

public class string50 extends ConsoleProgram {

	public void run() {
		String str = readLine();
		String result = readLine();
		for (int i = 1; i < str.length(); i++) {
			String str1 = str.substring(0, i);
			String str2 = str.substring(i);
//			println(str1 + " " + str2);
			println(manipulation(str1, str2, result));
		}
	}

	private boolean manipulation(String str1, String str2, String result) {
		String substracted1 = "";
		String substracted2 = "";
		String last = "";
		for (int i = 0; i < str1.length(); i++) {
			char ch = str1.charAt(i);
			substracted1 = manipulate(str1, ch);

			for (int j = 0; j < str2.length(); j++) {
				char symb = str2.charAt(j);
				substracted2 = manipulate(str2, symb);
				last = substracted1 + substracted2;
				if (last.equals(result)) {
					return true;
				}

			}
		}

		return false;
	}

	private String manipulate(String str1, char ch) {
		String res = "";
		for (int j = 0; j < str1.length(); j++) {
			if (ch != str1.charAt(j)) {
				res += ch;
			}
		}
		println(res);
		return res;
	}
}

// public void run() {
// String str = readLine();
// String newStr = addAmount(str);
// println(newStr);
// }
//
// private String addAmount(String str) {
// String newStr = "";
// for (int i = 0; i < str.length(); i++) {
// char ch = str.charAt(i);
// int amount = countSumbols(str, ch, i);
// if (amount == 1) {
// newStr += ch;
// } else{
// newStr += newStr + amount + ch;
// i += amount - 1;
// }
// }
// return newStr;
//
// }
//
// private int countSumbols(String str, char ch, int i) {
// int count = 0;
// for (int j = 0; j < str.length(); j++) {
// if (str.charAt(j) == ch) {
// count++;
// } else {
// break;
// }
// }
// return count;
// }
// }

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
