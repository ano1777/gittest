import java.util.StringTokenizer;

import acm.program.ConsoleProgram;

public class string50 extends ConsoleProgram {
	public void run() {
		String text = readLine("Enter text to tokenize: ");
		println(reverse(text));
	}

	private void countTokens(String text) {
		StringTokenizer tokens = new StringTokenizer(text, " ");
		int count = 0;
		while (tokens.hasMoreTokens()) {
			String newToken = tokens.nextToken();
			println( newToken);
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
