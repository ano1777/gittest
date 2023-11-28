import java.util.StringTokenizer;

import acm.program.ConsoleProgram;

public class string50 extends ConsoleProgram {
	public void run() {
		// String str = readLine("Enter string: ");
		// StringTokenizer newtokens = new StringTokenizer(str, " ");
		// while(newtokens.hasMoreTokens()){
		// String newTok = newtokens.nextToken();
		// println(newTok);
		// }
		// }
		String s = readLine("enter text: ");
		String newSt = reversed(s);
		println(simulate(newSt));
	}

	private String simulate(String newSt) {
		String answer ="";
		StringTokenizer newTokens = new StringTokenizer(newSt, " ");
		while (newTokens.hasMoreTokens()) {
			String token = newTokens.nextToken();
			String rev = reversed(token);
			answer += rev + " ";
		}
		return answer;
	}

	private String reversed(String s) {
		String result = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			char ch = s.charAt(i);
			result += ch;
		}
		return result;

	}
}

// String text = readLine("Enter text to tokenize: ");
// String reversed = reverse(text);
// println(simulateTokens(reversed));
// }
//
// private String simulateTokens(String text) {
// StringTokenizer tokens = new StringTokenizer(text, " ");
// String answer = "";
// while (tokens.hasMoreTokens()) {
// String newToken = tokens.nextToken();
// String reversed = reverse(newToken);
// answer += reversed + " ";
// }
// return answer;
// }
//
// private String reverse(String text) {
// String s = "";
// for (int i = text.length() - 1; i >= 0; i--) {
// s += text.charAt(i);
// }
// return s;
