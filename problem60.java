import java.util.ArrayList;

import acm.program.ConsoleProgram;

//. კონსოლიდან შეგვყავს რიცხვები მანამ სანამ არ შეიყვანთ -1-ს, დაბეჭდეთ შეყვანილი
//რიცხვები შებრუნებული მიმდევრობით.
public class problem60 extends ConsoleProgram {
	private static final int SENTINEL = -1;
	public void run() {
		while (true) {
			int number = readInt("Enter number");
			if(number == SENTINEL) {
				break;
			}
			ArrayList<Integer> numList = new ArrayList<Integer>();
			numList.add(number);
			
			println(numList.toString());
		}
	}

}
