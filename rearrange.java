import java.util.HashMap;

import acm.program.ConsoleProgram;

public class rearrange extends ConsoleProgram {
	HashMap<String, Integer> letters;
	private String word;
	String sent;

	public void run() {
		letters = new HashMap<String, Integer>();
		sent = readLine("enter sentence: ");
		if (sent.contains(" ")) {
			for (int i = 0; i < sent.length(); i++) {
				if (sent.charAt(i) == ' ') {
					word = sent.substring(0, i);
					sent = sent.substring(i + 1);
					letters.put(word, 0);
				}
			}
		} else {
			word = sent;
			letters.put(word, 0);
		}

		// ani --> 3 luka --> 4 niniko --> 6
		for (String word : letters.keySet()) {
			int amount = 0;
			for (int i = 0; i < word.length(); i++) {
				amount++;
			}
			letters.put(word, amount);
		}

		String newSent = "";
		int maxAmount = 0;
		for (String key : letters.keySet()) {
			int  currentAmount = letters.get(key);
			if (currentAmount > maxAmount) {
				maxAmount = currentAmount;
				newSent += " " + key;
			} else {
				newSent = key + " " + newSent; 
			}
		}
		println(newSent);

	}

}
