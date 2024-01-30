import acm.program.ConsoleProgram;

public class finals2022 extends ConsoleProgram {
	public void run() {
		String str = readLine("enter: ");
		println(compressedStr(str));
	}

	// aaaaaddssssiiiii
	private String compressedStr(String str) {
		String newPart1 = "";
		String res = "";

		for (int i = 0; i < str.length() - 1; i++) {
			char ch = str.charAt(i);
			char ch2 = str.charAt(i + 1);
			if (ch == str.length() - 1 && !Character.isDigit(ch)) {
				str += 1;
			}
			if (ch != ch2) {
				String part1 = str.substring(0, i + 1);
				String part2 = str.substring(i + 1);
				int amount = 0;
				for (int j = 0; j < part1.length(); j++) {
					amount++;
				}
				newPart1 = ch + String.valueOf(amount);
				res = newPart1 + part2;

				if (res.length() < str.length()) {
					return str;
				}
			}
		}
		return res;
	}

}
