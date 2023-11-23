import java.util.StringTokenizer;

import acm.program.ConsoleProgram;

public class string50 extends ConsoleProgram {
	public void run() {
		String text = readLine("Enter text to tokenize: ");
		println("tokens: ");
		printTokens(text);

	
	}

	private void printTokens(String text) {
		StringTokenizer tokens = new StringTokenizer(text, "i");
		
		
	}
	
}
