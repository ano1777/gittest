import acm.program.ConsoleProgram;

public class finals2022 extends ConsoleProgram {
	public void run() {
		String str = readLine("enter: ");
		println(compressedStr(str));
	}

	// aaaaaddssssiiiii
	private String compressedStr(String str) {
	
		String res = "";
		int count = 1;

		for (int i = 1; i < str.length(); i++) {
			char ch = str.charAt(i);
			char ch2 = str.charAt(i - 1);
			res += ch2;
			if (ch2 == ch) {
				count++;
				res += count;
			} else {
				res += count;
				count = 1;
				res += ch;
			}
			if (res.length() > str.length()) {
				return str;
			}
		}
		return res;
	}
}
