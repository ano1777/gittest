import java.util.HashMap;
import java.util.StringTokenizer;

import acm.program.ConsoleProgram;

public class rearrange extends ConsoleProgram {
	HashMap<String, Integer> letters;

	public void run() {
		letters = new HashMap<String, Integer>();
		String text = readLine();
		println(rearrange(text));

	}

	private String rearrange(String text) {
		StringTokenizer tok = new StringTokenizer(text);
		while (tok.hasMoreTokens()) {
			String part = tok.nextToken();
			letters.put(part, part.length());
		}
		String res = "";
		int tmp = 0;
		for (String part : letters.keySet()) {
			int curr = letters.get(part);
			if (curr > tmp) {
				res += " " + part;
				tmp = curr;
			}
			if (curr <= tmp) {
				part += " " + res;
			}
//			if(curr == tmp){
//				
//			}
		}
		println(res);
		

		return res;
	}

	// letters = new HashMap<String, Integer>();
	// sent = readLine("enter sentence: ");
	// for (int i = 0; i < sent.length(); i++) {
	// if (sent.contains(" ")) {
	// char ch = sent.charAt(i);
	// if (ch == ' ') {
	// word = sent.substring(0, i);
	//
	// letters.put(word, word.length());
	// sent = sent.substring(i + 1);
	// println(sent);
	// }
	// }else {
	// letters.put(sent, sent.length());
	// }
	// }
	// println(letters);
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
