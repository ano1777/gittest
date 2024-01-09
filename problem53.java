import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

import acm.program.ConsoleProgram;

public class problem53 extends ConsoleProgram {
	String text;

	public void run() {
		text = "";
		try {
			BufferedReader reader = new BufferedReader(
					new FileReader("C:/Users/99559/Desktop/Practice/Practice/problem53.java"));
			while (true) {
				String line = reader.readLine();
				if (line == null) {
					break;
				}
				text += line + '\n';
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
			println("file couldn't be found");

		} catch (IOException e) {
			e.printStackTrace();
			println("other mistake happened");
		}
		println("the number of words are :" + numWords());
		println("the number of characters are :" + numChars());
		println("the number of sentences are :" + numSentence());
		println("number of question marks : " + numQuestMarks());
	}

	private int numSentence() {
		int num = 0;
		StringTokenizer sentence = new StringTokenizer(text, ".?!");
		while (sentence.hasMoreTokens()) {
			sentence.nextToken();
			num++;
		}
		return num;
	}

	private int numQuestMarks() {
		int marks = 0;
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == '?') {
				marks++;
			}
		}
		return marks;
	}

	private int numChars() {
		int numchars = 0;
		 for (int i = 0; i < text.length(); i++) {
		 numchars++;
		 
//			StringTokenizer word = new StringTokenizer(text);
//			while (word.hasMoreTokens()) {
//				String sityva = word.nextToken();
//				numchars += sityva.length();
//			}
		 }
		return numchars;
	}
	private int numWords() {
		int words = 0;
		StringTokenizer wordsTokens = new StringTokenizer(text);
		while (wordsTokens.hasMoreTokens()) {
			wordsTokens.nextToken();
			words++;
		}
		return words;
	}
}
