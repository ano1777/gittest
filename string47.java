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

	private boolean isPallindrom(String str) {
		for(int i = 0; i< str.length()/2; i++){
			if(str.charAt(i) == str.charAt(str.length()-1-i)){
			return true;
			}
		}
		return false;
	}
}