import acm.program.ConsoleProgram;

public class string47 extends ConsoleProgram {
	public void run() {
		String str = readLine("Enter text: ");
		if(isPallindrom(str)){
			println("it is pallindrom");
		}else{
			println("it is not pallindrom");
		}
	}
//		while(true) {
//		String string = readLine("Enter text :");
//		if(isPallindrom (string)) {
//			println("your number is a pallindrom. ");
//		}else {
//			println("your number is not a pallindrom. ");
//		}
//	}
//	}
//	private boolean isPallindrom(String string) {
//		for (int i = 0; i < string.length() / 2; i++) {
//			if (string.charAt(i) != string.charAt(string.length() - 1 - i)) {
//				return false;
//			}
//		}
//		return true;
//	}

	private boolean isPallindrom(String str) {
		for(int i = 0; i< str.length()/2; i++){
			if(str.charAt(i) != str.charAt(str.length()-1-i)){
				return false;
			}
		}
		return true;
	}
}