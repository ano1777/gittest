import java.util.HashMap;

import acm.program.ConsoleProgram;
//62. კონსოლიდან შეგვყავს სახელები, მანამ სანამ არ შევიყვანთ ცარიელ სტრინგს. დაბეჭდეთ
//სახელი და მის გასწვრივ რაოდენობა რამდენჯერ შევიყვანეთ ეს სახელი.

public class problem62 extends ConsoleProgram {
	private static final String SENTINEL = "";
	public void run() {
		HashMap<String, Integer> namesList = new HashMap<String, Integer>();
		while(true) {
			String name = readLine("Enter name: ");
			if(name.equals(SENTINEL)) {
				break;
			}
			if(!namesList.containsKey(name)) {
				namesList.put(name, 0);
			}
			int value = namesList.get(name) + 1;
			namesList.put(name, value);
		}
		println(namesList.toString());
	}

}
