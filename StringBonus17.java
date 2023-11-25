import acm.program.ConsoleProgram;

public class StringBonus17 extends ConsoleProgram {
	public void run() {
		String str = readLine("Enter text : ");
		String str2 = readLine("Enter text : ");
		println(checkIfItsAnagram(str, str2));

	}

	private boolean checkIfItsAnagram(String str, String str2) {
		for (int i = 0; i < str.length(); i++) {
			for (int j = 0; j < str2.length(); j++) {
				if (str.charAt(i) != str2.charAt(j)) {
					return false;
				}else{
					return true;
				}
			}
		}

		return true;
	}

}
