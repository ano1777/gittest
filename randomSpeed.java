import acm.program.ConsoleProgram;

public class randomSpeed extends ConsoleProgram {
	public void run() {
		String first = readLine();
		String sec = readLine();
		println(isAnagram(first, sec));
	}

	private boolean isAnagram(String first, String sec) {

		int num1 = 0;
		int num2 = 0;
		if (first.length() != sec.length())
			return false;
		else
			for (int i = 0; i < first.length(); i++) {
				char symb = first.charAt(i);
				num1 += (int) symb;
			}

		for (int j = 0; j < sec.length(); j++) {
			char cha = sec.charAt(j);
			num2 += (int) cha;
		}
		if (num1 != num2) {
			return false;
		}
		return true;
	}

	// private int countChars(String text, char ch) {
	// int number = 0;
	//
	// for (int i = 0; i < text.length(); i++) {
	// if(ch == text.charAt(i)){
	// number ++;
	// }
	//
	// }
	// return number;
	// }
}
