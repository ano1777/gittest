import java.util.Arrays;

import acm.program.ConsoleProgram;

public class problem54 extends ConsoleProgram {
	int maxIndex = -1;
	public void run() {
		int n = readInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = readInt("enter number: ");
		}

		println("maximum number is: " + maxNuber(arr));
		println("second maximum number: " +secondMax(arr));
	}

	private int secondMax(int[] arr) {
		int secondMax = 0;
		for (int i = 0; i < arr.length; i++) {
			int next = arr[i];
			if (next > secondMax && i != maxIndex) {
				secondMax = next;
			}
		}
		return secondMax;
	}

	private int maxNuber(int[] arr) {
		int maxNum = 0;
		for (int i = 0; i < arr.length; i++) {
			int next = arr[i];
			if (next > maxNum) {
				maxNum = next;
				maxIndex = i;
			}
		}
		return maxNum;
	}
}

// int n = readInt("Enter num :");

// int maxNum = 0;
// int secondMaxNum = 0;
// if (maxNum < secondMaxNum) {
// int temp = maxNum;
// maxNum = secondMaxNum;
// secondMaxNum = temp;
// }
// for (int i = 1; i < n + 1; i++) {
// int number = readInt("enter number # " + i + " :");
// if (number > maxNum) {
// secondMaxNum = maxNum;
// maxNum = number;
// } else if (number > secondMaxNum) {
// secondMaxNum = number;
// }
// }
// println("the biggest number" +maxNum);
// println("the second biggest number" + secondMaxNum);
// }
