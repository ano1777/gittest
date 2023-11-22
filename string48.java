import acm.program.ConsoleProgram;

public class string48 extends ConsoleProgram {
	public void run() {
		String newStr = "annnia";
		makeStatisticks(newStr);

	}

	private void makeStatisticks(String newStr) {
		for (int i = 0; i < newStr.length(); i++) {
			char currChar = newStr.charAt(i);
			if (firstAppearance(newStr, i)) {
				int countChar = countSymbol(newStr, newStr.charAt(i));
				println(currChar + " - " + countChar);
			}
		}
	}

	private boolean firstAppearance(String newStr, int i) {
		char ch = newStr.charAt(i);
		int firstIndex = newStr.indexOf(ch);
		return firstIndex == i;
	}

	

	private int countSymbol(String newStr, char symbol) {
		int symbolCount = 0;
		for (int i = 0; i < newStr.length(); i++) {
			if (newStr.charAt(i) == symbol) {
				symbolCount++; // symbolCount = symbolCount + 1;
			}
		}
		return symbolCount;
	}

}