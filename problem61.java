import java.util.ArrayList;

import acm.program.ConsoleProgram;

//61. კონსოლიდან შეგვყავს რიცხვი m და n, შემდეგ n ცალი რიცხვი. პროგრამამ უნდა იპოვოს
//შეყვანილი რიცხვებიდან წყვილი რომელთა ჯამი არის m.
public class problem61 extends ConsoleProgram {
	public void run() {
		int m = readInt("Enter sum: ");
		int n = readInt("Enter the num of entries: ");
		ArrayList<Integer> numList = new  ArrayList<Integer>();
		
		for (int i = 0; i < n; i++) {
			int number = readInt("Enter number: ");
			numList.add(number);
		}
		println(numList.toString());
		
		for(int i = 0; i < numList.size() - 1; i ++) {
			for(int j = i + 1; j < numList.size(); j ++) {
				if ((numList.get(i) + numList.get(j)) == m ) {
					println(numList.get(i) + " " + numList.get(j) );
				} else {
					println("that numbers do not exist");
				}
			}
		}
	}
}
