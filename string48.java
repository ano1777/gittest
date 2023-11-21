import acm.program.ConsoleProgram;

public class string48 extends ConsoleProgram {
	public void run() {
		String text = "mariami";
		printCharStatics(text);

	}

	private void printCharStatics(String text) {
		for(int i=0; i<text.length(); i++) {
			int count = countSymbol(text, text.charAt(i));
			if(isFirstOccurance (text, i)){
				int count = countSymbol(text, currCh);
				println(currCh );
			}
		}
		
	}
	private boolean isFirstOccurance(String text, int i) {
		
		return false;
	}

	private int countSymbol (String text, char symbol) {
		int symbolCount = 0;
		for(int i = 0; i < text.length(); i++) {
			if(text.charAt(i) ==symbol) {
				symbolCount++; //
			}
		}
		return symbolCount;
	}

}
