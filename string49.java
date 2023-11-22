import acm.program.ConsoleProgram;

public class string49 extends ConsoleProgram {
	public void run() {
		String numStr = "1234";
		int num = stringToInt(numStr);
	println(num);
	}

	private int stringToInt(String numStr) {
		int num = 0;
		for (int i = 0; i < numStr.length(); i++) {
			int currNum = charConvertToDig(numStr, numStr.charAt(i));
			num = num*10 + currNum;
		}
		return num;
	}

	private int charConvertToDig(String numStr, char ch) {
		int integer = ch - '0';
		return integer;
	}

}
