import java.util.Arrays;

import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

public class concsolepr extends ConsoleProgram {
	private RandomGenerator rgen;

	public void run() {
		String text = readLine();
		int[] arr = { 1, 5 };
		addSpaces(text, arr);
		println(text);
		// int[] arr = {2, 7, 3, 1, 9, 8, 5, 20, 19};
		// println(Arrays.toString(arr));
		// badSort(arr);
		// println(Arrays.toString(arr));
	}

	private void addSpaces(String str, int[] arr) {
		String ne = "";
		for (int j = 0; j < arr.length; j++) {
			for (int i = 0; i < str.length(); i ++) {
				if (i == arr[j]) {
					String firstPart = str.substring(0, i);
					String secondPart = str.substring(i);
					ne += firstPart + "  " + secondPart;
				}
			}
		}
	}

	// private void badSort(int[] arr) {
	// // rgen = RandomGenerator.getInstance();
	// //while (!sorted(arr)) {
	//
	// for(int i = 0; i < arr.length; i ++) {
	// for(int )
	// }
	//
	//
	//// int a = rgen.nextInt(0, arr.length - 1);
	//// int b = rgen.nextInt(0, arr.length - 1);
	////
	//// int max = Math.max(a, b);
	//// int min = Math.min(a, b);
	////
	//// if (arr[max] < arr[min]) {
	//// swap(arr, max, min);
	//// }
	//
	// //}
	// }
	//
	// private void swap(int[] arr, int i, int j) {
	// int temp = arr[i];
	// arr[i] = arr[j];
	// arr[j] = temp;
	// }
	//
	// private boolean sorted(int[] arr) {
	// for (int i = 1; i < arr.length; i++) {
	// if (arr[i] < arr[i - 1]) {
	// return false;
	// }
	// }
	// return true;
	// }
}
