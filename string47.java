import acm.program.ConsoleProgram;

public class string47 extends ConsoleProgram {
	public void run() {
		String text = "mariami";
		boolean isPallindrom = isPallindrom(text);
		println(text + "is pallindrom: " + isPallindrom );

	}

	private boolean isPallindrom(String text) {
		for(int i =0; i<text.length() / 2; i++) {
			if(text.charAt(i) != text.charAt(text.length()) - i - 1){
			return false;
		}
		}
		return true;
	
}

}