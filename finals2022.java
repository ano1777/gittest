import acm.program.ConsoleProgram;

public class finals2022 extends ConsoleProgram {
	public void run() {
		String str = readLine("enter: ");
		println(compressedStr(str));
	}

	// aaaaaddssssiiiii
	private String compressedStr(String str) {
		if (str.length() == 0) {
			return "";
		}
		String res = "";
		int count = 1;
		res = "" + str.charAt(0);
		for (int i = 1; i < str.length(); i++) {
			char ch = str.charAt(i);
			char ch2 = str.charAt(i - 1);
			if (ch2 == ch) {
				count++;
			} else {
				res += count;
				count = 1;
				res += ch;
			}
		}
		res += count;
		if (res.length() > str.length()) {
			return str;
		}

		else
			return res;
	}
}
