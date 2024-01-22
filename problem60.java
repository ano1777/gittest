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

			numList.add(number);

		}
	println(numList.toString());
//		for (int i = 0; i < numList.size(); i++) {
			int memorizedNum = numList.get(numList.size() - 1);
			println(memorizedNum);
//			numList.set(numList.size() - i, numList.get(i));
//			numList.set(i, memorizedNum);
//			
		}
		//println(numList.toString());
	

}
