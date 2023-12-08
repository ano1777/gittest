import java.util.Arrays;

import acm.program.ConsoleProgram;

public class problem56 extends ConsoleProgram {
	int length;
	public void run() {
		int n = readInt();

		int[] numbers = new int[n];
		for (int j = 0; j < n; j++) {
			numbers[j] = readInt("enter numbeer : ");
		}
	
		println(Arrays.toString(numbers));
		 length = numbers.length;
		reverseElements(numbers);

	}

	private void reverseElements(int[] numbers) {

		for (int i = 0; i < length / 2; i++) {
			int temp = numbers[i];
			numbers[i] = numbers[length - 1 - i];
			numbers[length - 1 - i] = temp;
		}

		println(Arrays.toString(numbers));
		
	}

}
