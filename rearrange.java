import java.util.HashMap;

import acm.program.ConsoleProgram;

public class rearrange extends ConsoleProgram {
	HashMap<String, Integer> letters;
	private String word = "";
	String sent;

	public void run() {
		letters = new HashMap<String, Integer>();
		sent = readLine("enter sentence: ");
		for (int i = 0; i < sent.length(); i++) {
			if (sent.contains(" ")) {
				char ch = sent.charAt(i);
				if (ch == ' ') {
					word = sent.substring(0, i);
					sent = sent.substring(i + 1);
					letters.put(word, word.length());
					println(sent);
				}
			}else if (!sent.contains(" ")) {
					word = sent;
					letters.put(word, word.length());
				}

			
		}
		println(letters);
		// int maxAmount = 0;
		// String newSent = "";
		// for (String key : letters.keySet()) {
		// int currentAmount = letters.get(key);
		// if (currentAmount > maxAmount) {
		// maxAmount = currentAmount;
		// newSent += " " + key;
		// } else {
		// newSent = key + " " + newSent;
		// }
		// }
		// print(newSent);
	}
}
