import acm.program.ConsoleProgram;

public class strijng51 extends ConsoleProgram {
	public void run() {
		String str = readLine(" Enter text : ");
		removeDuplicates(str);
	}
//anhoiselnlo
//hello
	private void removeDuplicates(String str) {
		for (int i= 0; i<str.length(); i++) {
		char ch = str.charAt(i);
		if(isFirstOccurance(str, ch)) {
			
		}
		}
	}

	private boolean isFirstOccurance(String str, char ch) {
		
		return false;
	}

}
