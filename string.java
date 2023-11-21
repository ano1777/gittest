import acm.program.ConsoleProgram;

public class string extends ConsoleProgram {
	public void run() {
		String text = readLine("Enter text : ");
		char symbol = readLine("Enter symbol : ").charAt(0);

		println("count is  " + countChars(text, symbol));
		// String symbol = readLine("Enter symbol :");
		// char symbolChar = symbol.charAt(0);

	}

	private int countChars(String text, char symbol) {
		int countChar = 0;
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == symbol) {
				countChar++;
			}
		}

		return countChar;
	}
}
