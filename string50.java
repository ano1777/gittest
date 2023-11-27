import java.util.StringTokenizer;

import acm.program.ConsoleProgram;

public class string50 extends ConsoleProgram {
	public void run() {
		String text = readLine("Enter text to tokenize: ");
		String reversed = reverse(text);
		simulateTokens(reversed);
	}

	private void simulateTokens(String text) {
		StringTokenizer tokens = new StringTokenizer(text, " ");
		int count = 0;
		while (tokens.hasMoreTokens()) {
			String newToken = tokens.nextToken();
			String reversed = reverse(newToken);
			println(reversed);
		}
	
	}
	private String reverse(String text) {
		String s = "";
		for(int i = text.length() - 1; i >= 0; i --) {
			s += text.charAt(i);
		}
		return s;
		
	}
	
}
