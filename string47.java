import acm.program.ConsoleProgram;

public class string47 extends ConsoleProgram {
	public void run() {
		while(true) {
		String string = readLine("Enter text :");
		if(isPallindrom (string)) {
			println("your number is a pallindrom. ");
		}else {
			println("your number is not a pallindrom. ");
		}
	}
	}
	private boolean isPallindrom(String string) {
		for (int i = 0; i < string.length() / 2; i++) {
			if (string.charAt(i) != string.charAt(string.length() - 1 - i)) {
				return false;
			}

		}
		return true;
	}
}