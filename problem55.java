import java.util.Arrays;

import acm.program.ConsoleProgram;

public class problem55 extends ConsoleProgram {
	public void run() {
		int n = readInt();
		int[] numbers = new int[n];
		for (int i = 0; i < n; i++) {
			numbers[i] = readInt("enter number: ");
		}
		println(Arrays.toString(numbers));
		println(isSorted(numbers));
		if (sorted2(numbers)) {
			println("sorted");
		} else {
			println("not sorted");
		}
	}

	private boolean isSorted(int[] numbers) {
		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] < numbers[i - 1]) {
				return false;
			}
		}
		return true;
	}

	private boolean sorted2(int[] numbers) {
		int[] numbersCopy = Arrays.copyOf(numbers, numbers.length);
		Arrays.sort(numbersCopy);

		return Arrays.equals(numbers, numbersCopy);
	}

}
