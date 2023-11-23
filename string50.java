import java.util.StringTokenizer;

import acm.program.ConsoleProgram;

public class string50 extends ConsoleProgram {
	public void run() {
		String text = readLine("Enter text to tokenize: ");
		countTokens(text);
	}

	private void countTokens(String text) {
		StringTokenizer tokens = new StringTokenizer(text, " ");
		int count = 0;
		while (tokens.hasMoreTokens()) {
			String newToken = tokens.nextToken();
			count++;
		}
		println("the number of words = " + count);
	}
}
