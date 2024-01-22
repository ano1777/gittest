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
		for(int i = 0; i < numList.size() / 2; i ++) {
			int num1 = numList.get(i);
			int num2 = numList.get(numList.size() - 1 - i);
		      numList.set(i, num2); 
			numList.set(numList.size() - 1 - i, num1);
		}
		gotoString(numList);
	
	}

	private void gotoString(ArrayList<Integer> numList) {
		String str = "[";
		for(int i = 0; i < numList.size(); i ++) {
			if(i != numList.size() - 1) {
				str +=  numList.get(i) + ", ";
			}
		}
		str += "]";
		println(str);
		
		}
	
}
