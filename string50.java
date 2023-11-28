import java.util.StringTokenizer;

import acm.program.ConsoleProgram;

public class string50 extends ConsoleProgram {
	public void run() {
		String text = readLine("Enter text to tokenize: ");
		String reversed = reverse(text);
		println(simulateTokens(reversed));
	}

	private String simulateTokens(String text) {
		StringTokenizer tokens = new StringTokenizer(text, " ");
		String answer = "";
		while (tokens.hasMoreTokens()) {
			String newToken = tokens.nextToken();
			String reversed = reverse(newToken);
			answer += reversed + " ";
		}
		return answer;
	}

	private String reverse(String text) {
		String s = "";
		for (int i = text.length() - 1; i >= 0; i--) {
			s += text.charAt(i);
		}
		return s;
	}
}
