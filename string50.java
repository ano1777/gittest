import java.util.StringTokenizer;

import acm.program.ConsoleProgram;

public class string50 extends ConsoleProgram {
	public void run() {
		String text = readLine("Enter text to tokenize: ");
		countTokens(text);
	}

	private void countTokens (String text) {
		StringTokenizer tokens = new StringTokenizer(text, "i");
		while (tokens.hasMoreTokens()) {
			String newToken = tokens.nextToken();
			println(newToken);
		
		}
	}
}
