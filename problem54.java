import java.util.Arrays;

import acm.program.ConsoleProgram;

public class problem54 extends ConsoleProgram {
	public void run() {
		int n = readInt("Enter num :");

		int maxNum = 0;
		int secondMaxNum = 0;
		for (int i = 1; i < n + 1; i++) {
			int number = readInt("enter number # " + i + " :");
			if (number > maxNum) {
				maxNum = number;
			
		
				if (number > maxNum && number > secondMaxNum) {
					int temp = maxNum;
					maxNum = number;
					secondMaxNum = temp;
						
			
				if(number > secondMaxNum && number < maxNum){
					secondMaxNum = number;
				}
		}
			}
		}
		println(maxNum);
		println(secondMaxNum);
	}
}
