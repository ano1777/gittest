import acm.program.ConsoleProgram;

public class string46 extends ConsoleProgram {
	public void run() {
		String str = readLine("Enter text: ");
		println(frequentSymb(str));

	}

	private char frequentSymb(String str) {
		char frequentchar = 0;
		int maxNum = 0;
		for (int i = 0; i < str.length(); i++) {
			int count = countSymbols(str, str.charAt(i));
			if (count > maxNum) {
				maxNum = count;
				frequentchar = str.charAt(i);

			}
		}

		return frequentchar;
	}

	private int countSymbols(String text, char symbol) {
		int count = 0;
		for(int i = 0; i < text.length(); i++){
			if(text.charAt(i)== symbol){
				count++;
			}
		}
		return count;
	
	}
}
