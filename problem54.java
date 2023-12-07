import java.util.Arrays;

import acm.program.ConsoleProgram;

public class problem54 extends ConsoleProgram {
	public void run() {
	int  n = readInt("Enter num :");
	int sum = 0;
	for(int i=1; i<n+1; i++) {
		int number = readInt("enter number # " + i + " :");
		
		sum += number;
	}
	println(sum);
	}

}
