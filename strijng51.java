import acm.program.ConsoleProgram;

public class strijng51 extends ConsoleProgram {
	public void run() {
		String str = readLine(" Enter text : ");
		String str2 = readLine("enter text");
		println(sameChars(str, str2));

		// removeDuplicates(str);
	}

	private char sameChars(String str, String str2) {
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			for(int j = 0; j<str2.length(); j++) {
				if(ch == str2.charAt(j)){
					println(ch);
				}
			}
		}

		return null;
	}
	// anhoiselnlo
	// hello
	// private void removeDuplicates(String str) {
	// for (int i= 0; i<str.length(); i++) {
	// char ch = str.charAt(i);
	// if(isFirstOccurance(str, ch)) {
	//
	// }
	// }
	// }
	//
	// private boolean isFirstOccurance(String str, char ch) {
	//
	// return false;
	// }

}
