import java.util.ArrayList;

import acm.program.ConsoleProgram;

//. კონსოლიდან შეგვყავს რიცხვები მანამ სანამ არ შეიყვანთ -1-ს, დაბეჭდეთ შეყვანილი
//რიცხვები შებრუნებული მიმდევრობით.
public class problem60 extends ConsoleProgram {
	private static final int SENTINEL = -1;

	public void run() {
		ArrayList<Integer> numList = new ArrayList<Integer>();
		while (true) {
			int number = readInt("Enter number");
			if (number == SENTINEL) {
				break;
			}

			numList.add(0,number);

		}
	println(numList.toString());
	
	}
}
