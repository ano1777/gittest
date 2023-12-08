import java.util.Arrays;

import acm.program.ConsoleProgram;

public class problem56 extends ConsoleProgram {
	public void run() {
		int[] numbers = {3, 5, 9, 10, 4};
		int length = numbers.length;
		
		for(int i=0; i < length/2; i++) {
			int temp = numbers[i];
			numbers[i] = numbers[length - 1 - i] ;
			numbers[length - 1 - i] = temp;
		}
		
		println(Arrays.toString(numbers));
		
	}

}
