import acm.program.ConsoleProgram;

public class string46 extends ConsoleProgram {
	public void run() {
		String text = readLine("Enter text: ");
		println("the most frequent symbol in this text is : " + frequentSymbol(text));
	}

	private char frequentSymbol(String text) {
		char frequentChar = 0;
		int maxCharCount = 0;
		for(int i =0; i<text.length(); i++) {
		int currentCount = symbol(text, text.charAt(i));
		if(currentCount > maxCharCount) {
			maxCharCount = currentCount;
			frequentChar = text.charAt(i);
		}
		}
		return frequentChar;
	}

	private int symbol(String text, char symbolo) {
		int countNum = 0;

		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == symbolo) {
				countNum++;
			}
		}
		return countNum;
	}
}
