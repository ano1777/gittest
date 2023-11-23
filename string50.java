import java.util.StringTokenizer;

import acm.program.ConsoleProgram;

public class string50 extends ConsoleProgram {
	public void run() {
		String text = readLine("Enter text to tokenize: ");
		printTokens(text);
		

	
	}

	private void printTokens(String text) {
		StringTokenizer tokens = new StringTokenizer(text, "i");
		int count = 0;
		while(tokens.hasMoreTokens()){
		count++;
	}
		println(count);
	}
	
}
