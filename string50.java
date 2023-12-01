import java.util.StringTokenizer;

import acm.program.ConsoleProgram;

public class string50 extends ConsoleProgram {
	public void run() {
		String str = readLine();
		addAmount(str);
		
		
		
		
	}

	private String addAmount(String str) {
		String newStr = "";
		for(int i=0; i < str.length(); i++) {
			char ch = str.charAt(i);
			int amount = countSumbols(str, ch, i);
			 newStr += amount + ch;
			 

}
		
		
		return newStr;
	}

	private int countSumbols(String str, char ch, int i) {
		int count = 0;
		for (int j =0; j < str.length(); j++) {
			if(ch == str.charAt(j)){
				count++;
			}
		}
		return count;
	}
}
//		String str = readLine("enter text: ");
//		String str2 = reverseWords(str);
//		println(str2);
//
//	}
//
//	private String reverseWords(String str) {
//
//		String answer = "";
//
//		for (int i = 0; i < str.length(); i++) {
//
//			if (str.charAt(i) == ' ') {
//
//				String sub1 = str.substring(0, i);
//				String sub2 = str.substring(i + 1);
//				println(sub1);
//				println(sub2);
//				answer = sub2 + ' ' + sub1;
//
//			}
//		}
//		return answer;
//	}
//}

// String str = readLine("Enter string: ");
// StringTokenizer newtokens = new StringTokenizer(str, " ,?.");
// int count = 0;
// 		while(newtokens.hasMoreTokens()){
// 			String newTok = newtokens.nextToken();
// 			count++;
// 		}
// println(count);
// }
//}

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
