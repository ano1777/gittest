import acm.program.ConsoleProgram;

public class string46 extends ConsoleProgram {
	public void run() {
		String text = readLine("Enter text: ");
		println("the most frequent symbol in this text is : " + frequentSymbol(text));
	}

	private char frequentSymbol(String text) {
		int maxCount =0;
		char mostFrequentChar = 0;
		for (int i=0; i<text.length(); i++){
			int count = symbolCount(text, text.charAt(i));
			if(count >= maxCount){
				maxCount = count;
				mostFrequentChar = text.charAt(i);
			}
		}
		return mostFrequentChar;
	}

	private int symbolCount(String text, char charAt) {
		int countCharNum = 0;
		for(int i=0; i<text.length(); i++) {
		   if(text.charAt(i) == charAt){
			   countCharNum ++;
		   }
		}
		return countCharNum;
	}

	
}
