import acm.program.ConsoleProgram;

public class string48 extends ConsoleProgram {
	public void run() {
		String newStr = readLine("");
		makeStatisticks(newStr);

	}

	private void makeStatisticks(String newStr) {
		for (int i = 0; i < newStr.length(); i++) {
			char currChar = newStr.charAt(i);

			int countChar = countSymbol(newStr, newStr.charAt(i));
			println(currChar  + " - " + countChar);
		}
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
// String text = "mariami";
// printCharStatics(text);
//
// }
//
// private void printCharStatics(String text) {
// for(int i=0; i<text.length(); i++) {
// int count = countSymbol(text, text.charAt(i));
// if(isFirstOccurance (text, i)){
// int count = countSymbol(text, currCh);
// println(currCh );
// }
// }
//
// }
// private boolean isFirstOccurance(String text, int i) {
//
// return false;
// }
//
// private int countSymbol (String text, char symbol) {
// int symbolCount = 0;
// for(int i = 0; i < text.length(); i++) {
// if(text.charAt(i) ==symbol) {
// symbolCount++; //
// }
// }
// return symbolCount;
// }
